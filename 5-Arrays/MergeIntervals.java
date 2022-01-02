import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;


class MergeIntervals {
    static public int[][] merge(int[][] intervals) {
        int start[] = new int[intervals.length];
        int end[]   = new int[intervals.length];
        
        for(int i=0;i<intervals.length;i++) {
            start[i] = intervals[i][0];
            end[i]   = intervals[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        List<int[]> list = new LinkedList();
        for(int i = 0 ; i < start.length;) {
            int _begin = i;
            int _end   = i;
            
            while(i<start.length && start[i]<=end[_end]) {
                if(end[i]>=end[_end]) {
                    _end=i;
                    i++;
                }else{
                    break;
                }
            }
         int [] select= new int[2];
            select[0]=start[_begin];
            select[1]=end[_end];
            list.add(select);
        }
        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
    	int[][] temp = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = merge(temp);

    	for(int[] t : res) {
    		System.out.println(Arrays.toString(t));
    	}
    }

}