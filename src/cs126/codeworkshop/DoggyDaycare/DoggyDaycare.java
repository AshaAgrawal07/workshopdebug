package cs126.codeworkshop.DoggyDaycare;

import java.util.ArrayList;
import java.util.List;

/**
 * Software used by a doggy daycare
 * You are only allowed to have 10 dogs per pen, and 5 pens
 * Each dog hates one other dog, and thus can not be placed in the same pen or they will fight
 */
public class DoggyDaycare {
	public static void main(String[] args) {
		DoggyDaycare.addPet(new Dog("doug", 5, "charlie"));
		DoggyDaycare.addPet(new Dog("rex", 8, "doug"));
		DoggyDaycare.addPet(new Dog("paul", 3, "doug"));

		Dog dog = DoggyDaycare.pickupPet("buddy");
		System.out.println(dog.getName());

		DoggyDaycare.addPet(new Dog("buddy", 1, "charlie"));
		Dog bella = DoggyDaycare.pickupPet("bella");
		Dog bellaAgain = DoggyDaycare.pickupPet("bella");
		System.out.println(bella.getName());
		System.out.println(bellaAgain == null);

		Dog noDog = DoggyDaycare.pickupPet("Not a dog");
		System.out.println("This dog does not exists: " + (noDog == null));
	}

	public static List<PlayPen> pens = new ArrayList<PlayPen>();

	static {
		for (int i = 0; i < 5; i++) {
			pens.add(new PlayPen());
		}
	}

	/**
	 * Takes in a pet and places it in a playpen
	 * @param dog the dog to be added
	 * @return if the dog is accepted
	 * A dog can be rejected if it can't be placed in a pen without starting a fight or if all pens are full
	 */
	public static boolean addPet(Dog dog) {
		for (PlayPen pen: pens) {
			boolean works = true;
			for (Dog dogOther: pen.getDogs()) {
				if (dogOther == null) {
					continue;
				}
				if (dogOther.getEnemyName().equals(dog.getName())) {
					works = false;
					break;
				} else if (dog.getEnemyName().equals(dog.getName())) {
					works = false;
					break;
				}
			}
			if (works) {
				if (pen.addDog(dog)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Someone is here to pickup their pet, and remove the dog from the daycare
	 * @param name name of the dog
	 * @return the dog, null if dog doesn't exist
	 */
	public static Dog pickupPet(String name) {
		for (PlayPen pen: pens) {
			for (Dog dog : pen.getDogs()) {
				if (dog.getName().equalsIgnoreCase(name)) {
					return pen.removeDog(name);
				}
			}
		}
		return null;
	}
}
