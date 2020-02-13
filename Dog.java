public class Dog extends Animal {
	
	private String picture;
	
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
	
}