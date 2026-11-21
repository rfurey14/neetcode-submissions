class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //matrix is m *n which is row*col
        if (matrix.length == 0 ){
            return false;
        }
        int m = matrix.length; //number of rows
        int n = matrix[0].length; //number of columns

        int leftPointer= 0; 
        int rightPointer = m * n - 1; 

        while (leftPointer <= rightPointer){
            int mid = leftPointer +(rightPointer - leftPointer) /2;
            System.out.printf("mid index: %d\n", mid);
            int midRow = mid / n ; //figure out which row it is part of 
            int midCol = mid % n;
            int curr = matrix[midRow][midCol];
            System.out.println(curr);
            if (curr == target){
                return true;
            }
            if (curr < target){
                leftPointer = mid + 1;
            }
            if (curr > target){
                rightPointer = mid - 1; 
            }
        }
        return false;
        
    }
}
