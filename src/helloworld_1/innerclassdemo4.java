/**
time��2017-11-9 20:51:36
author��@su

���������ڲ��� --- ǰ�᣺�ڲ������̳л���ʵ��һ���ⲿ����߽ӿ�
�ĵã������ڲ�����ʵ����һ�������������
			��ʽ��
					 	new . ����or�ӿ� ����
					 	{
					 		 �������ݣ�
					 	}
			ʹ�ó����������������ǽӿ�����ʱ�����ҽӿ��еķ�������������

*/

abstract class Demo
{
	abstract void show();
}

class Outer
{
	int num = 4;
	
	public void method()
	{
		int num = 5;
		new Demo()
		{
			void show()
			{
				System.out.println("show" + num);
			}
		}.show();
	}
	
	/*
	class Inner extends Demo
	{
		void show()
		{
			System.out.println("show" + num);
		}
	}
	
	public void method()
	{
		new Inner().show();
	}
	*/
}



class InnerClassDemo4
{
	public static void main(String args[])
	{
		new Outer().method();
	}
}