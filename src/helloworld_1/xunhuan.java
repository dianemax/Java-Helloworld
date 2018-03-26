/**
2017-10-4 00:17:33
需求：获取1-10这十个数字的和
思路：1. while循环
			2. for循环
			3. do while循环 --- 不要忘记while后面的;
*/
class Xunhuan
{
	public static void main(String args[])
	{
		int i = 1;
		int sum = 0;
		
//while
/*		
		while(i <= 10)
		{
			sum = sum + i;
			i++;
		}	
*/		

//for
/*	
	for(i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}
*/

//do while
		do
		{
			sum = sum + i;
			i++;
		}while(i <= 10);
		
		
		System.out.println(sum);
	}
}