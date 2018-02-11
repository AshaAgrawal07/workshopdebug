package cs126.codeworkshop;

import com.google.gson.Gson;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cwlowder on 2/9/2018.
 */
@SuppressWarnings("ALL")
public class Presentation {
	@Test
	public void howAComputerSeesCode() {
		System.out.println("First");
		System.out.println("Second");
		System.out.println("Third");
		System.out.println("Fourth");
	}

	@Test
	public void howAComputerSeesCode2() {
		System.out.println("First");
		if (true) {
			System.out.println("in IF");
		} else {
			System.out.println("in else");
		}
		System.out.println("LAST");
	}

	@Test
	public void howAComputerSeesCode3() {
		System.out.println("First");
		for (int i = 0; i < 10; i++) {
			System.out.println("This is the: " + i + " loop");
		}
		System.out.println("Last");
	}

	@Test
	public void checking() {
		System.out.println("First");
		int i = 0;

		if (i == 1)
			System.out.println("IN");
			System.out.println("LOOP");

		System.out.println("END");
	}

	@Test
	public void other() {
		System.out.println("FIRST");
		for (int i = 0; i < 100; i++) {
			System.out.print(".");
		}
		System.out.println("DONE");
	}

	@Test
	public void methods() {
		System.out.println("First");

		int val = factorial(5);

		System.out.println(val);
	}

	private static int factorial(int i) {
		if (i <= 0) {
			return 1;
		}

		return i * factorial(i-1);
	}


	@Test
	public void checkingValue() {
		String myString = "12345";
		System.out.println(myString);
	}


	@Test
	public void editValues() {
		System.out.println("How old are you?");
		int age = 12;
		System.out.println("You are " + age + " years old");
	}

	@Test
	public void whyILikeTheDebugger() {
		int[] stuff = {4,3,2,1};
		for (int i: stuff) {
			if (i%2==0) {
				i--;
			}
			System.out.print("~");
		}
		System.out.println("");

		for (int i: stuff) {
			System.out.println(i);
		}
	}

	private static String jsonInput = "{\"age\":35, \"Name\":\"Arthur Dent\"}";

	private class Person {
		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	@Test
	public void testJson() {
		Gson gson = new Gson();
		Person person = gson.fromJson(jsonInput, Person.class);
		assertEquals(35, person.getAge());
		assertEquals("arthur dent", person.getName().toLowerCase());
	}
}