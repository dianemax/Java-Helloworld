/**
2017-10-4 00:17:33
���󣺻�ȡ1-10��ʮ�����ֵĺ�
˼·��1. whileѭ��
			2. forѭ��
			3. do whileѭ�� --- ��Ҫ����while�����;
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