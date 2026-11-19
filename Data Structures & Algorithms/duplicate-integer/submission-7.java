class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean>visit = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(visit.containsKey(nums[i])){
                return true;
            }
            else{
                visit.put(nums[i], true);
                continue;
            }
        }
        return false;
    }
}