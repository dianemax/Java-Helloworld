/**
2017-10-3 16:50:05
���������·ݣ��ж������ļ���
			������3 4 5   �ļ���6 7 8   �＾��9 10 11   ������12 1 2

˼·��1. ����if�ж���䣬������1-12���жϲ���ӡ����ȷ�������ڣ��������1-12֮������ָ�����Ӧ������ʾ
			2. ����switch����ж�

�ĵã�1. ������ֱ�﷽ʽ������ʵ��
						//if(month == 3 || month == 4 || month == 5) --- ���ݼ�ʱ��ʹ��
						//if(month == 3 | month == 4 | month == 5)
				 ����
				 | --- ���򣺾����������true��ҲҪ������������ִ��
				 || --- ˫�򣺵���ߵ��жϽ��Ϊtrueʱ����ִ���ұ� --- Ч�ʸ��ߣ����С���·������
			2. һ��Ҫ��Ӣ�Ļ��������룬���ַǷ��ַ�����ʾ���������������
					1> �ֺ�     Ӣ��״̬ --- ;     ����״̬ --- ��    
					2> ˫����   Ӣ��״̬ --- ""    ����״̬ --- ����  
			3. ����ʹ������ if��month >= 3 && month <= 5��--- ��������������ݽ϶�ʱʹ��
*/
class IfTest
{
	public static void main(String args[])
	{
		int month;
		month = 5;
		
//		if(month == 3 || month == 4 || month == 5)
		if(month == 3 | month == 4 | month == 5)
		{
			System.out.println(month + "is spring");
		}
		else if(month == 6 || month == 7 || month == 8)
		{
			System.out.println(month + "is summer");
		}
		else if(month == 9 | month == 10 | month == 11)
		{
			System.out.println(month + "is autumn");
		}
		else if(month == 12 | month == 1 | month == 2)
		{
			System.out.println(month + "is winter");
		}
		else
		{
			System.out.println("wrong number!");
		}
	}
}