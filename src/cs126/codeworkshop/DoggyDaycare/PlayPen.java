package cs126.codeworkshop.DoggyDaycare;

import java.util.ArrayList;
import java.util.List;

/**
 * The play pen that dogs are placed in
 */
public class PlayPen {
	private List<Dog> dogs = new ArrayList<Dog>();

	/**
	 * Adds a dog to the pen
	 * @param newDog the dog to add to the pen
	 * @return if the dog can fit in the pen
	 * @throws throws a DogFightException if a dog fights another dog
	 */
	public boolean addDog(Dog newDog) {
		if (dogs.size() <= 10) {
			dogs.add(newDog);
			// this method must remain
			dogsFight();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Removes a dog with the designated name from the pen
	 * @param name the target name of the dog
	 * @return The dog to return. Null if the dog is not in the pen.
	 * @throws IllegalStateException when two dogs both have the target name
	 */
	public Dog removeDog(String name) {
		Dog dogToFind = null;
		for (Dog dog: dogs) {
			if (dog.getName().equalsIgnoreCase(name)) {
				if (dogToFind != null) {
					throw new IllegalStateException("Two dogs with the same name. Cannot decide which dog to return");
				}
				dogs.remove(dog);
				dogToFind = dog;
			}
		}
		return dogToFind;
	}

	/**
	 * Returns an array of the dogs inside the pen
	 * @note This returns an array to prevent you from editing the contents of the pen
	 * directly :)
	 * @return an array of dogs
	 */
	public Dog[] getDogs() {
		// places all the dogs into a new array of dogs
		return dogs.toArray(new Dog[dogs.size()]);
	}

	/**
	 * Helper function for PlayPen class. Do not edit
	 */
	private void dogsFight() {
		for (Dog dog: dogs) {
			for (Dog dogOther: dogs) {
				if (dog == dogOther) {
					continue;
				}
				if (dog.getEnemyName().equalsIgnoreCase(dogOther.getName())) {
					throw new DogFightException(dog, dogOther);
				}
			}
		}
	}
}