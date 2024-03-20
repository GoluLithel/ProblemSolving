class RemoveElement27 {
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
        for(int x: numbers) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(new RemoveElement27().removeElement( numbers, 2 ));
    }
}