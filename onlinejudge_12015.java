import java.util.*;
public class onlinejudge_12015 {
	public static void main(String[] args) {
		
		// Setting up input and storing number of groups.
		Scanner input = new Scanner(System.in);
		int numGroups = input.nextInt();
		
		// Setting up "highest score" variable best_num and dynamic array list for all top sites.
		int best_num = 0;
		ArrayList<String> best_sites = new ArrayList<String>();
		
		// Iterating through all groups of 10 entries each to find best sites.
		for (int i = 1; i < numGroups + 1; i++) {
			for (int j = 1; j < 11; j++) {
				// Storing URL and relevance value.
				String site = input.next();
				int num = input.nextInt();
				
				// Handling when a new best or tie is found.
				if (num > best_num) {
					best_num = num;
					best_sites.clear();
					best_sites.add(site);
				}else if (num == best_num) {
					best_sites.add(site);
				}
			}
			// Printing all final best sites.
			System.out.println("Case #" + i + ":");
			for (int k = 0; k < best_sites.size(); k++) {
				System.out.println(best_sites.get(k));
			}
		}
		// Closing scanner for input.
		input.close();
	}
}
