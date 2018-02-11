package cs126.codeworkshop.DoggyDaycare;

/**
 * DO NOT EDIT
 */
public class Dog {
	private String name;
	private int age;
	private String enemyName;

	public Dog(String name, int age, String enemyName) {
		this.name = name;
		this.age = age;
		this.enemyName = enemyName;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEnemyName() {
		return enemyName;
	}
}
