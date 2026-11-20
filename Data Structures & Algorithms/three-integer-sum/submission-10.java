class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i ++){
            int a = nums[i];
   
            if (i!= 0 && nums[i-1] == nums[i] ){
        
                continue; //this one was already added to the set
            }else{
                int leftPointer = i + 1; 
                int rightPointer = nums.length - 1;
                while (leftPointer < nums.length && rightPointer >=0 && leftPointer  < rightPointer){
                   int total = a + nums[leftPointer] + nums[rightPointer];
                   if (total == 0 ){
                    answer.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                    leftPointer++; //move past the numbers we just used
                    rightPointer--;
                    while(leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer-1]){
                           leftPointer++; 
                    }
                    while(rightPointer > leftPointer && nums[rightPointer] == nums[rightPointer+1]){
                            rightPointer--;
                    }
                   }
                   if (total < 0){
   
                    leftPointer +=1;
                   
                    continue;
                   }
                   if (total > 0){

                    rightPointer-=1;
 
                    continue;
                   }
                }
            }
    
        
        }
        return answer;

    }
}
