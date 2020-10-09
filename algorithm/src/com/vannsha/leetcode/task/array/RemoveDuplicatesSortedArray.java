package com.vannsha.leetcode.task.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */

//D:
class RemoveDuplicatesSortedArray {
    public int removeDuplicatesMy(int[] nums) {
        int leng = 1;
        int temp = nums.length !=0 ? nums[0]: 0;
        for (int i : nums) {
            if (temp != i) {
                temp = i;
                nums[leng] = temp;
                leng++;
            }
        }
        return leng;
    }

    public int removeDuplicatesNormalPeople(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

