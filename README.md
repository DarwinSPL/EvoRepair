  _____            ____                  _      
 | ____|_   _____ |  _ \ ___ _ __   __ _(_)_ __ 
 |  _| \ \ / / _ \| |_) / _ \ '_ \ / _` | | '__|
 | |___ \ V / (_) |  _ <  __/ |_) | (_| | | |   
 |_____| \_/ \___/|_| \_\___| .__/ \__,_|_|_|   
                            |_|                 

==============================================================
Readme
==============================================================
1. About
==============================================================
EvoRepair is a framework to define anomalies and corresponding repair solutions within evolving software product lines. It strongly depends on DarwinSPL (https://github.com/DarwinSPL/DarwinSPL).
==============================================================
2. Installation
==============================================================
1.) Import all projects to your Eclipse workspace.
2.) Locate the "de.evorepair.eclipse.installation" project.
3.) Go to "src" -> "de.evorepair.eclipse.installation". You'll find a file named "InstallEvoRepair.mwe2".
4.) Right click on that file and select "Run As" -> MWE2 Workflow.
5.) Wait until the script finish its job
6.) Run new Eclipse instance and enjoy working with EvoRepair.

==============================================================
3. Troubleshooting
==============================================================
In case the MWE2 Workflow fails:
- Make sure that you have Xtext and EMF installed within Eclipse
- Check if the following projects have an empty folder called 'src-gen':
  1.) de.evorepair.logic.dsl
  2.) de.evorepair.evolution.variable.dsl
  3.) de.evorepair.evolution.operation.dsl
  4.) de.evorepair.feature.expression.dsl
  5.) de.evorepair.feature.mapping.dsl
  6.) de.evorepair.feature.mapping.repair.dsl
  7.) de.evorepair.guidance.dsl
- Run the MWE2 workflow in de.evorepair.logic.dsl > "src" "GeneratoeEvoLogidDsl.mwe2" seperately and try run the
  installation file afterwards.