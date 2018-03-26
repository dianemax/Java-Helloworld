/**
2017-10-5 19:00:10
需求：在控制台打印一个矩形，通过调用函数来实现
思路：函数的编写需要明确两个问题：
			明确一：这个功能的结果是什么？
					没有结果，因为是直接打印在控制台上的，不需要返回给调用者 --- void
			明确二：这个函数实现过程中是否有未知内容参与运算？
					有，需要有长方形的长和宽，两个变量，都为整形 --- int

*/

class Function1
{
	public static void main(String args[])
	{
		juxing(5,3);
		
	}
	
	public static  void juxing (int a, int b) //注：可以用row表示行  col表示列
	{
		for(int j = 0;j < b;j++)
		{
			for(int i = 0;i < a;i++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
}