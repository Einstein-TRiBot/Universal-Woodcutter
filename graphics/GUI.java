package scripts.UniversalWoodcutter.graphics;

import static scripts.UniversalWoodcutter.data.Constants.*;

import org.tribot.api2007.Skills;

import scripts.UniversalWoodcutter.data.Constants;
import scripts.UniversalWoodcutter.data.Vars;
/**
 * This GUI was designed with NetBeans.
 * 
 * I highly recommend using this IDE for GUI design, so you can focus more on the actual design and less on the implementation details.
 * 
 * @author Einstein
 * 
 * _______________________________________________________________________________________________________________________________________
 */
public class GUI extends javax.swing.JFrame {
private static final long serialVersionUID = 1L;
private javax.swing.JRadioButton achey;
private javax.swing.JRadioButton arcticPine;
private javax.swing.JLabel areaDescriptionLabel;
private javax.swing.JPanel areaPanel;
private javax.swing.JRadioButton bank;
private javax.swing.JPanel birdNestPanel;
private javax.swing.ButtonGroup birdNestsButtonGroup;
private javax.swing.JRadioButton drop;
private javax.swing.JRadioButton hollow;
private javax.swing.ButtonGroup logDisposalButtonGroup;
private javax.swing.JPanel logDisposalMethodPanel;
private javax.swing.JRadioButton magic;
private javax.swing.JRadioButton mahogany;
private javax.swing.JRadioButton maple;
private javax.swing.JRadioButton no;
private javax.swing.JRadioButton normal;
private javax.swing.JRadioButton oak;
private javax.swing.JPanel selectTreePanel;
private javax.swing.JSlider slider;
private javax.swing.JButton startButton;
private javax.swing.JPanel startPanel;
private javax.swing.JRadioButton teak;
private javax.swing.JLabel titleLabel;
private javax.swing.JPanel titlePanel;
private javax.swing.ButtonGroup treeButtonGroup;
private javax.swing.JRadioButton willow;
private javax.swing.JRadioButton yesAll;
private javax.swing.JRadioButton yesMine;
private javax.swing.JRadioButton yew; 
public GUI() {
initComponents();}                  
private void initComponents() {
treeButtonGroup = new javax.swing.ButtonGroup();
logDisposalButtonGroup = new javax.swing.ButtonGroup();
birdNestsButtonGroup = new javax.swing.ButtonGroup();
titlePanel = new javax.swing.JPanel();
titleLabel = new javax.swing.JLabel();
selectTreePanel = new javax.swing.JPanel();
normal = new javax.swing.JRadioButton();
achey = new javax.swing.JRadioButton();
oak = new javax.swing.JRadioButton();
willow = new javax.swing.JRadioButton();
teak = new javax.swing.JRadioButton();
maple = new javax.swing.JRadioButton();
hollow = new javax.swing.JRadioButton();
mahogany = new javax.swing.JRadioButton();
arcticPine = new javax.swing.JRadioButton();
yew = new javax.swing.JRadioButton();
magic = new javax.swing.JRadioButton();
logDisposalMethodPanel = new javax.swing.JPanel();
bank = new javax.swing.JRadioButton();
drop = new javax.swing.JRadioButton();
birdNestPanel = new javax.swing.JPanel();
yesAll = new javax.swing.JRadioButton();
yesMine = new javax.swing.JRadioButton();
no = new javax.swing.JRadioButton();
areaPanel = new javax.swing.JPanel();
areaDescriptionLabel = new javax.swing.JLabel();
slider = new javax.swing.JSlider();
startPanel = new javax.swing.JPanel();
startButton = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
setResizable(false);
titlePanel.setBackground(new java.awt.Color(255, 255, 255));
titleLabel.setFont(new java.awt.Font("Arial Black", 0, 24));
titleLabel.setForeground(new java.awt.Color(0, 102, 0));
titleLabel.setText("  UNIVERSAL WOODCUTTER");
javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
titlePanel.setLayout(titlePanelLayout);
titlePanelLayout.setHorizontalGroup(
titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(titlePanelLayout.createSequentialGroup()
.addContainerGap()
.addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap()));
titlePanelLayout.setVerticalGroup(
titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(titlePanelLayout.createSequentialGroup()
.addContainerGap()
.addComponent(titleLabel)
.addContainerGap(12, Short.MAX_VALUE)));
selectTreePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select tree:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
treeButtonGroup.add(normal);
normal.setText("Normal");
normal.setActionCommand("normal");
treeButtonGroup.add(achey);
achey.setText("Achey");
achey.setActionCommand("achey");
treeButtonGroup.add(oak);
oak.setText("Oak");
oak.setActionCommand("oak");
treeButtonGroup.add(willow);
willow.setText("Willow");
willow.setActionCommand("willow");
treeButtonGroup.add(teak);
teak.setText("Teak");
teak.setActionCommand("teak");
treeButtonGroup.add(maple);
maple.setText("Maple");
maple.setActionCommand("maple");
treeButtonGroup.add(hollow);
hollow.setText("Hollow");
hollow.setActionCommand("hollow");
treeButtonGroup.add(mahogany);
mahogany.setText("Mahogany");
mahogany.setActionCommand("mahogany");
treeButtonGroup.add(arcticPine);
arcticPine.setText("Arctic Pine");
arcticPine.setActionCommand("arctic pine");
treeButtonGroup.add(yew);
yew.setText("Yew");
yew.setActionCommand("yew");
treeButtonGroup.add(magic);
magic.setText("Magic");
magic.setActionCommand("magic");
javax.swing.GroupLayout selectTreePanelLayout = new javax.swing.GroupLayout(selectTreePanel);
selectTreePanel.setLayout(selectTreePanelLayout);
selectTreePanelLayout.setHorizontalGroup(
selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(selectTreePanelLayout.createSequentialGroup()
.addGap(59, 59, 59)
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(normal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(achey, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(oak, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(willow, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(teak, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(maple, javax.swing.GroupLayout.Alignment.LEADING))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(hollow)
.addComponent(mahogany)
.addComponent(arcticPine)
.addComponent(yew)
.addComponent(magic))
.addGap(60, 60, 60)));
selectTreePanelLayout.setVerticalGroup(
selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(selectTreePanelLayout.createSequentialGroup()
.addContainerGap()
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(normal)
.addComponent(hollow))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(achey)
.addComponent(mahogany))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(oak)
.addComponent(arcticPine))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(willow)
.addComponent(yew))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(selectTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(teak)
.addComponent(magic))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(maple)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
logDisposalMethodPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log disposal:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
logDisposalButtonGroup.add(bank);
bank.setSelected(true);
bank.setText("Bank");
bank.setActionCommand("bank");
logDisposalButtonGroup.add(drop);
drop.setText("Drop");
drop.setActionCommand("drop");
javax.swing.GroupLayout logDisposalMethodPanelLayout = new javax.swing.GroupLayout(logDisposalMethodPanel);
logDisposalMethodPanel.setLayout(logDisposalMethodPanelLayout);
logDisposalMethodPanelLayout.setHorizontalGroup(
logDisposalMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(logDisposalMethodPanelLayout.createSequentialGroup()
.addGap(60, 60, 60)
.addComponent(bank)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(drop)
.addGap(60, 60, 60)));
logDisposalMethodPanelLayout.setVerticalGroup(
logDisposalMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(logDisposalMethodPanelLayout.createSequentialGroup()
.addContainerGap()
.addGroup(logDisposalMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(bank)
.addComponent(drop))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
birdNestPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Take bird nests?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
birdNestPanel.setToolTipText("");
birdNestsButtonGroup.add(yesAll);
yesAll.setSelected(true);
yesAll.setText("Yes - All");
yesAll.setActionCommand("yes all");
birdNestsButtonGroup.add(yesMine);
yesMine.setText("Yes - Just mine (ironman)");
yesMine.setActionCommand("yes mine");
birdNestsButtonGroup.add(no);
no.setText("No");
no.setActionCommand("no");
javax.swing.GroupLayout birdNestPanelLayout = new javax.swing.GroupLayout(birdNestPanel);
birdNestPanel.setLayout(birdNestPanelLayout);
birdNestPanelLayout.setHorizontalGroup(
birdNestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(birdNestPanelLayout.createSequentialGroup()
.addGap(91, 91, 91)
.addGroup(birdNestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(no)
.addComponent(yesMine)
.addComponent(yesAll))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
birdNestPanelLayout.setVerticalGroup(
birdNestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(birdNestPanelLayout.createSequentialGroup()
.addContainerGap()
.addComponent(yesAll)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(yesMine)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(no)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
areaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Woodcutting area:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
areaDescriptionLabel.setText("Is constructed arround the player. Select radius:");
slider.setFont(new java.awt.Font("Tahoma", 0, 10));
slider.setForeground(new java.awt.Color(0, 0, 0));
slider.setMajorTickSpacing(1);
slider.setMaximum(15);
slider.setMinimum(2);
slider.setValue(4);
slider.addChangeListener(new javax.swing.event.ChangeListener() {
public void stateChanged(javax.swing.event.ChangeEvent evt) {
sliderStateChanged(evt);}});
javax.swing.GroupLayout areaPanelLayout = new javax.swing.GroupLayout(areaPanel);
areaPanel.setLayout(areaPanelLayout);
areaPanelLayout.setHorizontalGroup(
areaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(areaPanelLayout.createSequentialGroup()
.addContainerGap()
.addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
.addGroup(areaPanelLayout.createSequentialGroup()
.addGap(38, 38, 38)
.addComponent(areaDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(35, Short.MAX_VALUE)));
areaPanelLayout.setVerticalGroup(
areaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(areaPanelLayout.createSequentialGroup()
.addContainerGap()
.addComponent(areaDescriptionLabel)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
startButton.setBackground(new java.awt.Color(255, 255, 255));
startButton.setFont(new java.awt.Font("Arial Black", 0, 24));
startButton.setText("START");
startButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
startButtonActionPerformed(evt);}});
javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
startPanel.setLayout(startPanelLayout);
startPanelLayout.setHorizontalGroup(
startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(startPanelLayout.createSequentialGroup()
.addGap(73, 73, 73)
.addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
startPanelLayout.setVerticalGroup(
startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(startPanelLayout.createSequentialGroup()
.addContainerGap()
.addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(startPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(areaPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(birdNestPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(logDisposalMethodPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(selectTreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addContainerGap()))));
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(selectTreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(logDisposalMethodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(birdNestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(areaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));pack();}
private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {Vars.get().radius = slider.getValue();}  
private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
String treeSelected = treeButtonGroup.getSelection().getActionCommand();
String logDisposal = logDisposalButtonGroup.getSelection().getActionCommand();
String birdNests = birdNestsButtonGroup.getSelection().getActionCommand();    
setVariables(treeSelected, logDisposal, birdNests);
dispose();} 
private void setVariables(String selectedTree, String logDisposal, String birdNests) {
// Set target tree
switch (selectedTree) {
case "normal":      Vars.get().selectedTree = Constants.NORMAL_TREE;       Vars.get().logsPrice = NORMAL_LOGS_PRICE;      break;
case "achey":       Vars.get().selectedTree = Constants.ACHEY_TREE;        Vars.get().logsPrice = ACHEY_LOGS_PRICE;       break;
case "oak":         Vars.get().selectedTree = Constants.OAK_TREE;          Vars.get().logsPrice = OAK_LOGS_PRICE;         break;
case "willow":      Vars.get().selectedTree = Constants.WILLOW_TREE;       Vars.get().logsPrice = WILLOW_LOGS_PRICE;      break;
case "teak":        Vars.get().selectedTree = Constants.TEAK_TREE;         Vars.get().logsPrice = TEAK_LOGS_PRICE;        break;
case "maple":       Vars.get().selectedTree = Constants.MAPLE_TREE;        Vars.get().logsPrice = MAPLE_LOGS_PRICE;       break;
case "hollow":      Vars.get().selectedTree = Constants.HOLLOW_TREE;       Vars.get().logsPrice = BARK_PRICE;             break;
case "mahogany":    Vars.get().selectedTree = Constants.MAHOGANY_TREE;     Vars.get().logsPrice = MAHOGANY_LOGS_PRICE;    break;
case "arctic pine": Vars.get().selectedTree = Constants.ARCTIC_PINE_TREE;  Vars.get().logsPrice = ARCTIC_PINE_LOGS_PRICE; break;
case "yew":         Vars.get().selectedTree = Constants.YEW_TREE;          Vars.get().logsPrice = YEW_LOGS_PRICE;         break;
case "magic":       Vars.get().selectedTree = Constants.MAGIC_TREE;        Vars.get().logsPrice = MAGIC_LOGS_PRICE;       break;
}
// Set log disposal method
switch (logDisposal) {
case "bank": Vars.get().bankLogs = true;  break;
case "drop": Vars.get().bankLogs = false; break;
}
// Bird nest config
switch (birdNests) {
case "yes all":                        Vars.get().pickUpNest = true;  Vars.get().ironMan = false; break;
case "yes mine - Just mine (ironman)": Vars.get().pickUpNest = true;  Vars.get().ironMan = true;  break;
case "no":                             Vars.get().pickUpNest = false; Vars.get().ironMan = false; break;
}
// Get starting XP
Vars.get().startingXP = Skills.getXP(Skills.SKILLS.WOODCUTTING);
// Initializing complete
Vars.get().variablesInitialized = true;
}
    
}