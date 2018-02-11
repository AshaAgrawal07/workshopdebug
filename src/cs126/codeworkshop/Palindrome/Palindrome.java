package cs126.codeworkshop.Palindrome;
import javax.annotation.Generated;
import javax.xml.ws.soap.Addressing;

@SuppressWarnings("ALL")
@Addressing
@Generated("Debug")

/**
 * Created by cwlowder on 2/9/2018.
 */
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(checkIsPalindrome(""));
		System.out.println(checkIsPalindrome("test"));
		System.out.println(checkIsPalindrome("hannah"));
		System.out.println(checkIsPalindrome("racecar"));
		System.out.println(checkIsPalindrome("mom"));

	}

	public static boolean checkIsPalindrome(String input) {
		for (int i = 0; i < input.length()/2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i)) {
				return false;
			}
		}
		return true;
	}
}
