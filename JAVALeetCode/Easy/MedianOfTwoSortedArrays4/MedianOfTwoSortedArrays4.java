package JAVALeetCode.Easy.MedianOfTwoSortedArrays4;

public class MedianOfTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // List<Integer> combinedSortedList = new ArrayList<Integer>();
        int i=0, j=0;
        // int count = 0;
        boolean isEven = ( nums1.length + nums2.length) % 2 == 0;
        int index = ( nums1.length + nums2.length ) / 2 + ((isEven)?0:1);
        int mid_1 = -1, mid_2 = -1;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mid_1 = nums1[i];
                i++;
            } else {
                mid_1 = nums2[j];
                j++;
            }
            if (i+j >= index) {
                if (isEven) {
                    if (mid_2 != -1) {
                        return (mid_1 + mid_2) / 2.0;
                    } else {
                        mid_2 = mid_1;
                    }
                } else {
                    return mid_1;
                }
            }
        }

        System.out.println(i);
        System.out.println(j);
        System.out.println(mid_1);
        System.out.println(mid_2);

        if (i == nums1.length) {
            while(j < nums2.length) {
                // combinedSortedList.add(nums2[j]);
                mid_1 = nums2[j];
                System.out.println(mid_1);
                System.out.println(isEven);
                j++;

                if (i+j >= index) {
                    if (isEven) {
                        if (mid_2 != -1) {
                            return (mid_1 + mid_2) / 2.0;
                        } else {
                            mid_2 = mid_1;
                        }
                    } else {
                        return mid_1;
                    }
                }
            }
        } else {
            while(i < nums1.length) {
                mid_1 = nums1[i];
                // combinedSortedList.add(nums1[i]);
                i++;
                
                if (i+j >= index) {
                    if (isEven) {
                        if (mid_2 != -1) {
                            return (mid_1 + mid_2) / 2.0;
                        } else {
                            mid_2 = mid_1;
                        }
                    } else {
                        return mid_1;
                    }
                }
            }
        }

        // float median;
        // int size = combinedSortedList.size();
        // if (size % 2 == 0) {
        //     int index1 = size / 2 - 1;
        //     int index2 = size / 2;
        //     median = (combinedSortedList.get(index1) + combinedSortedList.get(index2)) / 2.0f;
        // } else {
        //     median = combinedSortedList.get(size/2);
        // }

        if (mid_2 != -1) {
            return (mid_1 + mid_2) / 2.0;
        } else {
            return mid_1;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 5, 7, 9, 10};
        int[] nums2 = { 1, 4, 5, 7, 9};

        System.out.println(new MedianOfTwoSortedArrays4().findMedianSortedArrays(nums1, nums2));
    }
}
