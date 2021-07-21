package com.bridgelabz.hashtable;

import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		String s = "To be or not to be";
		String [] a = s.split(" ");
		HashMap<String, Integer> words = new HashMap<>();
		for(String str : a) {
			if(words.containsKey(str)) {
				words.put(str, 1+words.get(str));
			}else {
				words.put(str, 1);
			}
		}
		System.out.println(words);
		}
}
