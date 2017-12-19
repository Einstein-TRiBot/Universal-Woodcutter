package scripts.UniversalWoodcutter.tasks;

import org.tribot.api2007.Banking;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.WebWalking;

import scripts.UniversalWoodcutter.data.Vars;
import scripts.UniversalWoodcutter.framework.AbstractTask;
/**
 * 
 * @author Einstein
 *
 *
 */
public class WalkToBank implements AbstractTask {

	@Override
	public String info() {
		return "Walking to bank";
	}

	@Override
	public boolean shouldExecute() {
		return Vars.get().bankLogs && Inventory.isFull() && !Banking.isInBank();
	}

	@Override
	public void execute() {
		WebWalking.walkToBank();
	}

}