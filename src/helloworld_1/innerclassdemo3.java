/**
time��2017-11-9 19:39:00
author��@su

���󣺾ֲ��ڲ��� --- �ڲ�����Է��ھֲ�λ����
�ĵã�1. �ڲ����з��ʾֲ�����x����Ҫ������Ϊ�������� final --- ��������ͷţ���˼�final
						ԭ���ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ����б�final���εľֲ�����

*/

class Outer
{
  int num = 3;    
	void method()
	{	
		int x = 5;
		class Inner
		{
			void show()
			{
				System.out.println("show ... " + x);
			}
//			Inner in = new Inner();    //innerclassdemo3.java:22: ����: ��Ҫ<��ʶ��>
//                      																			in.show();
//			in.show();                 //ԭ��inner�ڲ��޷�new inner ������show
		}
		Inner in = new Inner();
		in.show();
	}
	
/* 
//����function����show --- ������ʵ�֣���Ϊshow������Inner���Ǿֲ��ڲ��࣬function��֪��������show
	
	public void function()
	{
		Inner in = new Inner();
		in.show();
	}
*/

}

class InnerClassDemo3
{
	public static void main(String args[])
	{
		new Outer().method();
	}
}