package scripts.UniversalWoodcutter.tasks;

import static scripts.UniversalWoodcutter.data.Constants.AXES;

import org.tribot.api2007.Banking;
import org.tribot.api2007.Inventory;

import scripts.UniversalWoodcutter.framework.AbstractTask;
/**
 * 
 * @author Einstein
 *
 *
 */
public class Bank implements AbstractTask {

	@Override
	public String info() {
		return "Banking";
	}

	@Override
	public boolean shouldExecute() {
		return Inventory.isFull()  && Banking.isInBank();
	}

	@Override
	public void execute() {
		if (!Banking.isBankScreenOpen())
			Banking.openBank();
		else
			Banking.depositAllExcept(AXES);
	}

}