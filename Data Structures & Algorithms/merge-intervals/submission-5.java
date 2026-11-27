class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int i = 1; 
        if(n == 0 ){
            return intervals;
        }
        int[] currInterval = intervals[0];
        List<int[]> ans = new ArrayList();
        //the current one ends completely before the next interval starts
        while( i < n){
            if (currInterval[1] >= intervals[i][0]){
                currInterval[0] = Math.min(currInterval[0], intervals[i][0]);
                currInterval[1] = Math.max(currInterval[1], intervals[i][1]);
                i++;
            }else{
                ans.add(currInterval);
                currInterval = intervals[i];
            }

        }
        ans.add(currInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
