// URL : https://leetcode.com/problems/find-median-from-data-stream/submissions/
class MedianFinder {
    List<Integer> l = null;
    int len = 0;
	public MedianFinder() {
        l = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
       l.add(num);
        Collections.sort(l);
        len++;
    }
    
    public double findMedian() {
        if((len&1) == 1) return l.get(len>>1);
        else return (l.get(len>>1) + l.get((len>>1)-1) )/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */