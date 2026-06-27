class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            long num = 1;
            for (int j=0; j<=i; j++) {
                list.add((int)num);
                num = ( num * (i-j) ) / (j+1); 
            }
            ans.add(list);
        }
        return ans;
    }
}