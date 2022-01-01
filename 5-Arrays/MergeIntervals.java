import java.util.Arrays;

class MergeIntervals {
	static private void swap(int[][] intervals, int i, int j) {
        int temp = intervals[i][0];
        intervals[i][0] = intervals[j][0];
        intervals[j][0] = temp;
        
        temp = intervals[i][1];
        intervals[i][1] = intervals[j][1];
        intervals[j][1] = temp;
    }
    
    static public int[][] merge(int[][] intervals) {
        int[][] result = new int[intervals.length][2];
        
        for(int i=0;i<intervals.length-1;i++) {
            for(int j=0;j<intervals.length;j++) {
                if(intervals[i][0] < intervals[j][0]) {
                    swap(intervals, i, j);
                }
            }
        }
        
        int min = intervals[0][0];
        int max = intervals[0][1];

        int[][] res = new int[1][2];

        

        for(int i=1;i<intervals.length;i++) {

            if(intervals[i][0] >= min && intervals[i][0] <= max) {
                max = intervals[i][0];
            } else {
                          
            }
        }
        return intervals;
    }

    public static void main(String[] args) {
    	int[][] temp = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = merge(temp);

    	for(int[] t : res) {
    		System.out.println(Arrays.toString(t));
    	}
    }

}