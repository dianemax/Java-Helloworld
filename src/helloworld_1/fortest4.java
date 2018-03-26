/**
2017-10-4 23:33:06
需求：打印 * * * * *
						* * * *
						 * * *
						  * *
						   *
思路：for循环嵌套，if判断语句
步骤：//error    1. 内部for循环输出行，行由“ ”和“*”组成，交替出现
								 2. 外部for循环输出列
								 3. 依次交换
			1. 当成一个空格组成的上三角形阵和一个有空格星号组成的下三角形阵
			2. 上述两个三角形阵列使用两个for循环
			3. 两个三角形阵列在行方向上同时输出，因此要在一个for循环中嵌套上述两个for循环，并且上述两个for循环“同级”
			
*/

class ForTest4
{
	public static void main(String args[])
	{
		for(int i = 0; i < 5; i++)
		{
			for(int k = 0; k < i;k++)
			{
				System.out.print(" ");
			}
			for(int j = i; j < 5 ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
/*
		for(int i = 1; i <= 5; i++) //i 列
		{
			for(int j = 1,k = 0; j <= 5; j++)//j 行 ， k 空格
			{
				
				if(k != 0)
				{
					System.out.print(" ");
					k--;
					if(k == 0)
					{
						break;
					}
			  }

				else
				{
					k++;
					System.out.print("*");
					System.out.print(" ");
				}

			}
			System.out.println();
		}
*/
	}

}