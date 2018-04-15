package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		
		
		String str = "This is a Java string having duplicate Java charaters";
		
		char[] chrArray = str.toCharArray();
		
		Map<Character, Integer> map =  new HashMap<Character, Integer>();
		
		
		 for (char chars : chrArray) {
			
			if(map.containsKey(chars)) {
				map.put(chars, map.get(chars)+1);
			}else {
				map.put(chars, 1);
			}
			
		}
		
		 Set<Character> set = map.keySet();
		 
		 for (Character character : set) {
			
			 if(map.get(character) > 1) {
				 
				 System.out.println("Char "+character+" "+map.get(character));
				 
			 }
			 
		}
		
	}

}
