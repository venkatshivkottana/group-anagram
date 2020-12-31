package com.search.analytics.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {
	/*
	 * Input for this method is array of strings 
	 * It loops through all the string values
	 * For each String ,the string is converted to char array,sort all the characters and convert it back to String 
	 * Check the sorted value is present as key in Map if it present append the string to the list
	 * if it is not present make a new list and insert the value
	 */

	public static void groupAnagramsTogether(String[] anagramStrings) {
		List<String> anagramList = Arrays.stream(anagramStrings).collect(Collectors.toList());
		Map<String, List<String>> valueMap = new HashMap<>();

		for (int i = 0; i < anagramList.size(); i++) {

			char[] charArray = anagramList.get(i).toCharArray();
			Arrays.sort(charArray);
			String key = new String(charArray);

			valueMap.putIfAbsent(key, new ArrayList<>());
			valueMap.get(key).add(anagramList.get(i));
		}
		
		valueMap.values().stream().forEach(System.out::println);
	}

	public static void main(String[] args) {

		String[] testStrings = { "CAT","DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET" };
		groupAnagramsTogether(testStrings);

	}
}
