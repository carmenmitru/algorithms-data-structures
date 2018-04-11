import java.util.*;
class Solution {
	
	/*
	Time Complexity : 
	sorting : 0(nlogn) 
	check equlity :O(n)
	
	
	Total : O(nlogn) 
	*/
	public boolean isAnagramV1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);
	}
	static boolean isAnagram(String s, String t){
		if(s == null || t == null) return false;
		if(s.length()!=t.length()) return false;
		 
		HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();    
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		
		for(int i = 0; i < s1.length; i++){
				if( !letterCount.containsKey(s1[i])){
					letterCount.put(s1[i], 1);
				}else{
					letterCount.put(s1[i], letterCount.get(s1[i]) + 1);
				}
			}
			for(int i = 0; i < t1.length; i++){
				if(letterCount.containsKey(t1[i])){
					letterCount.put(t1[i], letterCount.get(t1[i]) - 1);
				}
			}
			for(int i = 0; i < s1.length; i++){
				 if(letterCount.get(s1[i]) > 0) return false;
			}
			
		return true;
			            
	}
	public static String compression(String str) {
			StringBuffer sb = new StringBuffer();
			char last = str.charAt(0);
			int count = 1;
			for (int i = 1; i< str.length(); i++) {
				if (str.charAt(i) == last) {
					count++;
				} else {
					sb.append(last + "" + count);
					count = 1;  // here count should be 1 but not 0
				}
				last = str.charAt(i);
			}
			sb.append(last + "" + count); //reflush the last part
			
			String newStr = sb.toString();
			if (newStr.length() < str.length()) {
				return newStr;
			} else {
				return str;
			}
	}
		
	public static void main(String[] args) {
		// System.out.println(isAnagram("anagram","nagaram"));
		 System.out.println(compression("a"));
		/*
			HashMap<String, String> phoneBook = new HashMap<String, String>();
			System.out.println("HashMap is empty " + phoneBook.isEmpty());
			// Adding elements to HashMap
			phoneBook.put("Andrew", "055444");
			phoneBook.put("John", "2585");
			phoneBook.put("Carmen", "88855");
			phoneBook.put("Alicia", "999");
			
			//Check if hashmap is empty
			System.out.println("HashMap is empty " + phoneBook.isEmpty());
			
			//Size of the hashmap
			System.out.println("Size of the hashMap " + phoneBook.size());
	
			// Iterate through HashMap
			for(Map.Entry contact : phoneBook.entrySet()){  
			 System.out.println(contact.getKey()+" "+ contact.getValue());  
			} 
			
			String key = "Carmen";
			
			//Search for a value 
			String phone = phoneBook.get(key);
			System.out.println("Phone number of Carmen is  : " + phone);  
			
			//Check if hashmap contains a certain key
			System.out.println("Phone book containts key Carmen " + phoneBook.containsKey(key));  
			
			//Delete a key
			phoneBook.remove(key);
			for(Map.Entry contact : phoneBook.entrySet()){  
			 System.out.println(contact.getKey()+" "+ contact.getValue());  
			} 
				
		*/	

	}
}