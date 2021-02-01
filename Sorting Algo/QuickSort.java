import java.util.*;
class QuickSort {
	public static void main(String[] args) {
		int a[] = {15,9,7,13,12,16,4,18,11};
		int len = a.length-1;

		QuickSort qs = new QuickSort();
		qs.sort(a,0,len);
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	void sort(int[] a,int low, int high) {
		
		int pi = partition(a,low,high);
		if(low < pi-1) {
			sort(a,low,pi-1);
		}
			
		if(pi<high) {
			sort(a,pi,high);
		}	
	}

	int partition(int[] a,int low,int high)
	{
		int pivot = a[(low+high)/2];
		
		while(low<=high) {
			while(a[low]<pivot) {
				low++;
			}
			while(a[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;

				low++;
				high--;
			}
		}
		return low;	
	}
}