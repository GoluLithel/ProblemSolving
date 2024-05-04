package JAVALeetCode.Easy.LengthOfLastWord58;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean spaceFlag = true;
        int count = 0;
        for(int i=0; i< s.length(); i++) {
            if (s.charAt(i)==' ') {
                spaceFlag = true;
            } else {
                if (spaceFlag) {
                    count = 0;
                    spaceFlag = false;
                }
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello world")); // 5
        System.out.println(new LengthOfLastWord().lengthOfLastWord("I am your best       frnd     ")); // 5
    }
}