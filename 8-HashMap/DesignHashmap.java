// URL : https://leetcode.com/problems/design-hashmap/

import java.util.ArrayList;
import java.util.List;



class MyHashMap {
    final class Node {
        int key, data;
        public Node(int key, int data) {
            this.key = key;
            this.data = data;
        }
    }
    
    Node[] buckets = new Node[100000];
        
    private int getKey(int key) {
        return key%buckets.length;
    } 
    
    public MyHashMap() {
        
    }
    
     public void put(int key, int data) {
        int index = getKey(key);
        if (buckets[index] == null) {
            Node node = new Node(key, data);
            buckets[index] = node;
        }
        else {
            buckets[index] = new Node(key, data);
        }
    }
    
    public int get(int key) {
        int index = getKey(key);
        return buckets[index] == null ? -1 : buckets[index].data;
    }
    
    public void remove(int key) {
        int index = getKey(key);
        buckets[index] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
