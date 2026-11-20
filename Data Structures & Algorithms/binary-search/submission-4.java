class Solution {
    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1;
        if (nums[low]==target){
            return low;
        }

        while(low<high){
            int middle = (low+high)/2;
            if (nums[low] == target){
                return low;
            }
            if(nums[high]==target){
                return high;
            }
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] > target){
                high = middle - 1;
            }
            if(nums[middle]<target){
                low = middle+1;
            }
        }
        return -1;
    }
}
