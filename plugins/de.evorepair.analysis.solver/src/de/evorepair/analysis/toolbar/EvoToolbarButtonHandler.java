package de.evorepair.analysis.toolbar;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.evorepair.analysis.solver.EvoSolver;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver = new EvoSolver();
	
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
       // solver.solve();
        
        return null;
    }
    
    @Override
    public boolean isEnabled() {
    	return true;
    }

    
}
