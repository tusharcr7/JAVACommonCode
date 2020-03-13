package compCode;

public class LongestSubstringWithNonRepeatingCharacter {

	public static void main(String[] args) {

		System.out.println(returnLongestSubstringWithNonRepeatingCharacter("abcabcbb"));
	}

	public static String returnLongestSubstringWithNonRepeatingCharacter(String str) {
		String maxSubStr = "", curSubStr = "";
		maxSubStr = str.substring(0, 1);
		curSubStr = str.substring(0, 1);

		int l = 0, r = 1;
		while (r < str.length()) {

			if (curSubStr.indexOf(str.charAt(r)) == -1) {

				curSubStr = curSubStr + str.charAt(r);
				if (curSubStr.length() > maxSubStr.length()) {
					maxSubStr = new String(curSubStr);

				}
			} else {
				while (l < r && curSubStr.indexOf(str.charAt(r)) != -1) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            					curSubStr=curSubStr.substring(++l);

				}
				curSubStr+=str.charAt(r);

				
			}
			r++;

		}
		return maxSubStr;
	}
}
