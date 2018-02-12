package cs126.codeworkshop.FrameFactory;

import javax.annotation.Generated;
import javax.xml.ws.soap.Addressing;

@SuppressWarnings("ALL")
@Addressing
@Generated("Debug")
/**
 * Off by but a few
 */
public class FrameFactory {
	public static void main(String[] args) {
		System.out.println("0:");
		System.out.println(framerCreator(0));
		System.out.println("1:");
		System.out.println(framerCreator(1));
		System.out.println("2:");
		System.out.println(framerCreator(2));
		System.out.println("5:");
		System.out.println(framerCreator(5));
	}
	/*
	Creates frames of n by n
	This is a 5x5:
	#####
	#   #
	#   #
	#####
	 */
	public static String framerCreator(int n) {
		String frame = "";
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++) {
					frame += "#";
				}
			} else {
				frame += "#";
				for (int j = 1; j < n - 1; j++) {
					frame += " ";
				}
				frame += "#";
			}
			frame += "\n";
		}
		return frame;
	}
	/*
Example output:
0:

1:
#

2:
##
##

5:
#####
#   #
#   #
#   #
#####
	 */
}