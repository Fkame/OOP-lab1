
public class Cat extends Animal {
	
	private String[] picture_sitting = {
"___o8o_____________________oo",
"___8**o__________________o**88",
"__$8*8888_____________88$8*_88",
"__$8*888$888$$$$$$$$88888***$8",
"__$8*8$$8888*******8$88***8$8",
"__888$8****************888$8",
"__*$8******************8888$8",
"__$$********************8888$8_____oooooooo",
"_8$8**8************8*****888$8___o$$$$$$8$$8888o",
"_$$**8-8**********8-8*****88$8__$$88888********$$8",
"_$$***$************$******88$8__$8888*********```$8",
"_*$8****88***************88$$*__$888**********````$o",
"__8$8**8$8**************88$8____$$8**********``````$8",
"____8$88**********8**8888$8_____*$8**********``````$8",
"______8$8$$$$$$$$$$$$$8*_________88*******8$$``8*88*",
"______*$$**********$$$8ooo_______*$*******8$**8*_*",
"_______8$**************$$$888___*$8******8$$*",
"_______8$***8$8**88***$$$8$$$$$$$8*******8$*",
"_______8$***$$8**$8*$$****$88$8$8*8**888888",
"_____8$***$$$****8$$$******88*__*888888*",
"______8888$$88888$$8888$$$88",
"____________*************"
};

	private String[] picture_roaming = {
"______________________________________________1R1R",
"____________________________________________1RRRRR",
"___________________________________________RRRR11_",
"__________________________________________1RRR____",
"__________________________________________RRR_____",
"_________________________________________RRRR_____",
"_________________________________________1RR1_____",
"_________________________________________1RR1_____",
"_________________________________________1RRR_____",
"__________________________________________RRR_____",
"_________________________________________1R1R_____",
"_____R_______RR__________________________R1RR_____",
"____RRR1___1RRR_________________________RR_R1_____",
"____R1RRRR1R11R_________________1RRRRRRR1_RR______",
"____R11R__11RRR_____________1RRRRR11111111R1______",
"__1RR1RR111R1RR1_________1RRR111111111111R1_______",
"__RRR11RR1_1RR1RR1___11RRR111111111111111R1_______",
"_111R1_11111RR11RRRRRR1111111111111111111R1_______",
"__R1RR111111R1111111111111111111111111111R________",
"__1__11RRRR11111111111111111111111111111R1________",
"__________R1111111111111111111111111111RR_________",
"__________RR_1111111111111111111111111R1__________",
"__________RR11111111111111R111111111RR1___________",
"__________1RR1111111RR1111R111111111R_____________",
"__________1RR111111RRRR1R1R11111111R1_____________",
"__________RR1R1111RR____RRRR_11111R1RR____________",
"_________1R_RRR_11R______11RR11111RRR_____________",
"_________R11R_R1_RR_________1RR11_RR______________",
"________RR_R1_RR11RRR_______1RRRR11R1_____________",
"_______1R_RR___RR1RRRR______RR1_1R_1R1____________",
"_____1RR1RR________RRR_______1111RR_RR____________",
"____RRRRRR_________________RRRRRRRRRRR____________"
};
	
	private AnimalStatuses.FoodTypes food = AnimalStatuses.FoodTypes.MEAT;
	private AnimalStatuses.HungerLevels hunger = AnimalStatuses.HungerLevels.MID;
	
	private int[] location = new int[2];
	
	
	public String makeNoice() {
		return "I hate you, but feed me, slave.";
	}
	
	public String eat() {
		if (hunger == AnimalStatuses.HungerLevels.LOW) 
			return "*quiet sound of despite champing*";
		if (hunger == AnimalStatuses.HungerLevels.MID) 
			return "*loud sound of despite champing*";
		if (hunger == AnimalStatuses.HungerLevels.HIGH) 
			return "*very loud sound of your leg despite champing*";
		return "ooops, your cat is broked(((";
	}
	
	public String sleep() {
		return "*lie down where itselft want*";
	}
	
	public String roam() {
		return "*in search of adventure*";
	}
	
	public void setHunger(AnimalStatuses.HungerLevels hungerLvL) {
		
		if (hungerLvL == AnimalStatuses.HungerLevels.LOW) hunger = AnimalStatuses.HungerLevels.LOW;
		if (hungerLvL == AnimalStatuses.HungerLevels.MID) hunger = AnimalStatuses.HungerLevels.MID;
		if (hungerLvL == AnimalStatuses.HungerLevels.HIGH) hunger = AnimalStatuses.HungerLevels.HIGH;
	}
	
	public String[] getPicture_normal () {
		return this.picture_sitting;
	}
	
	public String[] getPicture_roaming() {
		return this.picture_roaming;
	}
	
	public void feed() {
		if (hunger == AnimalStatuses.HungerLevels.LOW) hunger = AnimalStatuses.HungerLevels.MID;
		if (hunger == AnimalStatuses.HungerLevels.MID) hunger = AnimalStatuses.HungerLevels.HIGH;
	}
}