/**
2017-10-5 19:00:10
�����ڿ���̨��ӡһ�����Σ�ͨ�����ú�����ʵ��
˼·�������ı�д��Ҫ��ȷ�������⣺
			��ȷһ��������ܵĽ����ʲô��
					û�н������Ϊ��ֱ�Ӵ�ӡ�ڿ���̨�ϵģ�����Ҫ���ظ������� --- void
			��ȷ�����������ʵ�ֹ������Ƿ���δ֪���ݲ������㣿
					�У���Ҫ�г����εĳ��Ϳ�������������Ϊ���� --- int

*/

class Function1
{
	public static void main(String args[])
	{
		juxing(5,3);
		
	}
	
	public static  void juxing (int a, int b) //ע��������row��ʾ��  col��ʾ��
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