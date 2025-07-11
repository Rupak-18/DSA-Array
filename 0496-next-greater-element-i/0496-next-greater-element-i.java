class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n1 = nums1.length;
        int n2 = nums2.length;

        for(int i = n2-1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= nums2[i]) 
                st.pop();
            if(st.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], st.peek());
            st.push(nums2[i]);  
        }

        for(int i = 0; i < n1; i++) {
            answer[i] = map.get(nums1[i]);
        }
        return answer;
    }
}