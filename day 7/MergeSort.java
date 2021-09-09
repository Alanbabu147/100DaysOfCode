import java.util.*;
class MergeSort
{
	static int[] getdata()
	{
		int n,i,x;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter no of elements");
		n=s1.nextInt();
		int[] a= new int[n];
		System.out.println("Enter "+n+ " elements");
		for(i=0;i<n;i++)
		{
			x=s1.nextInt();
			a[i]=x;
		}
		return a;
	}
	public static void main(String args[])
	{
		int[] arr = new int[20];
		Merge ob = new Merge();
		arr=getdata();
		ob.sort(arr, 0, arr.length-1);
		System.out.println("\nSorted array");
		for(int i =0; i<arr.length;i++)
		{
		    System.out.println(arr[i]+"");
		}
	}
}
class Merge
{
	void merge(int arr[], int beg, int mid, int end)
	{
		int l = mid - beg + 1;
		int r = end - mid;
		int LeftArray[] = new int [l];
		int RightArray[] = new int [r];
		for (int i=0; i<l; ++i)
			LeftArray[i] = arr[beg + i];
		for (int j=0; j<r; ++j)
			RightArray[j] = arr[mid + 1+ j];
		int i = 0, j = 0;
		int k = beg;
		while (i<l&&j<r)
		{
			if (LeftArray[i] <= RightArray[j])
			{
				arr[k] = LeftArray[i];
				i++;
			}
			else
			{
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i<l)
		{
			arr[k] = LeftArray[i];
			i++;
			k++;
		}
		while (j<r)
		{
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}
	void sort(int arr[], int beg, int end)
	{
		if (beg<end)
		{
			int mid = (beg+end)/2;
			sort(arr, beg, mid);
			sort(arr , mid+1, end);
			merge(arr, beg, mid, end);
		}
	}
}
