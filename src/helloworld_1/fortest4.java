/**
2017-10-4 23:33:06
���󣺴�ӡ * * * * *
						* * * *
						 * * *
						  * *
						   *
˼·��forѭ��Ƕ�ף�if�ж����
���裺//error    1. �ڲ�forѭ������У����ɡ� ���͡�*����ɣ��������
								 2. �ⲿforѭ�������
								 3. ���ν���
			1. ����һ���ո���ɵ������������һ���пո��Ǻ���ɵ�����������
			2. ������������������ʹ������forѭ��
			3. �����������������з�����ͬʱ��������Ҫ��һ��forѭ����Ƕ����������forѭ����������������forѭ����ͬ����
			
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
		for(int i = 1; i <= 5; i++) //i ��
		{
			for(int j = 1,k = 0; j <= 5; j++)//j �� �� k �ո�
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