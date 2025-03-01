class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> ans = new ArrayList<Integer>();

        while(top <= bottom && left <= right) {
            // left--->right
            for(int i=left; i<=right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // top--->bottom           
            for(int i=top; i<=bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // right--->left
            if(left <= right && top <= bottom) {
                for(int i=right; i>=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
           
            // bottom--->top
            if(top <= bottom && left <= right) {
                for(int i=bottom; i>=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}