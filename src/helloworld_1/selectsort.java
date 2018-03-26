/**
2017-10-6 15:58:02
需求：对一个数组进行排序 --- 选择排序
思路：需要调用函数，首先明确：
			明确一：调用函数的结果是什么？
				结果是排好序的数组 --- 无需返回 --- void
			明确二；调用函数中需不需要未知参数参与运算？
				需要，需要明确对那个函数进行排序 --- int[]
*/

class SelectSort
{
	public static void main(String args[])
	{
		int[] arr = {34,19,3,109,65,28};
		printarray(arr);
		selectsort(arr);
		printarray(arr);
		
	}
	
	public static void selectsort(int [] arr)
	{
		for(int x = 0; x < arr.length-1; x++)
		{
			for(int y = x + 1; y < arr.length; y++)
			{
				if(arr[x] > arr[y])
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
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