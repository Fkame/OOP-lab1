public class Dog extends Animal {
	
	private String[] picture_sitting = {
"____________________DDDDDDDDDDD",
"__________________DDDD_____DDDDDDD",
"_________________DD_____________DDD",
"_______________DDD______________D_DD",
"______________DD______________DDDD__D",
"_____________DD__D____________D0DDD_D",
"_____________DDD_DD____DD_____DDDDDDD",
"____________DD_D__DD__DD0D_______DDDD",
"____________D_____DDD_DDDD_______DD_DD",
"____________D______DDD_________D_DD_DD",
"____________DD______DDD_____DDD_D_DDD",
"____________DDD_____DD_D____DDDDD_D",
"__________DDD_DD_____D_DDD___DDDDDD",
"_DDD_____DD____DDD___DD__DDDDDDDDD",
"DDDD____DD_______DDDDD__________DD",
"DDDD____D_________DDD___________DD",
"DD_D___DD_______________________D",
"_DDDD__D_______________________DD",
"__DDDDDD____DD______D__________DD",
"___DD_DD____DD_____DD_______DD_DD",
"_____DDD____DD_____D________D__DD",
"______DDD____D____DD_DDDDDD____DD",
"_______DDD___D_____D____DDD____DDDD",
"________DDDD_D_____DD__DD_DD___DDDD",
"______DD_D_DDD_____DDDDD__D___DD",
"______DDDDDDDDD____DDD____D___DDDD",
"______________DD_DDDDDD___DDDDDDDD",
"_______________DDDDDD______DDDDD"
};

	private String[] picture_roaming = {
"_______DDDDDDDDD",
"_____DDD__DDDDDD",
"___DD____DD______________DDDDDD",
"___D___DD_____________DDDD_DDDDDDDDDD",
"__DD___DDDDDDDD______DD___DD_______DDDDDD",
"__DD_DDDD_____DDDDDDD______D_________DD_DD",
"___DDD____________DD_______DD_________D__D",
"__DD_____________DD_________D_________DD_DD",
"_DD______________DD_________D__________D_DD",
"_D_________________DDDD____DD_DD____DDDD__D",
"_D_________________DDDDDDDDD__D0D__D0D_D_DD",
"_D________________DDDD___DD_________DD__DD",
"_DD________________D_DD____________D_DD",
"_D_________________DD_DDDDDD_D_____DDDD",
"D________D__________DDDDD_DDDD_____DDD",
"D______DDDDD___________DDDDDDDDDDDDDD",
"D_____DD_D_DDD_____________D__DDD___DD",
"D_____D__DD__DDD______DDD_D___DDDD_DDDDD",
"D______D__DD___D______D_DDD____D_DDDDDDDD",
"DD__DDDD___DDDDDD_____DD_D_D____DDDDDDDDDD",
"_DDDDDDD______DDD______DDD__D_____DDDDDDDD",
"_________________D_____DD__DDD_______D__DD",
"_________________DD_____DDD_DDD_________DD",
"__________________DD______DD_DDDDD_____DD",
"___________________DDDD_DDD_____DDDDDDD",
"_____________________DDDDD"
};
	
	private AnimalStatuses.FoodTypes food = AnimalStatuses.FoodTypes.MEAT;
	private AnimalStatuses.HungerLevels hunger = AnimalStatuses.HungerLevels.LOW;
	
	private int[] location = new int[2];
	
	public String makeNoice() {
		return "I used to be a proud wolf. But i still love you, master.";
	}
	
	public String eat() {
		if (hunger == AnimalStatuses.HungerLevels.LOW) 
			return "*quiet sound of champing*";
		if (hunger == AnimalStatuses.HungerLevels.MID) 
			return "*loud sound of champing*";
		if (hunger == AnimalStatuses.HungerLevels.HIGH) 
			return "*very loud sound of champing*";
		return "ooops, your dog is broked(((";
	}
	

	public String sleep() {
		return "*lie down next to the owner*";
	}
	
	public String roam() {
		return "*some dog roaming in search of master or fun*";
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