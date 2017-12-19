package scripts.UniversalWoodcutter.utility;

import static scripts.UniversalWoodcutter.data.Constants.AXES;

import org.tribot.api2007.Equipment;
import org.tribot.api2007.GroundItems;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.types.RSGroundItem;

import scripts.UniversalWoodcutter.data.Vars;
/**
 * 
 * @author Einstein
 *
 *
 */
public final class ScriptUtil {
	
	/**
	 * @return true if player has any axe in inventory/equiped, false otherwise
	 */
	public static boolean hasAxe() {
		return Inventory.getCount(AXES) > 0 || Equipment.find(AXES).length > 0;
	}
	
	/**
	 * Searches the ground for bird nests. Ironman account support.
	 * 
	 * Only notifies the bot if:
	 *   - the script is banking the logs (not dropping)
	 *   - user selected 'pick up nest'
	 * 
	 * @return true if found nest and both conditions are met
	 */
	public static boolean findNest() {
		if (!Vars.get().bankLogs || !Vars.get().pickUpNest)
			return false;
		if (Vars.get().ironMan)
			if (!Vars.get().nestFalls)
				return false;
		RSGroundItem[] nest = GroundItems.findNearest("Bird nest");
		if (nest.length == 0)
			return false;
		return true;
	}
	
}