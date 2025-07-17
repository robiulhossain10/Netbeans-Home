/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author ROBIUL
 */
public class SumTwo {

    public static void main(String[] args) {
        int[] nums = {2, 5, 4, 7, 5};
        int target = 9;

        int[] res = twoSum(nums, target);
        System.out.println("Arrays: " + Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
