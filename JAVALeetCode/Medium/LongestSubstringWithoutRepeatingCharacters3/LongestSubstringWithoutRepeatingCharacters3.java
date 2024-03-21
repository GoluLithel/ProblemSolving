package JAVALeetCode.Medium.LongestSubstringWithoutRepeatingCharacters3;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder longestStr = new StringBuilder("");
        int maxLength = 0;
        for(char ch: s.toCharArray()) {
            int repeatedCharIndex = longestStr.indexOf(ch + "");
            if (repeatedCharIndex == -1) {
                longestStr.append(ch + "");
                if (maxLength < longestStr.length()) {
                    maxLength = longestStr.length();
                }
            } else {
                longestStr.delete(0, repeatedCharIndex+1);
                longestStr.append(ch + "");
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters3().lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(new LongestSubstringWithoutRepeatingCharacters3().lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(new LongestSubstringWithoutRepeatingCharacters3().lengthOfLongestSubstring("pwwkew")); //3
    }
}
