class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        int i = 1;
        int[] currInterval = intervals[0];
        while (i < n){
            if (currInterval[1] >= intervals[i][0]){
                currInterval[0] = Math.min(intervals[i][0], currInterval[0]);
                currInterval[1] = Math.max(intervals[i][1], currInterval[1]);
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
