// Time Complexity :O(n^2)
// Space Complexity :constant
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this :Time limit exceeded

//I am using nested loops to check each and every subarray for equal number of 0s and 1s using neutral sum
class Solution {
    public int findMaxLength(int[] nums) {
        int neutralSum = 0;
        int maxLength = 0;
        int ptr2 = 1;

        for (int i = 0; i < nums.length; i++) {
            neutralSum = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    neutralSum--;
                } else {
                    neutralSum++;
                }
                ptr2 = j;
                if (neutralSum == 0) {
                    maxLength = Math.max(maxLength, ptr2 - i + 1);// if we gor neutralSum==0, we'll update our maxLength
                }
            }

        }
        return maxLength;
    }
}