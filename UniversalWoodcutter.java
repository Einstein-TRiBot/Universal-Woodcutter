package scripts.UniversalWoodcutter;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api2007.Login;
import org.tribot.api2007.util.ThreadSettings;
import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;
import org.tribot.script.interfaces.Ending;
import org.tribot.script.interfaces.MessageListening07;
import org.tribot.script.interfaces.Painting;
import org.tribot.script.interfaces.Starting;
import scripts.UniversalWoodcutter.data.Vars;
import scripts.UniversalWoodcutter.framework.AbstractTask;
import scripts.UniversalWoodcutter.graphics.GUI;
import scripts.UniversalWoodcutter.graphics.Paint;
import scripts.UniversalWoodcutter.tasks.Bank;
import scripts.UniversalWoodcutter.tasks.Drop;
import scripts.UniversalWoodcutter.tasks.WalkToBank;
import scripts.UniversalWoodcutter.tasks.WalkToWoodcuttingArea;
import scripts.UniversalWoodcutter.tasks.Woodcutting;
import scripts.UniversalWoodcutter.utility.DataUtil;
import scripts.UniversalWoodcutter.utility.ScriptUtil;

/**___________________________________________________________________*/
                          @ScriptManifest                              (
        authors = "Einstein"                                           ,
        category = "Woodcutting"                                       ,
        name = "Universal Woodcutter"                                  ,
        gameMode = 1                                                   ,
        version = 1                                                    ,
        description = "Cuts (almost) any tree, (almost) anywhere."     )
/**___________________________________________________________________*/

public class UniversalWoodcutter extends Script implements Starting, Ending, Painting, MessageListening07 {
		
	@Override
	public void onStart() {
		new GUI().setVisible(true);
		General.useAntiBanCompliance(true);
		ThreadSettings.get().setClickingAPIUseDynamic(true);		
	}
	
	@Override
	public void run() {
		
		// Wait to get in game; for correct variable initialization
		while (!Login.getLoginState().equals(Login.STATE.INGAME))
			General.sleep(300);
		
		// Wait until we are done with the GUI
		while (!Vars.get().variablesInitialized)
			General.sleep(100);
		
		// Initialize the Task List
		List<AbstractTask> taskList = new ArrayList<AbstractTask>();
		Collections.addAll(taskList, new WalkToBank(), new WalkToWoodcuttingArea(), new Woodcutting());
		if (Vars.get().bankLogs)
			taskList.add(new Bank());
		else
			taskList.add(new Drop());
		
		// Concurrent time tracker
		new Thread() { public void run() { while(true) { General.sleep(1000); Vars.get().runningTime = Timing.msToString(getRunningTime());}}}.start();
		
		// Axe check
		if (!ScriptUtil.hasAxe())
			Vars.get().scriptCrashReason = "NO_AXE";
		
		// Main loop will exit as soon as it has a reason to crash the script.
		while (Vars.get().scriptCrashReason == null)
			for (AbstractTask task : taskList) {
				General.sleep(300);
				if (task.shouldExecute()) {
					if (Vars.get().printDebug)
						General.println(task.info());
					task.execute();
				}
			}
	}

	@Override
	public void onEnd() {
		if (Vars.get().scriptCrashReason != null)
			General.println("Script crashed: " + Vars.get().scriptCrashReason + " Nice!");
		
        General.println("                                                              ");
		General.println("______________________________________________________________");
		General.println("Thank you for running Einstein's Universal Woodcutter!        ");
		General.println("        Total running time: " + Vars.get().runningTime         );
		General.println("        Total profit: "       + Vars.get().profit              );
		General.println("        XP gained: "          + Vars.get().xp                  );
		General.println("        Levels gained: "      + Vars.get().levels              );
		General.println("______________________________________________________________");
	}
	
	@Override
	public void onPaint(Graphics g) {
		if(Vars.get().variablesInitialized)
			Paint.get().paint(g);
		else
			Paint.get().selectAreaGUI(g);
	}

	@Override
	public void serverMessageReceived(String message) {
		DataUtil.interpretString(message);
	}
	
	// Not in use
	public void clanMessageReceived(String arg0, String arg1) {}
	public void duelRequestReceived(String arg0, String arg1) {}
	public void personalMessageReceived(String arg0, String arg1) {}
	public void playerMessageReceived(String arg0, String arg1) {}
	public void tradeRequestReceived(String arg0) {}
	
}