import java.util.*;
class Binary_search {
	public static void main(String[] args) {
		int a[] = {2,5,7,9,12,14,16,17,19,20};
		int key = 1;
		int low=0;
		int high = a.length-1;
		int mid = (low+high)/2;
		int temp = 0;
		while(low<high)
		{
			if(a[mid] == key) {
				System.out.println("key is present");
				temp = 1;
				break;
			}
			else if(a[mid] < key) {
				low = mid+1;
			}
			else {
				high = mid;
			}
			mid = (low+high)/2;	
		}
		if(temp == 0) 
			System.out.println("key is not present");
	}
}