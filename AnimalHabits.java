
public class AnimalHabits {
	
	public static void main (String[] args) {
		System.out.println("Greeting in low-cost animal-habits text simulation prog!");
		System.out.println("--------------------------------------------------------\n");
		
		//Вызов кошака
		Cat booris = new Cat();
		System.out.println("Hi, i am Cat - Booris and now you are my own slave");
		System.out.println(booris.makeNoice());
		System.out.println(booris.eat());
		System.out.println(booris.roam());
		System.out.println(booris.sleep());
		System.out.println("");
		
		booris.setHunger(AnimalStatuses.HungerLevels.MID);
		System.out.println(booris.eat());
		
		System.out.println("\nPicture of Cat:");
		String[] picture = booris.getPicture();
		for (String str : picture) {
			System.out.println(str);
		}
		
	}
	
}