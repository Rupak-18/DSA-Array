class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] mergeArray = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                mergeArray[k++] = nums1[i++];
            } else {
                mergeArray[k++] = nums2[j++];
            }
        }
        while (i < n) {
            mergeArray[k++] = nums1[i++];
        }

        while (j < m) {
            mergeArray[k++] = nums2[j++];
        }

        int mid = (m + n) / 2;
        return (m + n) % 2 == 0 ?
            (mergeArray[mid] + mergeArray[mid - 1]) / 2.0 : mergeArray[mid];
    }
}
