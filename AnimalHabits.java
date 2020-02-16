import java.util.Scanner;
import java.lang.Exception;
import java.util.HashMap;
import java.lang.Integer;

public class AnimalHabits {
	
	private Scanner in = new Scanner(System.in);
	Animal animal;
	
	HashMap<String, String> animalsList = new HashMap<String, String>();
	
	
	public static void main (String[] args) {
		System.out.println("Greeting in low-cost animal-habits text simulation prog!");
		System.out.println("--------------------------------------------------------\n");
		
		/*
		// Вызов кошака
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
		
		// Вызов собаки
		Dog fido = new Dog();
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("Hi, i am son of proud Wolves - but i still love you, master");
		System.out.println(fido.makeNoice());
		System.out.println(fido.eat());
		System.out.println(fido.roam());
		System.out.println(fido.sleep());
		System.out.println("");
		
		fido.setHunger(AnimalStatuses.HungerLevels.MID);
		System.out.println(fido.eat());
		
		System.out.println("\nPicture of Dog:");
		String[] picture_dog = fido.getPictureSitting();
		for (String str : picture_dog) {
			System.out.println(str);
		}
		*/
		
		AnimalHabits ah = new AnimalHabits();
		ah.start();
		
		System.out.println("\n--------------------------------------------------------");
		System.out.println("End of work");
	}

	public void start () {
		
		// Список доступных животных
		animalsList.put("1", "Dog");
		animalsList.put("2", "Cat");
		
		this.chooseAnimal();
	
		while (true) {
			System.out.println("\nChoose action:");	
			System.out.println("1. Talk to it");
			System.out.println("2. Feed it");
			System.out.println("3. Let it sleep");
			System.out.println("4. Let it roaming");
			System.out.println("5. Change animal");
			System.out.println("6. Exit");
			//System.out.println("\nYou want:");	
			
			boolean parseOK = false;
			int chooseNum = 0;				
			while (!parseOK) {	
				System.out.println("\nYou want:");	
				String inputMove = in.next();
				System.out.println("");
				
				try {
					chooseNum = Integer.parseInt(inputMove);
					if (chooseNum > 0 && chooseNum < 7) {
						parseOK = true;
					} else {
						System.out.println("Not correct answer!");
					}
				} catch (Exception e) {
					System.out.println("Error input!");
				}
			}
			
			switch (chooseNum) {
				case (1): System.out.println("\"" + animal.makeNoice() + "\""); 
						break;
				case (2): System.out.println(animal.eat()); 
						break;
				case (3): System.out.println(animal.sleep()); 
						break;
				case (4): System.out.println(animal.roam() + "\n"); 
						String[] picture = animal.getPicture_roaming();
						for (String str: picture) {
							System.out.println(str);
						}
						break;
				case (5): this.chooseAnimal(); 
						break;
				case (6): return;
			}
		}
	}
	
	private void chooseAnimal() {
		
		// Выбор доступных классов животных
		System.out.println("There are:");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("\nChoose animal:");	
		
		// Получение ввода
		String inputAnimal = in.next();
		//System.out.println("You entered: [" + inputAnimal + "]");
		//System.out.println(animalsList.containsKey(inputAnimal) + ", " + animalsList.containsValue(inputAnimal));
		
		// Валидация ввода
		while (!animalsList.containsKey(inputAnimal) && !animalsList.containsValue(inputAnimal)) {
			System.out.println("Please enter correct number of animal or animal kind:");
			inputAnimal = in.next();
		}
		
		// Создание объекта животного
		if (inputAnimal.equals("1") || inputAnimal.equals("Dog")) {
			animal = new Dog();
		} 
		if (inputAnimal.equals("2") || inputAnimal.equals("Cat")) {
			animal = new Cat();
		}
		
		System.out.println("\nYour animal:");
		String[] picture = animal.getPicture_normal();
		for (String str: picture) {
			System.out.println(str);
		}
	}
	
}