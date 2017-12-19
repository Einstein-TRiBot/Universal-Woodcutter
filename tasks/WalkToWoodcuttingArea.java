package scripts.UniversalWoodcutter.tasks;

import org.tribot.api2007.Inventory;
import org.tribot.api2007.Player;
import org.tribot.api2007.WebWalking;

import scripts.UniversalWoodcutter.data.Vars;
import scripts.UniversalWoodcutter.framework.AbstractTask;
/**
 * 
 * @author Einstein
 *
 *
 */
public class WalkToWoodcuttingArea implements AbstractTask {

	@Override
	public String info() {
		return "Walking to woodcutting area.";
	}

	@Override
	public boolean shouldExecute() {
		return !Inventory.isFull() && !Vars.get().woodcuttingArea.contains(Player.getPosition()); 
	}

	@Override
	public void execute() {
		WebWalking.walkTo(Vars.get().woodcuttingArea.getRandomTile());
	}

}