/**
time��2017-11-8 20:37:03
author��@su

����������� --- �ڲ��� inner
			�ڲ��ࣺ��һ���ඨ������һ�������棬�������Ǹ���ͳ�Ϊ�ڲ��ࣨ�����࣬Ƕ���ࣩ
�ĵã�1. �����ص㣺�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�г�Ա
									 �ⲿ��Ҫ�����ڲ����еĳ�Ա���뽨���ڲ���Ķ���
			2. 1> �ڲ�����private --- ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա
						eg. Outer.Inner in = new Outer().new Inner();
				 2> ����ڲ����Ǿ�̬�ģ����൱��һ���ⲿ��
				 		eg. Outer.Inner in = new Outer.Inner();
				 3> ����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬��,�Ϳ���ֱ�ӵ���
				 		eg. static class Inner
				 		    static void function
				 		    Outer.Inner.function();

*/

class Outer
{
	private int num = 3;
	
	class Inner
	{
		void show()
		{
			System.out.println("show run ... " + num);
		}
	}
	
	public void method()
	{
		Inner in = new Inner();
		in.show();
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
//	��һ��
//		Outer ou = new Outer();
//		ou.method();

//  ������error
//		Outer.Inner in = new Outer().Inner();    //innerclassdemo.java:35: ����: �Ҳ�������
//																						                Outer.Inner in = new Outer().Inner();
//																						                                            ^
//																						  ����:   ���� Inner()
//																						  λ��: �� Outer

//  ������
		Outer.Inner in = new Outer().new Inner(); 
		in.show();
	}
}


/*
//�ڲ�����ʹ���д�� --- �ڲ�������һ�����е��ڲ������ܿ������
//error ��innerclassdemo.java:36: ����: �Ҳ�������
				                Inner in = new Inner();
				                ^
				  ����:   �� Inner
				  λ��: �� InnerClassDemo
class Outer
{
	private int num = 3;
	
	class Inner //�ڲ���
	{
		void show()
		{
			System.out.println("show run... " + num);
		}
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
		Inner in = new Inner();
		in.show();
	}
}
*/