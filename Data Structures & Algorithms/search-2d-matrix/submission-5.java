class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int m = matrix.length; //number of rows
        int n = matrix[0].length; //number of columns

        int leftPointer = 0; 
        int rightPointer = m*n - 1; 

        while(leftPointer <= rightPointer){
            int mid = leftPointer + (rightPointer-leftPointer) /2;
            int midCol = mid % n;
            int midRow = mid / n;
            int curr = matrix[midRow][midCol];
            if (curr == target){
                return true;
            }
            if (curr < target){
                leftPointer = mid + 1;
            }
            if(curr > target){
                rightPointer = mid - 1; 
            }
        }
        return false;
        

    }
}
