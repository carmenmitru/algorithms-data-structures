import java.util.*;
class Solution {
	
	/*
		Time Complexity : 
		sorting : 0(nlogn) 
		check equlity :O(n)
		
		
		Total : O(nlogn) 
	*/
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);
	}
			
	public static void main(String[] args) {
		 System.out.println(isAnagram("anagram","nagaram"));
	}
}
