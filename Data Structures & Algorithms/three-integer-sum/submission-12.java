class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            
            if (i != 0 && nums[i] == nums[i-1]){
                continue; //already added this to the answer of a
            }
            int leftPointer = i+1;
            int rightPointer = nums.length - 1;
            while(leftPointer < rightPointer){
                int b = nums[leftPointer];
                int c = nums[rightPointer];
                
                if (a+b+c == 0 ){
                    //found a triplet!
                    answer.add(Arrays.asList(a,b,c));
                    leftPointer++;
                    rightPointer--;
                    //move past any duplicates
                    while(leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer -1]){
                        leftPointer++;
                    }
                    while(rightPointer > leftPointer && nums[rightPointer] == nums[rightPointer+1]){
                        rightPointer --;
                    }

                }
                if (a+b+c > 0){
                    rightPointer--;
                }
                if (a+b+c < 0){
                    leftPointer++;
                }
            }
        }
        return answer;
    }
}
