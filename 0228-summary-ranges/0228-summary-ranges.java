class Solution {
    // 
    // Time complexity: O(n) since we go over each element in the array
    // Space complexity: O(1) we create 2 int, 1 boolean variables and an ArrayList, so O(4) => O(1)
    public List<String> summaryRanges2(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int start_index = 0;
        int last_num = nums[0];
        boolean flag = false;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == last_num + 1){
                flag = true;
                last_num = nums[i];
            } 
            else {
                if(flag)    result.add(nums[start_index] + "->" + nums[i-1]);
                else        result.add(nums[i-1] + "");
                flag = false;
                last_num = nums[i];
                start_index = i;
            }
        }
        if(flag)    result.add(nums[start_index] + "->" + nums[nums.length-1]);
        else        result.add(nums[nums.length-1] + "");
        return result;
        
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) start = nums[i];
            }
        }
        return result;
    }
}