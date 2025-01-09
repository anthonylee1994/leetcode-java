package com.learn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author anthonylee
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(result[0] + " " + result[1]); // 0 1
    }
}