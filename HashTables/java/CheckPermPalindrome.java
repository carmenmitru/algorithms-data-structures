import java.util.*;

class Solution {
	/* 
	Permutation palindrome
	Given a string, determine if a permutation of the string could form a palindrome.
	*/
	public static boolean checkPermutationPalindrome(String s){
		HashMap <Character,Integer> map = new HashMap <> ();
		for (int i = 0; i < s.length(); i++) {
					map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
	    int count = 0;
		for (char key: map.keySet()) {
			count += map.get(key) % 2;
		}
			  return count <= 1;
	}
	public static void main(String[] args) {
		
	}
}