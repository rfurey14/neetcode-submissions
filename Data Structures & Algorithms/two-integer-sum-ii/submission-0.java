class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while(leftPointer < numbers.length && rightPointer >= 0){
            int curr_ans = numbers[leftPointer] + numbers[rightPointer];
            if (curr_ans == target){
                ans[0] = leftPointer + 1;
                ans[1] = rightPointer + 1;
                return ans;
            }
            if (curr_ans < target){
                leftPointer +=1;
            }
            if (curr_ans > target){
                rightPointer -=1;
            }
        }
        return ans;
    }
}
