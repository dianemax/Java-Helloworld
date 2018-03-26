/**
time：2017-10-10 22:10:57
author：@su

需求：对数组数据排序
步骤：打印：printarray函数
				1. 无需返回 --- void
				2. 需要未知参数参与 --- int[]
			排序：for循环嵌套 --- 选择排序
				1. 无需返回 --- void
				2. 需要未知参数参与 --- int[]

*/

class SortPractice
{
	public static void main(String args[])
	{
		int[] arr = {34,19,56,5,109,28};
		printarray(arr);
		sort(arr);
		printarray(arr);
	}
	
	public static void sort(int[] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=0; j <arr.length-1-i; j++ )
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	} 
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int i=0; i <arr.length; i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}
	
}