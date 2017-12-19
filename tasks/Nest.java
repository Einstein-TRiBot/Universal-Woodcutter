package scripts.UniversalWoodcutter.tasks;

import org.tribot.api.Clicking;
import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.GroundItems;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.types.RSGroundItem;

import scripts.UniversalWoodcutter.data.Vars;
import scripts.UniversalWoodcutter.framework.AbstractTask;
import scripts.UniversalWoodcutter.utility.ScriptUtil;

/**
 * 
 * @author Einstein
 *
 *
 */
public class Nest implements AbstractTask {

	@Override
	public String info() {
		return "Pick up nest task";
	}

	@Override
	public boolean shouldExecute() {
		return ScriptUtil.findNest();
	}

	@Override
	public void execute() {
		RSGroundItem [] nest = GroundItems.findNearest("Bird nest");
		if(nest.length == 0)
			return;
		if(Clicking.click("Take", nest[0])) {
			int i = Inventory.getCount("Bird nest");
			Timing.waitCondition(new Condition() {
				@Override
				public boolean active() {
					General.sleep(300);
					return  Inventory.getCount("Bird nest") > i;
				}
			}, General.random(5000, 8000));
			Vars.get().nestFalls  = false;
		}
	}

}