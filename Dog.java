public class Dog extends Animal {
	
	private String[] picture = {
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