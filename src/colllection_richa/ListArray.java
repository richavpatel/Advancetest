package colllection_richa;
// duplicate elements in ArrayList
// how to get unique String using hashset from duplicate arraylist 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListArray {

	public static void main(String[] args) {
		List<String> uniqueList = new ArrayList<>();

		uniqueList.add("Richa");
		uniqueList.add("Roma");
		uniqueList.add("Dhruvesh");
		uniqueList.add("Richa");

		Set<String> u = new HashSet<>();

		for (String s : uniqueList) {

			if (u.add(s) == false) { // if i do true then i will get unqiue set!!
				System.out.println("Find duplicate string from hash set: " + s);
			}
		}

		/*
		 * if (u.contains(s)) {
		 * System.out.println("Find duplicate string from hash set: "+ s); } u.add(s);
		 */

		// }

	}

}
