package com.learn;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anthonylee
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
}
