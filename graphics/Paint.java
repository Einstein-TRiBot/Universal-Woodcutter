package scripts.UniversalWoodcutter.graphics;

import static scripts.UniversalWoodcutter.data.Constants.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

import org.tribot.api2007.Login;
import org.tribot.api2007.Player;
import org.tribot.api2007.Projection;
import org.tribot.api2007.types.RSTile;

import scripts.UniversalWoodcutter.data.Vars;
import scripts.UniversalWoodcutter.utility.DataUtil;

/**
 * 
 * @author Einstein
 *
 *
 */
public class Paint {

	// Instance manipulation
	private Paint() {}
	private static final Paint PAINT = new Paint();
	public static Paint get() {	return PAINT; }

	// While user sets up the GUI
	public void selectAreaGUI(Graphics g) {
		DataUtil.setWoodcuttingArea();
		g.setColor(Color.YELLOW);
		List<Polygon> polyList = new ArrayList<Polygon>();
		for (RSTile tile : Vars.get().woodcuttingArea.getAllTiles())
			if (tile.isOnScreen())
				polyList.add(Projection.getTileBoundsPoly(tile, 0));
		for (Polygon poly : polyList)
			g.drawPolygon(poly);
	}

	public void paint(Graphics g) {
		// Only paint if in game
		if (Login.getLoginState() != Login.STATE.INGAME)
			return;

		// Woodcutting area (only paint while player is moving)
		if (Player.isMoving()) {
			g.setColor(Color.YELLOW);
			List<Polygon> polyList = new ArrayList<Polygon>();
			for (RSTile tile : Vars.get().woodcuttingArea.getAllTiles())
				if (tile.isOnScreen())
					polyList.add(Projection.getTileBoundsPoly(tile, 0));
			for (Polygon poly : polyList)
				g.drawPolygon(poly);
		}

		// Images
		g.drawImage(PAINT_BACKGROUND, 0, 0, null);

		// Text
		g.setFont(new Font("Arial Black", Font.PLAIN, 17));
		g.setColor(Color.WHITE);
		g.drawString(Vars.get().runningTime, 364, 410);
		g.drawString(Vars.get().profit, 403, 446);
		g.drawString(Vars.get().xp, 440, 485);
	}

}