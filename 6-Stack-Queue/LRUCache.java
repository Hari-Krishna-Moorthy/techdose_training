// URL : https://leetcode.com/problems/lru-cache/

class LRUCache {
    Map<Integer, Integer> map = null;
    int capacity ;
    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer, Integer>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)){
            int value = (int)map.get(key);
            map.remove(key);
            map.put(key, value);
            
            return value; 
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            map.remove(key);
            map.put(key, value);
            
        } else {
            map.put(key, value);
            int size = map.size();
            
            if(size > capacity){
                key = map.keySet().iterator().next();
                map.remove(key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */