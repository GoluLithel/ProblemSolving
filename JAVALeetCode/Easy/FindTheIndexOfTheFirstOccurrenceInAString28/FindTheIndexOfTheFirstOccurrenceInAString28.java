class FindTheIndexOfTheFirstOccurrenceInAString28 {
    public int strStr(String haystack, String needle) {
        // int j;
        for(int i=0; i <= haystack.length() - needle.length(); i++) {
            // for(j=0; j < needle.length(); j++) {
            //     if(haystack.charAt(i + j) != needle.charAt(j)) {
            //         break;
            //     }
            // }
            // if (j==needle.length()) {
            //     return i;
            // }
            if(haystack.substring(i, needle.length()+i).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String args[]) {
        System.out.println(new FindTheIndexOfTheFirstOccurrenceInAString28().strStr( "adbutsad", "sad")); // Expected 5
        System.out.println(new FindTheIndexOfTheFirstOccurrenceInAString28().strStr( "sadbutsad", "sad")); // Expected 0
    }
}