package com.bridgelabz.hashtable;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {

	public static void main(String[] args) {
		String s = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] a = s.split(" ");
		HashMap<String, Integer> words = new HashMap<>();
		int index1 = 0, index3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word to remove from sentence: ");
		String word = sc.nextLine();
		for (String str : a) {
			if (words.containsKey(str)) {
				words.put(str, 1 + words.get(str));
				index1 = s.indexOf(str);
				System.out.println(str + " string index number is " + index1);
				index3 = s.indexOf(str, 13);
				System.out.println(str + " string repetition index number is " + index3);
			} else {
				words.put(str, 1);
				s.replaceAll(word, "");
			}
		}
		System.out.println(words);
		System.out.println(s);
	}
}
