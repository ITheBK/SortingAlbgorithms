public class InsertionSort {

	public static void main(String args[]) {
		int arr[] = new int[]{5,4,3,7,1,2};
		
		System.out.print("Input : [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + (i==arr.length-1?"" : ", "));
		}
		System.out.println("]");


		arr = insertionSort(arr, arr.length);

		System.out.print("Output : [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + (i==arr.length-1?"" : ", "));
		}
		System.out.println("]");



	}
	/*
		Best case: 0(n) : where items are sorted.
		Average case: O(n^2) : Unsorted.
		Worst case: O(n^2) : Fully unsorted.

	**/
	static int[] insertionSort(int a[], int n) {
		for(int i=1;i<n;i++) {
			int val = a[i];
			int hole = i;
			while(hole>0 && a[hole-1]>val) {
				a[hole] = a[hole-1];
				hole = hole-1;
			}
			a[hole] = val;
		}
		return a;
	}
}