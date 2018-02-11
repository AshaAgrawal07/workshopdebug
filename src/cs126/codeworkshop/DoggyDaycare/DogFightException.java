package cs126.codeworkshop.DoggyDaycare;

/**
 * The exception that is thrown when two dogs fight
 */
public class DogFightException extends RuntimeException {
	private Dog dog1;
	private Dog dog2;

	public DogFightException(Dog dog1, Dog dog2) {
		this.dog1 = dog1;
		this.dog2 = dog2;
	}

	@Override
	public String getMessage() {
		return dog1.getName() + " fought with " + dog2.getName();
	}
}
