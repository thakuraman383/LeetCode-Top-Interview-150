//Problem 88 on leetcode 


class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int pos =0;
        int res[] = new int [m+n];
        while(i<m && j< n){
            if(nums1[i]<=nums2[j]){
                res[pos] = nums1[i];
                i++;
                pos++;
            }
             if(nums1[i]>=nums2[j]){
                res[pos] = nums2[j];
                j++;
                pos++;
            }
        }
        while(i<m){
            res[pos] = nums1[i];
            i++;
            pos++;
        }
        while(j<n){
            res[pos] = nums2[j];
            j++;
            pos++;
        }
        for(int a = 0; a< m+n;a++){
            nums1[a] = res[a];
        }
    
}
}