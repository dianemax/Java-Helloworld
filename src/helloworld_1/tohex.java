/**
2017-10-7 14:35:52
需求：输入一个数，打印出相应的16进制数
思路：需要调用函数，首先应该明确两个问题
			明确一：被调函数运算的结果是什么？
				没有结果，运算完后存贮在数组中，依次打印 --- void
			明确二：被调函数需要未知参数参与运算吗？
				需要：将哪个数变为十六进制就在被调函数输入多少 --- int
问题：该程序不熟练！
			该程序不熟练！
			该程序不熟练！
*/

class Tohex
{
	public static void main(String args[])
	{
		int num;
		toHex(60);
		
	}
	
	public static void toHex(int num)
	{
		if(num == 0)
		{
			System.out.println("0");
			return;
		}

		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		char[] arr = new char[8];			//定义一个临时容器 --- 数组
		int pos = arr.length;			//用于存取数组中数字的指针
					
		while(num != 0)
		{
			int temp = num & 15;
			arr[--pos] = chs[temp];
			//arr[pos--] = chs[temp];		//下标越界
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8  
			num = num >>> 4;
			
		}
		for(int x=pos; x < arr.length; x++)
		{
			System.out.print(arr[x] + " ");
		}
		System.out.println();
	}
	
}