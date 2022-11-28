package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		
		Map<String, Integer> heights = new HashMap<>();
		heights.put("Skye", 65);
		heights.put("William", 70);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Who's height do you want to know? (uppercase first letter)");
		String temp = in.next();
		while(!(temp.equals("quit"))) {
			if(heights.get(temp) == null) System.out.println("That person is not in the group!");
			else System.out.println(temp + " is " + heights.get(temp) + " inches tall.");
			System.out.println("Who's height do you want to know? (uppercase first letter, type quit to exit)");
			temp = in.next();
		}
	}
}
