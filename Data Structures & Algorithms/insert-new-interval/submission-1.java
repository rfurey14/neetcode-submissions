class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length; 
        int i = 0; 
        int lowerBound = newInterval[0];
        int upperBound = newInterval[1];
        List<int[]> ans = new ArrayList<>();
        //while the intervals end before the newInterval starts, keep adding it to the answer
        while(i < n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        } 
        ans.add(newInterval);;
        while(i < n){
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
        
    }
}
