/**
2017-10-7 10:12:13
需求：查找数组中是否存在一个数
思路：1. 通用方法 --- for循环挨个查找
			2. 折半查找（二分法查找） --- 前提是数组需要提前排好序
				2.1 数组排序
				2.2 折半查找
				2.3 被调函数需要明确两个问题
					明确一：被调函数的结果是什么？
						是所需要查找数字的下标 --- int
					明确二：被调函数中是否还要引用未知参数
						需要，一个是调用哪个数组 一个是需要查找的数
*/

class Search
{
	public static void main(String args[])
	{
		int[] arr = {34,28,1,95,5,25};
		printarray(arr);
		sort(arr);
		printarray(arr);
		int index = search(arr,28);
		System.out.println("Index = " + index);
		
	}
	
	public static int search(int[] arr, int key)
	{
		int min = 0;
		int max = arr.length-1;
		int mid ;
		while(min <= max)
		{
			mid = (min + max)>>1;
			if(key > arr[mid])
			{
				min = mid + 1;
			}	
			else if(key < arr[mid])
			{
				max = mid - 1;
			}
			else
			return mid;
		}
		return -1;
	}
	
	public static void sort(int[] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length-1)
			System.out.print(arr[i] + ", ");
			else
			System.out.print(arr[i] + "]");
		}
		System.out.println();
	}
	
}