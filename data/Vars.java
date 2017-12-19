package scripts.UniversalWoodcutter.data;

import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

public class Vars {
	
	// Instance manipulation
	private Vars() {} 
	private static final Vars VARS = new Vars();
	public static Vars get() { return VARS; }
	
	// Script settings
	public String scriptCrashReason;
	public boolean printDebug = true;
	public boolean variablesInitialized;
    
    // Woodcutting settings
    public int [] selectedTree;
    public boolean bankLogs;
    public int logsPrice;
    public boolean pickUpNest;
    public boolean ironMan;
    public boolean  nestFalls;
	
	// Area
    public RSArea woodcuttingArea;
    public int radius = 4;
	public RSTile playerTile;
	
	// Account info
	public long startingXP;
	public int logsCount;
		
	// Paint
	public String runningTime = "";
	public String profit = "";
	public String xp = "";
	public int levels;
	
}