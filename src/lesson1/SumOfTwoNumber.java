package lesson1;

import java.util.HashMap;

/**
 * TODO
 *
 * @author Sino
 * @date 2022-4-1 13:25
 */
public class SumOfTwoNumber {
    public static void main(String[] args) {

    }

    private static int[] solution1(int[] nums,int target){
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return  result;
                }
            }
        }
        return null;
    }

    private static int[] solution2(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)){
                    return new int[] { map.get(complement), i};
                }
                map.put(nums[i], i );
        }
        return null;
    }
}
