import java.util.*;
class MergeSort {
	int[] arr;
	int[] temp;
	int len;
	public static void main(String[] args) {
		int a[] = {15,9,7,13,12,16,4,18,11};
		MergeSort ms = new MergeSort();
		ms.sort(a);
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public void sort(int a[])
	{
		this.arr = a;
		this.len = a.length;
		this.temp = new int[len];
		divide(0,len-1);
	}
	public void divide(int low,int high)
	{
		if(low<high) {
			int mid = (low+high)/2;
			divide(low,mid);
			divide(mid+1,high);
			merge(low,mid,high);
		}
	}
	public void merge(int low,int mid,int high)
	{
		for(int i=low;i<=high;i++)
		{
			temp[i] = arr[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high)
		{
			if(temp[i] <= temp[j])
			{
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			arr[k] = temp[i];
			k++;
			i++;
		}
		while(j<=high)
		{
			arr[k] = temp[j];
			j++;
			k++;
		}
	}
}