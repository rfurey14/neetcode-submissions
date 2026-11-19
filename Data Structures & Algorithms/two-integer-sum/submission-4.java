class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if (visited.containsKey(needed)){
                ans[0] = visited.get(needed);
                ans[1] = i;
                return ans;
            }
            visited.put(nums[i], i);
        }   
        return ans;
    }
}
