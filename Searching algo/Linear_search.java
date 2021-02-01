import java.util.*;
class Linear_search {
	public static void main(String[] args) {
		int a[] = {5,6,8,4,2,9};
		int key = 8;
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == key)
			{
				System.out.println("key "+key+" present");
				temp = 1;
				break;
			}
		}
		if(temp == 0)
			System.out.println("key is not present");
	}
}