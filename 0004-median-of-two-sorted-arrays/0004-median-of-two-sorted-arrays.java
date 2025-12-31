class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int [] res = new int[n1 + n2];
        
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                res[k++] = nums1[i++];
            }else{
                res[k++] = nums2[j++];
            }
        }
        while(i < n1){
            res[k++] = nums1[i++];
        }
        while(j < n2){
            res[k++] = nums2[j++];
        }
        int n = (n1 + n2);
        if(n % 2 == 1) return res[n/2];
        return (res[n / 2] + res[n/2 -1]) / 2.0;
        }
}