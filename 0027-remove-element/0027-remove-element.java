class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != val) swap(nums, left++, right);
        }
        return left;
    }

    public static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}