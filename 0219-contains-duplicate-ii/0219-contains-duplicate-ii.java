class Solution {
    /**
     * Time Complexity: O(n) - We traverse the array once, and HashMap operations (get/put) are O(1) on average.  
     * Space Complexity: O(n) - The HashMap could, in the worst-case, hold all distinct elements of the array.  
     * Its like hosting a party: if everyones unique, your house fills up; duplicates leave early.
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // A map to remember where weve last seen each number. Think of it as our memory journal.
        Map<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array with the precision of a scientist and the patience of a detective.
        for (int index = 0; index < nums.length; index++) {
            // If we've seen this number before, and it's "nearby," we've got a duplicate situation.
            if (map.containsKey(nums[index]) && index - map.get(nums[index]) <= k) {
                return true; // Case closed, the culprit is found!
            }
            // Update the map with the current location of this number.
            map.put(nums[index], index);
        }
        
        // If we've reached here, the data set is as clean as a freshly debugged codebase.
        return false;
    }
}