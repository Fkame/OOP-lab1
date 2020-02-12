public class Dog extends Animal {
	
	private String food = "meat";
	private String hunger = "low hunger";
	
	public String makeNoice() {
		return "I used to be a proud wolf. But i still love you, master.";
	}
	
	public String eat() {
		if hunger.equals("low hunger") return "*quiet sound of champing*";
		if hunger.equals("middle hunger") return "*loud sound of champing*";
		if hunger.equals("high hunger") return "*very loud sound of champing*";
	}
	
	public String sleep() {
		return "*lie down next to the owner*";
	}
	
	public String roam() {
		return "*some dog roaming in search of master or fun*";
	}
	
}