class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 2*n-1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= nums[i % n])
                st.pop();
            if(i < n) {
                answer[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i % n]); 
        }

        return answer;
    }
}