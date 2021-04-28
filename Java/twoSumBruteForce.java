// Given an array of integers and a target integer, return indices
// of the two numbers so that, when summed, they total target.

// Assume each input has exactly one solution, and that each element only
// is used once.

// Return the answer in any order. 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        for (int current = 0; current < nums.length; current++) { // For num in nums
            for (int offset = current + 1; offset < nums.length; offset++) { // For nums offset from num.
                if (nums[current] + nums[offset] == target) {
                    indices[0] = current;
                    indices[1] = offset;
                }
            }
        }
        
        return indices;
    }    
}
