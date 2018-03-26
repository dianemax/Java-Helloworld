/**
2017-10-6 14:59:26
需求：打印 数组中的最大值
思路：需要调用函数，首先明确：
			明确一：这个函数的结果是什么？
				结果是数组中的最大数的值 --- int
			明确二：这个函数实现过程中是否有未知参数参与运算？
				有，需要一个  ---  数！组！（求哪个数组中的最大值）
			
*/

class ArrayMax
{
	public static void main(String args[])
	{
		int[] arr = {34,16,35,74,85};
		int max = max_array(arr);
		System.out.println("max = " + max );
	}
	
	public static int max_array(int[] a)
	{
		int max;
		max = a[1];
		
		for(int i = 0;i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}		
		}
		return max;
	}

}