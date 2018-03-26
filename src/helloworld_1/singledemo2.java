/**
time��2017-10-28 15:24:34
author��@su

����single --- �������ģʽ���� --- ����ʽ������ʱʹ�ý϶ࣩ
˼·��getnum()
			���裺
				1> ͨ��new�ڱ����д���һ��˽�в���̬�Ķ���
				2> ˽�л�����Ĺ��캯����
				3> ����һ����̬�Ĺ��еķ������������Ķ��󷵻ء�
�ĵã���ԭ�ж����ϼ�����������	private static Test t = new Test(); //ͨ��new����һ��˽�о�̬�ı������
																private Test(){} // ˽�л�����Ĺ��캯��
																
																public static Test getInstance() // ��һ����̬�ĸ���Ĺ��з���
																{
																	return t;
																}

*/

class Test   //��һ���أ�������Ѿ�����
{
	private int num;
	
	private static Test t = new Test(); //ͨ��new����һ��˽�о�̬�ı������
	private Test(){} // ˽�л�����Ĺ��캯��
	
	public static Test getInstance() // ����һ����̬�ĸ���Ĺ��з���
	{
		return t;
	}
	
	public void setnum(int num)
	{
		this.num = num;
	}
	
	public int getnum()
	{
		return num;
	}
}

class SingleDemo2
{
	public static void main(String args[])
	{
		Test t1 = Test.getInstance(); // ���ù�������
		t1.setnum(10);
		System.out.println(t1.getnum());
		
		Test t2 = Test.getInstance();
		t2.setnum(20);
		System.out.println(t2.getnum());
		
	}
}