package com.search.analytics.anagram;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GroupAnagramTest {
	
	private static GroupAnagram anagramObj;
	
	@BeforeAll
	public static void setup() {
		anagramObj = new GroupAnagram();
	}
	
	@Test
    public void countAnagramGrouping() {
       
        String[] inputValues = { "CAT","DOG", "TAC", "MAD","DAM", "AMD", "GOD", "SET" };
        Collection<List<String>> actualResult = anagramObj.groupAnagramsTogether(inputValues);
        
        assertEquals(actualResult.stream().count(),4);
    }
	
	@Test
    public void anagramGroupingNullCheck() {
       
        String[] inputValues = { "CAT","DOG", null, "MAD","DAM", "AMD", "GOD", "SET" };
        Collection<List<String>> actualResult = new GroupAnagram().groupAnagramsTogether(inputValues);
        
        assertEquals(actualResult.stream().count(),4);
    }
}
