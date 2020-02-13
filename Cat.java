
public class Cat extends Animals {
	
	private String[] picture = {"?", "/", "?"};
	
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