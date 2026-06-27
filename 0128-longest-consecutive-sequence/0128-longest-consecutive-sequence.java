class Solution {
    public int longestConsecutive(int[] nums) {
        int longSeq = 0; int streak = 0; 
        Set<Integer> map = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            map.add(nums[i]);
        }
        for (int num : map) {
            if (!map.contains(num-1)) {
                int current = num; streak = 0;
                while (map.contains(current)) {streak++; current++;}
                if (longSeq < streak) longSeq = streak;
            }
        }
        return Math.max(longSeq, streak);
    }
}