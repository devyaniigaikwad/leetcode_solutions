class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            arr[i] = i;
        }
        sort(nums, arr);
        int low = 0; int high = nums.length-1;
        while (low<high) {
            if (nums[low]+nums[high] == target) {
                return new int[]{arr[low], arr[high]};
            } else if (nums[low]+nums[high] > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{arr[low], arr[high]};
    }
    public static void sort(int[] nums, int[] arr) {
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                    int temp2 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp2;
                }
            }
        }
    }
}