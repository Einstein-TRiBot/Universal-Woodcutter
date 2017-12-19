package scripts.UniversalWoodcutter.tasks;

import static scripts.UniversalWoodcutter.data.Constants.AXES;

import org.tribot.api2007.Inventory;

import scripts.UniversalWoodcutter.framework.AbstractTask;
/**
 * 
 * @author Einstein
 *
 *
 */
public class Drop implements AbstractTask {

	@Override
	public String info() {
		return "Dropping";
	}

	@Override
	public boolean shouldExecute() {
		return Inventory.isFull();
	}

	@Override
	public void execute() {
		Inventory.dropAllExcept(AXES);
	}

}