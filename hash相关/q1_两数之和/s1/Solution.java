import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 示例
 给定 nums = [2, 7, 11, 15], target = 9
 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 **/

/**
 * 解题思路：遍历整数数组，验证目标值-整数数据得到的差是否在原数组中，使用hashmap保存原始数组元素及索引位置
 * **/


class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int [2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            if (map.containsKey(target-nums[i])){
                // System.out.println(target-nums[i]);
                int index1 = map.get(target-nums[i]);
                result[0] = index1;
                result[1] = i;
                return result;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    };

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] testNum = {3, 2, 3, 15};
        int[] res= test.twoSum(testNum, 6);
        System.out.println(Arrays.toString(res));
    }
}