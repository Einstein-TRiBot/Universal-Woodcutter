package scripts.UniversalWoodcutter.data;

import java.awt.Image;

import scripts.UniversalWoodcutter.utility.DataUtil;

public interface Constants {

	// Axes
	int BRONZE_AXE = 1351;
	int IRON_AXE = 1349;
	int STEEL_AXE = 1353;
	int BLACK_AXE = 1361;
	int MITHRIL_AXE = 1355;
	int ADAMANT_AXE = 1357;
	int RUNE_AXE = 1359;
	int DRAGON_AXE = 6739;
	int [] AXES = {BRONZE_AXE, IRON_AXE, STEEL_AXE, BLACK_AXE, MITHRIL_AXE, ADAMANT_AXE, RUNE_AXE, DRAGON_AXE};
	 
	// Trees
	int[] NORMAL_TREE = { 1276, 1278, 1282, 1286 };
	int[] ACHEY_TREE = { 2023 };
	int[] OAK_TREE = { 1751 };
	int[] WILLOW_TREE = { 1750, 1756, 1760, 1758 };
	int[] TEAK_TREE = { 9036 };
	int[] MAPLE_TREE = { 1759 };
	int[] HOLLOW_TREE = {};
	int[] MAHOGANY_TREE = {};
	int[] ARCTIC_PINE_TREE = {};
	int[] YEW_TREE = { 1755, 1753 };
	int[] MAGIC_TREE = { 1761, 1762 };

	// Logs
	int NORMAL_LOGS = 1511;
	int ACHEY_LOGS = 2862;
	int OAK_LOGS = 1521;
	int WILLOW_LOGS = 1519;
	int TEAK_LOGS = 6333;
	int MAPLE_LOGS = 1517;
	int BARK = 3239;
	int MAHOGANY_LOGS = 6332;
	int ARCTIC_PINE_LOGS = 10810;
	int YEW_LOGS = 1515;
	int MAGIC_LOGS = 1513;

	// Logs-prices
	int NORMAL_LOGS_PRICE = DataUtil.getPrice(NORMAL_LOGS);
	int ACHEY_LOGS_PRICE = DataUtil.getPrice(ACHEY_LOGS);
	int OAK_LOGS_PRICE = DataUtil.getPrice(OAK_LOGS);
	int WILLOW_LOGS_PRICE = DataUtil.getPrice(WILLOW_LOGS);
	int TEAK_LOGS_PRICE = DataUtil.getPrice(TEAK_LOGS);
	int MAPLE_LOGS_PRICE = DataUtil.getPrice(MAPLE_LOGS);
	int BARK_PRICE = DataUtil.getPrice(BARK);
	int MAHOGANY_LOGS_PRICE = DataUtil.getPrice(MAHOGANY_LOGS);
	int ARCTIC_PINE_LOGS_PRICE = DataUtil.getPrice(ARCTIC_PINE_LOGS);
	int YEW_LOGS_PRICE = DataUtil.getPrice(YEW_LOGS);
	int MAGIC_LOGS_PRICE = DataUtil.getPrice(MAGIC_LOGS);

	// Paint images
	Image PAINT_BACKGROUND = DataUtil.getImage("https://i.imgur.com/Dm0YdA4.png");

}