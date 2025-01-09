package com.learn;

/**
 * @author anthonylee
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] nums = {1, 2, 1};
        int[] result = concatenationOfArray.getConcatenation(nums);

        for (int j : result) {
            System.out.println(j);
        }
    }
}
