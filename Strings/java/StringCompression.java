class Solution {
	public static String compression(String str) {
		StringBuffer sb = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i< str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				sb.append(last + "" + count);
				count = 1;  
			}
			last = str.charAt(i);
		}
		sb.append(last + "" + count); //attach the last part
		
		String newStr = sb.toString();
		if (newStr.length() < str.length()) {
			return newStr;
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
		String str = "aaabcdddd";
		System.out.print("Compressed string of " + str + " is "  + compression(str));
	}
}
