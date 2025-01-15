class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int lengthNums = nums.length;
        if(lengthNums == 0) return result;
        if(lengthNums == 1) {
            result.add(nums[0]+"");
            return result;
        }
        int left = nums[0]-1;
        int right = nums[0];

        for (int i = 1; i <= lengthNums; i++){
            if(nums[i-1] == right+1){
                right = nums[i-1];
                continue;
            }
            if(left == right)   result.add(left + "");
            else                result.add(left + "->" + right);
            
            left =  nums[i-1];
            right =  nums[i-1];

        }
        


        return result;
        
    }
}