// URL : https://leetcode.com/problems/find-median-from-data-stream/submissions/

import java.util.ArrayList;
import java.util.List;

class MedianFinder {
    List<Integer> l = null;
    int len = 0;
    public MedianFinder() {
        l = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
       int start = 0, end = this.len;
       while (start < end) {
           int curr = (start+end)/2;
           if(l.get(curr) > num) 
                end = curr;
            else start = curr + 1;
       }
       this.l.add(start, num);
        this.len += 1;
       // System.out.println(this.l);
    }
    
    public double findMedian() {
        if((len&1) == 1) return l.get(len>>1);
        else return (l.get(len>>1) + l.get((len>>1)-1) )/2.0;
    }
}
