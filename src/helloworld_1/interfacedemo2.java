/**
time��2017-10-30 17:40:32
author��@su

���󣺽ӿ� --- interface�Ķ�ʵ��
˼·����Java�в�ֱ��֧�ֶ�̳У���˻���ֵ��õĲ�ȷ���ԣ����Java�н����˸���������˶�ʵ�� --- һ�������ʵ�ֶ���ӿ�
�ĵã�
			��أ�ֻ����ʵ���˽ӿڵ����า���˽ӿ��е����еĳ��󷽷��󣬸�����ſ��Ա�ʵ������
						eg. class InterfaceDemo extends Q implements A,Z
								{
									public void showA(){}
									public void showZ(){}
									void show()
									{
										System.out.println("hello world");
									}
								}
			
			1.�ӿڵĳ��ֱ����˵��̳еľ�����
				�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿڿ��Զ�̳�
				
				��ʵ�ֽӿ� �ӿڿ��Զ�̳�
			
			2.�ӿڵ��ص㣻���Ⱪ¶������Ĺ�����չ����������ԡ�����������ʵ��
			3.�ӿںͳ����������:
				  ��ͬ�㣺���ǲ������ϳ�ȡ������
				  ��ͬ�㣺1> ��������Ҫ���̳У�����ֻ�ܵ��̳�
				  					 �ӿ���Ҫ��ʵ�֣����ҿ��Զ�ʵ��
				  				2> �������п��Զ�����󷽷��ͷǳ��󷽷������༯�ɺ����ֱ��ʹ�÷ǳ��󷽷�
				  					 �ӿ���ֻ�ܶ�����󷽷�������������ȥʵ��
				  				3> ������̳��� is a ��ϵ��������ϵ�Ļ�����������
				  					 �ӿڵ�ʵ���� like a ��ϵ��������ϵ���⹦�ܡ�

*/

interface A
{
	public void showA();
}

interface Z
{
	public void showZ();
}

class Q
{
	public void method(){}
}

class InterfaceDemo extends Q implements A,Z
{
	public void showA(){}
	public void showZ(){}
	void show()
	{
		System.out.println("hello world");
	}
}

class InterfaceDemo2
{
	public static void main(String args[])
	{
		InterfaceDemo i = new InterfaceDemo();
		i.show();
	}
}