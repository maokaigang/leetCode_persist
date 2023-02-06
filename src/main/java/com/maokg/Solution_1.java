package com.maokg;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                ans[0] = map.get(num);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_1 solution = new Solution_1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = solution.twoSum(nums,target);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
