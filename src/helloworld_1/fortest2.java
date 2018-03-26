/**
2017-10-4 14:51:53
需求：打印 *****
					 ****
					 ***
					 **
					 *
思路：for循环嵌套
步骤：1. 内部for循环先循环出每一行，每打印一行 --- 也就是说内部for循环完成再变量自减一；
			2. 外部for循环嵌套内部for循环输出每一列
			3. 内循环控制行 外循环控制列
			
*/


class ForTest2
{
	public static void main(String args[])
	{
/*
		int t = 5;
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < t; j++)
			{
				System.out.print("*");
			}
			t--;
			System.out.println();
		}
*/

			for(int i = 0; i < 5; i++)
		{
			for(int j = i; j < 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
	  }
  }
}