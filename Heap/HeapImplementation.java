import java.util.Arrays;

final class Heap {
	int[] arr = null;
	int curr  = 0;
	Heap() {}
	Heap(int len) {
		this.arr = new int[len];
	}
	Heap(int[] arr) {
		this.arr = arr;
	}
	int getLeft(int ind) {
		if(this.arr.length > (ind+1))
			return arr[ind+1];
		return -1;
	}
	int getRight(int ind) {
		if(this.arr.length > ind)
			return arr[ind-1];
		return -1;
	}
	void insert(int data) {
		this.arr[this.curr++] = data;
	}
	public String toString() {
		return Arrays.toString(this.arr);
	}
} 


class HeapImplementation {
	public static void main(String[] args) {
		Heap h = new Heap(5);

		for(int num : new int[] {100, 10, 20, 3 ,6}) {
			h.insert(num);
		}


	}
}