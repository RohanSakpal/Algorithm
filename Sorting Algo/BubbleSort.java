import java.util.*;
class BubbleSort
{
	public static void main(String[] args)
	{
		int[] a = {36,19,29,12,5};
		int temp ,flag = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

// bubble sort is comparison based algo.
// i.e comparing each pair of adjacent item & swap if they are in wrong order.