package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return 0;
	
}
	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				counter++;
			}
		}
	return counter;
	}
	public static double findTallest(List<Double> peeps) {
		double height = 0;
		for (int i = 0; i < peeps.size()-1; i++) {
			if (peeps.get(i+1) >= peeps.get(i)) {
				height = peeps.get(i+1);
			}
		}
		return height;
	
}
	public static String findLongestWord(List<String> words) {
		String longest = "";
		int characters = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > characters) {
				characters = words.get(i).length();
				longest = words.get(i);
			}
		}
		return longest;
	
}
	public static boolean containsSOS(List<String> message) {
		boolean doesContain = false;
		
			if (message.contains("... --- ...")) {
				doesContain = true;
			}
		
		return doesContain;
	
}
}
