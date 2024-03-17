class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count ++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int[] numbers = { 1, 2, 5, 0, 3, 3, 2, 2 };
        System.out.println(new Solution().removeElement( numbers, 2 ));
    }
}