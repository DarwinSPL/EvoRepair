package de.evorepair.analysis.solver;

import java.util.Date;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.search.strategy.Search;
import org.chocosolver.solver.variables.BoolVar;

import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoVariableType;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAnd;
import de.evorepair.logic.evofirstorderlogic.EvoBiconditional;
import de.evorepair.logic.evofirstorderlogic.EvoFeatureType;
import de.evorepair.logic.evofirstorderlogic.EvoImplication;
import de.evorepair.logic.evofirstorderlogic.EvoNot;
import de.evorepair.logic.evofirstorderlogic.EvoOr;
import de.evorepair.logic.evofirstorderlogic.EvoVariableTerm;
import de.evorepair.logic.evofirstorderlogic.EvoXOr;
import eu.hyvar.evolution.util.HyEvolutionUtil;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.HyFeatureType;

public class EvoSolver {
	/*
	ISolver solver;

	public boolean isSolvable(EvoAnomaly anomaly){
		for(EvoOperation operation : anomaly.getTable().getTriggeringOperations()){
			for(EvoVariable variable : operation.getVariables()){

			}
		}

		if(term instanceof EvoAnd){
			EvoAnd and = (EvoAnd)term;
			isSolvable(and.getLeftElement());
			isSolvable(and.getRightElement());
		}

		return true;
	}
	 */

	private HyFeatureType getFeatureType(HyFeature feature, Date date){
		return HyEvolutionUtil.getValidTemporalElement(feature.getTypes(), date);
	}
	public boolean determineValueOfFeatureTypeOperation(EvoFeatureType operation, HyFeature oldFeature){
		Date date = new Date();

		for(EvoVariableTerm variable : operation.getVariables()){
			HyFeature feature = null;
			if(variable.getType() == EvoVariableType.EVO_TARGET){
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)variable.getVariable();
				feature = featureVariable.getFeature();
			}else if(variable.getType() == EvoVariableType.EVO_SOURCE){
				feature = oldFeature;
			}
			
			if(feature != null){
				if(getFeatureType(oldFeature, date).getType() != operation.getType())
					return false;
			}else{ 
				System.err.println("Error: feature in EvoVariableType operation could not be determined.");
				return false;
			}
			
		}

		return true;
	}
	
	Model model;

	private LogOp solveTerm(EvoAbstractTerm term){
		if(term instanceof EvoAnd){
			EvoAnd andTerm = (EvoAnd)term;
			return LogOp.and(solveTerm(andTerm.getLeftElement()),
					  solveTerm(andTerm.getRightElement()));
		}else if(term instanceof EvoOr){
			EvoOr evoOr = (EvoOr)term;
			return LogOp.or(solveTerm(evoOr.getLeftElement()),
					  solveTerm(evoOr.getRightElement()));			
		}else if(term instanceof EvoXOr){
			EvoXOr xorTerm = (EvoXOr)term;
			return LogOp.xor(solveTerm(xorTerm.getLeftElement()),
					  solveTerm(xorTerm.getRightElement()));
		}else if(term instanceof EvoNot){
			
		}else if(term instanceof EvoImplication){
			EvoImplication implicationTerm = (EvoImplication)term;
			return LogOp.implies(solveTerm(implicationTerm.getLeftElement()), 
						  solveTerm(implicationTerm.getRightElement()));
		}else if(term instanceof EvoBiconditional){
			EvoBiconditional biconditionalTerm = (EvoBiconditional)term;
			return LogOp.ifOnlyIf(solveTerm(biconditionalTerm.getLeftElement()), 
						   solveTerm(biconditionalTerm.getRightElement()));
		}
		if(term instanceof EvoFeatureType){
			EvoFeatureType featureTypeTerm = (EvoFeatureType)term;
			
			model.boolVar("ft_"+(new Date()), determineValueOfFeatureTypeOperation(featureTypeTerm, null));
		}
		
		return null;
	}
	public void solve(){
		Model model = new Model("");

		BoolVar var1 = model.boolVar("f0", false);
		BoolVar var2 = model.boolVar("f1", false);

		//model.boolVar("featureType", determineValueOfFeatureTypeOperation())
		model.addClauses(LogOp.or(var1, var2));
		//model.addClauses(LogOp.implies(arg0, arg1))
		//model.addCl
		//model.addConstraint(Choco.reifiedConstraint(b, Choco.eq(x,y), Choco.TRUE)).reify();


		Solver solver = model.getSolver();
		solver.setSearch(Search.defaultSearch(model));
		if(solver.solve()){
			System.out.println(":)");
		}else{
			System.err.println(":(");
		}
	}

	/*
	public void solve(){
		DependencyHelper<String, String> dependencyHelper = new DependencyHelper(SolverFactory.newDefault());


		try {
			//dependencyHelper.implication("A1", "A2", "A3").implies("A1").and("A4");
			dependencyHelper.or("A1", "A2").implies("A1");
		} catch (ContradictionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Before get a solution it must be checked

		try {
			if(dependencyHelper.hasASolution()){
				IVec<String> solution = dependencyHelper.getSolution();
				System.out.println("Congratulations, your equation has a solution : "+solution.toString());
			}else{
				System.err.println("No solution available :'(");
			}
		} catch (TimeoutException e) {
			System.err.println("Solver exceeds maximum calculation time");
		}
	}
	 */
}
