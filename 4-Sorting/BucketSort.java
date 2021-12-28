import java.util.Arrays;
import java.util.Vector;
import java.util.Collections;

class BucketSort {
	
	public static float findmax(float[] arr) {
		float m = arr[0];
		for(float item : arr) {
			if(m<item) m = item;
		}
		return m;
	}
	public static float findmin(float[] arr) {
		float m = arr[0];
		for(float item : arr) {
			if(m>item) m = item;
		}
		return m;
	}

	public static void bucketSort(float[] arr, int bucketCount) {
		float min = findmin(arr);
		float max = findmax(arr);
		float range = (max - min) / bucketCount;

		Vector<Float>[] bucket = new Vector[bucketCount];

		for(int ind=0;ind<bucketCount;ind++)
			bucket[ind] = new Vector<Float>();

		for(int ind=0;ind<arr.length;ind++) {
			float diff = ((arr[ind] - min)/range) - int((arr[ind] - min) /range);
			if(diff == 0 && arr[ind] != min) 
				bucket[int((arr[i]-min)/range)-1].add(arr[i]);
			else 
				bucket[int((arr[i]-min)/range)].add(arr[i]);				
		}

		for(int ind=0;ind<arr.length;ind++) {
			Collections.sort(bucket[ind]);
		}
		int ind=0;
		for(Vector temp : bucket) {
			if(temp.size() != 0) {
				for(float i : temp) {
					arr[ind++] = i;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		float[] arr = {12.0F, 2.0F, 9.2F, 42.3F};
		bucketSort(arr, 5);
		System.out.println(Arrays.toString(arr));
	}
}