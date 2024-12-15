class Solution {

    

    // The Boyer-Moore algorithm uses a greedy approach to find the majority element in O(n) time with O(1) space.
    // Time complexity O(n) 
    // Space complexity O(1) 
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find the candidate
        for (int num : nums) {
            if (count == 0)     candidate = num;
            // count += (num == candidate) ? 1 : -1;
            if(num == candidate)        count = count + 1;
            else                        count = count -1;
        }

        // Step 2: Candidate is guaranteed to be the majority element
        return candidate;
    }

    // Use a hash map to count the occurrences of each element.
    // Time complexity O(n) 
    // Space complexity O(n) 
    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int n = nums.length;
        int max = 0;
        int result = 0;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > max) {
                max = counts.get(num);
                result = num;
            }
        }
        return result;
    }

    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }



}