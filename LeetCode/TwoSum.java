import java.util.ArrayList;

/**
 * 1. Two Sum
 * 
 * This class is designed to solve the Two Sum problem. The problem is defined
 * as follows:
 * Given an array of integers nums and an integer target, the goal is to return
 * indices of the two numbers such that they add up to target.
 * It is assumed that each input would have exactly one solution, and the same
 * element may not be used twice.
 * The answer can be returned in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * 
 * Follow-up: The goal is to come up with an algorithm that is less than O(n2)
 * time complexity.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int firstNum : nums) {
            for (int secondNum : nums) {
                if (firstNum + secondNum == target) {
                    result.add(firstNum);
                    result.add(secondNum);
                }
            }
        }
        return result;
    }
}