/**
2017-10-5 19:33:52
���󣺶���һ���������Ƚ��������Ƿ����
˼·�������ı�д��Ҫ��ȷ�������⣺
			��ȷһ��������ܵĽ����ʲô��
					�������Ȼ��߲���� --- boolean����
			��ȷ�����������ʵ�ֹ������Ƿ���δ֪���ݲ������㣿
					�У���Ҫ������Ƚϵ����� --- int
*/

class Function2
{
	public static void main(String args[])
	{
		boolean e = equal(5,6);  //�����ķ���ֵ������ʲô����Ӧ��������ݵ����;���ʲô
		System.out.println(e);
		
	}
	
	public static boolean equal(int x, int y)
	{
		//�߼�д������Ϊreturn�����صľ���boolean���͵�ֵ
		
		return x == y;
		
//		if(x == y)
//			return true;
//
//		else 
//			return false;		
	}
	
}