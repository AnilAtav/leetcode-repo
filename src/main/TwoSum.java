package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // target - num[i] yi hashmap e koyar, birdahaki herhangi num[i] hasmap de var ise num[i]+hashmap[i] = targettir
    public String twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("complement: "+target+"-"+nums[i]+"="+ + complement);

            if (complementMap.containsKey(complement)) {
                return complementMap.get(complement)+" "+ i;
            }
            System.out.println("complementMap: nums[i]=" + nums[i]+" i="+ i);
            complementMap.put(nums[i], i);
        }

        return "No two sum solution";
    }
}
