class Solution {
    public List<Integer> getRow(int rowIndex) {
        int row = rowIndex + 1;
        List<Integer> ans = new ArrayList<>();
        long res = 1;
        ans.add((int)res);
        for(int i = 1; i < row; i++) {
            res = res * (row - i);
            res = res / i;
            ans.add((int)res);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            ans.add(getRow(i));
        }
        return ans;
    }
}