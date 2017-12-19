package scripts.UniversalWoodcutter.utility;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

import org.tribot.api.General;
import org.tribot.api2007.Player;
import org.tribot.api2007.Skills;
import org.tribot.api2007.types.RSArea;

import scripts.UniversalWoodcutter.data.Vars;
/**
 * 
 * @author Einstein
 *
 *
 */
public class DataUtil {
	
	/**
	 * Gets image from the web.
	 * 
	 * @param url of the image
	 * @return Image or null if failed.
	 */
	public static Image getImage(String url) {
		try {
			return ImageIO.read(new URL(url));
		} catch (IOException e) {
			General.println("Unable to load image!");
		}
		return null;
	}

	/**
	 * Gets the price of specified items. RSBuddy API.
	 * 
	 * @param id of item
	 * @return price of item
	 */
	public static int getPrice(int id) {
		try {
			URL url = new URL("http://api.rsbuddy.com/grandExchange?a=guidePrice&i=" + id);
			URLConnection con = url.openConnection();
			con.setUseCaches(true);
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String[] data = br.readLine().replace("{", "").replace("}", "").split(",");
			return Integer.parseInt(data[0].split(":")[1]);
		} catch (Exception e) {
			General.println("Unable to load prices!");
		}
		return -1;
	}
	
	/**
	 * Sets the woodcutting area
	 */
	public static void setWoodcuttingArea() {
		Vars.get().playerTile = Player.getPosition();
		Vars.get().woodcuttingArea = new RSArea(Vars.get().playerTile, Vars.get().radius);
	}
	
	/**
	 * Decides what happened based on received string and updates variables accordingly.
	 * 
	 * @param string to interpret
	 */
	public static void interpretString(String string) {
		
		// Nest listener (ironman account support)
		if(string.contains("nest falls out of the tree"))
			Vars.get().nestFalls = true;
		
		// Level counter
		if (string.contains("Congratulations, you've just advanced your Woodcutting level.")) {
			Vars.get().levels++;
		}
		// XP & profit trigger should also be log counter
		if (string.contains("You get")) {
			updateProfit();
			updateXP();
		}
	}

	/**
	 * Only calculates the profit if the bot is banking the logs.
	 */
	public static void updateProfit() {
		if (!Vars.get().bankLogs) {
			Vars.get().profit = "Drop logs";
			return;
		}
		int profit = Vars.get().logsPrice * Vars.get().logsCount;
		Vars.get().profit = Integer.toString(profit / 1000) + " k";
	}

	/**
	 * Updates the woodcutting xp.
	 */
	public static void updateXP() {
		long gainedXPLong = Skills.getXP(Skills.SKILLS.WOODCUTTING) - Vars.get().startingXP;
		Vars.get().xp = Integer.toString((int) gainedXPLong / 1000) + " k";
	}
	
}