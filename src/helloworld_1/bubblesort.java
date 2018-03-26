/**
2017-10-6 21:20:31
需求：将一个数组排序
思路：调用函数中需要明确两个问题：
			明确一：调用函数的返回结果是什么？
				是重新排序号的数组，没有返回值 --- void
			明确二：调用函数中有没有未知参数参与运算？
				有，需要选择对哪个数组排序 --- int[]
*/

class BubbleSort
{
	public static void main(String args[])
	{
		int [] arr = {34,19,3,109,65,28};
		printarray(arr);
		bubblesort(arr);
		printarray(arr);
		
	}
	
	public static void bubblesort(int [] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=0; j < arr.length-1-i; j++)
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
		}
		
	}
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int i=0; i < arr.length; i++)
		{
			if(i != arr.length-1)
			{
				System.out.print(arr[i] + ",");
			}
			else
			System.out.print(arr[i] + "]" );
			
		}
		System.out.println();
	}
	
}