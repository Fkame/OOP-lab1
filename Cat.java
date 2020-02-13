
public class Cat extends Animals {
	
	private String[] picture = {
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
	
	private AnimalStatuses.FoodTypes food = AnimalStatuses.FoodTypes.MEAT;
	private AnimalStatuses.HungerLevels hunger = AnimalStatuses.HungerLevels.HIGH;
	
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
	
	public String[] getPicture () {
		return this.picture;
	}
}