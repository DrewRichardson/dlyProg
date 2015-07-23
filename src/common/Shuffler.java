package common;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Shuffler {


	public static void main(String[] args) {
		String[] list = {
				"1 2 3 4 5 6 7 8",
				"apple blackberry cherry dragonfruit grapefruit kumquat mango nectarine persimmon raspberry raspberry",
				"a e i o u" };		
		System.out.println(Shuffle(Parser(list)));
		
	}

	public static String Shuffle(String[] values) {
		Random rand = new Random();
		String result = "";
		for (int first = 0; first < values.length; first++) {
			int second = rand.nextInt(values.length);
			
			String temp = values[first];
			values[first] = values[second];
			values[second] = temp;
		}
		
		for (int i = 0; i < values.length; i++) {
			result = values[i].toString();
		}
		return result;
	}

	public static String[] Parser(String[] values) {
		StringBuilder[] sb = new StringBuilder[3];
		int count = 0;
		for (String s : values) {
			sb[count] = new StringBuilder("");
			sb[count].append(s);
			count++;
		}
		String[] arrayToShuffle = new String[sb.length];
		for (int i=0; i < sb.length;i++) {
			arrayToShuffle[i] = sb[i].toString();
			
		}
		return arrayToShuffle;
	}
}
/* List of strings

*
*
*/

