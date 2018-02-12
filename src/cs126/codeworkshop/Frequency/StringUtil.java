package cs126.codeworkshop.Frequency;

import javax.annotation.Generated;
import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("ALL")
@Addressing
@Generated("Debug")


public class StringUtil {
	public static void main(String[] args) {
		System.out.println(mostFrequentChar(""));
		System.out.println(mostFrequentChar("a"));
		System.out.println(mostFrequentChar("aaaaaa"));
		System.out.println(mostFrequentChar("aaabbb"));
		System.out.println(mostFrequentChar("aaaaaaabbb"));
		System.out.println(mostFrequentChar("she sells sea shells by the sea shore"));
	}

	/**
	 * Finds the most common char in a string
	 * @param input a target string
	 * @return the most frequent char found in a String, - if no chars in String
	 */
	public static char mostFrequentChar(String input) {
		if (input == null) {
			return '-';
		}

		List<Character> characterList = new ArrayList<Character>();
		List<Integer> countList = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (findInList(characterList, input.charAt(i)) == -1) {
				characterList.add(0, input.charAt(i));
				countList.add(0, 1);
			} else {
				int index = findInList(characterList, input.charAt(i));
				int count = countList.get(index);
				count++;
			}
		}

		char maxChar = '-';
		int maxCount = 0;
		for (int i = 0; i < characterList.size(); i++) {
			if (countList.get(i) > maxCount)
				maxChar = characterList.get(i);
				maxCount = countList.get(i);
		}

		return maxChar;
	}

	private static int findInList(List<Character> list, char c) {
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) == c)
				return i;
		}
		return -1;
	}
}
