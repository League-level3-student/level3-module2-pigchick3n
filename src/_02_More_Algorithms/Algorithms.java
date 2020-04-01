package _02_More_Algorithms;

import java.util.ArrayList;
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
		
			if (message.indexOf(" ... --- ... ")!= -1) {
				doesContain = true;
			}
		
		return doesContain;
	
}
//	public static List<Double> sortScores(List<Double> grades) {
//		List<Double> scores = new ArrayList<>(grades.size());
//		for (int i = 0; i < grades.size(); i++) {
//			scores.set(i, grades.get(i));
//		}
//		
//		for (int i = 0; i < scores.size(); i++) {
//			for (int j = 0; j < scores.size() - 1; j++) {
//				if (scores.get(j) > scores.get(j+1)) {
//					double small = scores.get(j + 1);
//					double large = scores.get(j);
//					scores.set(j, small);
//					scores.set(j+1, large);
//				}
//			}
//		}
//			
//		
//		return scores;
//	
//}
	
	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i <unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size()-1; j++) {
				if(unsortedSequences.get(j).length()>unsortedSequences.get(j+1).length()) {
					String temp = unsortedSequences.get(j); 
					unsortedSequences.set(j, unsortedSequences.get(j+1)); 
					unsortedSequences.set(j+1,temp); 
				}
			}
		}
		return unsortedSequences;
	}
	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int s = 0; s < words.size()-1; s++) {
				if(words.get(s).compareTo(words.get(s+1))>0) {
					String x = words.get(s); 
					words.set(s, words.get(s+1)); 
					words.set(s+1,x); 
				}
			}
		}
		return words;
	}
}
