package scripts.UniversalWoodcutter.tasks;

import org.tribot.api.Clicking;
import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.Camera;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.Objects;
import org.tribot.api2007.Player;
import org.tribot.api2007.Walking;
import org.tribot.api2007.types.RSObject;

import scripts.UniversalWoodcutter.data.Vars;
import scripts.UniversalWoodcutter.framework.AbstractTask;
import scripts.UniversalWoodcutter.utility.Antiban;
import scripts.UniversalWoodcutter.utility.ScriptUtil;

/**
 * 
 * @author Einstein
 *
 *
 */
public class Woodcutting implements AbstractTask {
	
	// Woodcutting statistics; used in ABC2
	private long lastWoodcuttingWaitTime;
	private long averageWoodcuttingWaitTime;
	private long totalWoodcuttingWaitTime;
	private long totalWoodcuttingInstances;
	
	private RSObject target;

	/**
	 * Updates the variables used in ABC2
	 * 
	 * Prints them to the console if the user selected 'print debug'
	 */
	private void updateWoodcuttingStatistics(long startedWoodcutting) {
		lastWoodcuttingWaitTime = System.currentTimeMillis() - startedWoodcutting;
		totalWoodcuttingInstances++;
		totalWoodcuttingWaitTime+=lastWoodcuttingWaitTime;
		averageWoodcuttingWaitTime = totalWoodcuttingWaitTime / totalWoodcuttingInstances;

		if(!Vars.get().printDebug) return;
		General.println("Player stopped woodcutting!___________________________________________________");
		General.println("Last woodcutting wait time: "    + lastWoodcuttingWaitTime    / 1000 + " seconds");
		General.println("Total woodcutting instances: "   + totalWoodcuttingInstances                     );
		General.println("Total woodcutting wait time: "   + totalWoodcuttingWaitTime   / 1000 + " seconds");
		General.println("Average woodcutting wait time: " + averageWoodcuttingWaitTime / 1000 + " seconds");
	}
	
	@Override
	public String info() {
		return "Woodcutting task";
	}

	@Override
	public boolean shouldExecute() {
		return !Inventory.isFull() && Vars.get().woodcuttingArea.contains(Player.getPosition()) && !ScriptUtil.findNest();
	}

	@Override
	public void execute() {
		
		// if the player is woodcutting
		if (Player.getAnimation() != -1) {
			
			long startedWoodcutting = System.currentTimeMillis();
						
			// while the player is woodcutting,
			while (Player.getAnimation() != -1) { 
				// Do the following:
				General.sleep(300);
				Antiban.get().executeHoverOrMenuOpen(target);
				Antiban.get().resolveTimedActions();
			} // end while woodcutting
			
			// The player has just stopped woodcutting. Do the following:
			Antiban.get().setShouldMoveToAnticipated(Vars.get().selectedTree);
			updateWoodcuttingStatistics(startedWoodcutting);
			Antiban.get().generateAndSleep((int)lastWoodcuttingWaitTime);
		}// end if woodcutting
		
		// Else if the player is not woodcutting:
		
		// If the bot successfully clicked a tree,
		if (findAndClickTree()) {
			// Do the following:
			Antiban.get().setHoverAndMenuOpenBooleans();
			Antiban.get().generateSupportingTrackerInfo((int)averageWoodcuttingWaitTime);
			waitToStartAnimating();
		}
		
	}
	
	private boolean findAndClickTree() {
		
		RSObject [] trees = Objects.findNearest(10, Vars.get().selectedTree);
		
		// If no tree is available
		if (trees == null || trees.length == 0) {
			
			General.println("No tree was found");
			Antiban.get().executeMoveToAnticipated();
			long startIdleTime = System.currentTimeMillis();
			
			// While no trees are available
			while(trees == null || trees.length == 0) {
				// Do the following:
				trees = Objects.findNearest(10, Vars.get().selectedTree); // check for trees
				if (!Player.isMoving())
					Antiban.get().resolveTimedActions();	
			} // end while
			
			// A tree has just appeared: generate and sleep a reaction time
			long stopIdleTime = System.currentTimeMillis();
			General.println("Bot waited " + (int) ( (stopIdleTime - startIdleTime) / 1000) + " seconds for the tree to appear.");
			Antiban.get().generateAndSleep((int)(stopIdleTime - startIdleTime));
		}
		
		target = Antiban.get().getNextTarget(trees);
								
		// If tree is not on screen: move closer, rotate camera
		if (!target.isOnScreen()) {
			General.println("Target is not on screen");
			Walking.blindWalkTo(target.getPosition());
			Camera.turnToTile(target.getPosition());
		}
		
		// If successfully clicked tree: return true
		if (Clicking.click("Chop down", target)) {	
			return true;
		}
		
		return false;
	}

	private void waitToStartAnimating() {	
		// Wait to stop walking
		Timing.waitCondition(new Condition() {
			@Override
			public boolean active() {
				General.sleep(300);
				return !Player.isMoving();
			}
		}, General.random(4000, 6000));
		
		//Wait to start animating
		Timing.waitCondition(new Condition() {
			@Override
			public boolean active() {
				General.sleep(300);
				return Player.getAnimation() != -1;
			}
		}, General.random(2000, 4000));
	}

}