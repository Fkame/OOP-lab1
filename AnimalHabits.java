
public class AnimalHabits {
	
	public static void main (String[] args) {
		System.out.println("Greeting in low-cost animal-habits text simulation prog!");
		System.out.println("--------------------------------------------------------\n");
		
		//Вызов собаки
		Dog fido = new Dog();
		System.out.println("Hi, i am Dog - Fido, now i will demonstate you my habits...");
		System.out.println(fido.makeNoice());
		System.out.println(fido.eat());
		System.out.println(fido.roam());
		System.out.println(fido.sleep());
		System.out.println("");
		
		fido.setHunger(AnimalStatuses.HungerLevels.MID);
		System.out.println(fido.eat());
		
	}
	
}