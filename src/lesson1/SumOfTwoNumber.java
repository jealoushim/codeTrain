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

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] solution1result = SumOfTwoNumber.solution1(nums,target);
        System.out.println("solution1result:"+solution1result[0]+","+solution1result[1]);

        int[] solution2result = SumOfTwoNumber.solution2(nums,target);
        System.out.println("solution2result:"+solution2result[0]+","+solution2result[1]);
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
       throw new IllegalArgumentException("数组中不存在对应的两数之和");
    }
}
