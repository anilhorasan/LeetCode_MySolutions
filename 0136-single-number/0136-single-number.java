class Solution {

    // XOR Operation (Optimized Solution)
    // Time complexity O(n)
    // Space complexity O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
    

    // Hashmap solution
    // Time complexity O(n) - nested loops are twice passed but total it makes O(n)
    // Space complexity O(n)
     public int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            // Increment count or add to map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the single number
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        
        throw new IllegalArgumentException("Input does not meet constraints");
    }

    // Brute Force with Nested Loops
    // Time complexity O(n^2)
    // Space complexity O(1)
    public int singleNumber3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isSingle = false;
                    break;
                }
            }
            if (isSingle) {
                return nums[i];
            }
        }
        return -1; // Should never reach here
    }

}