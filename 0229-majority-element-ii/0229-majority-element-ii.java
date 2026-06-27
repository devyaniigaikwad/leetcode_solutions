class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int x = 0;
        int num = ((int) nums.length/3);
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                x = map.get(nums[i]); x++;
                map.put(nums[i], x);
            }
        }
        for (int val : map.keySet()) {
            if (map.get(val) > num) {
                list.add(val);
            }
        }
        return list;
    }
}