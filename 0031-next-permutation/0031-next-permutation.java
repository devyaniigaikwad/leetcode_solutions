class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length-2;
        while (index>=0 && nums[index]>= nums[index+1]) index--;
        if (index>=0) {
            int j = nums.length-1;
            while (nums[j] <= nums[index]) {
                j--;
            }
            swap(nums, index, j);
        }
        reverse(nums, index+1, nums.length-1);
    }
    public static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j); i++; j--;
        }
    }
}