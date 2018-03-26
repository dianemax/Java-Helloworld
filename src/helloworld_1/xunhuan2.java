/**
2017-10-4 00:45:27
需求：1-100之间可以整除6的个数
思路：1. 变量：一个变量用于循环，一个变量用于计数
			2. 整除：一个数 % 6 = 0,余数是0
			3. 累加利用循环：暂时选择while，学到for再加以完善
				 判断能否整除利用if
*/

class Xunhuan2
{
	public static void main(String args[])
	{
		int i = 1; //从1累加到100
		int j = 0; //可以整除的个数
		
		do
		{
			if(i%6 == 0 )
			{
				System.out.println(i);
				j++;
			}
			
			i++;
		}	while (i <= 100);
		
		System.out.println("可以整除6的整数的个数为"+j);
	}	
}


