/**
time��2017-11-8 22:57:54
author��@su

�����ڲ���
�ĵã�1. �ڲ����ж����˾�̬��Ա�����ڲ���ԱҲ�����Ǿ�̬��
			2. �ⲿ����.this
				 eg. System.out.println(Outer.this.num);

*/

class Outer
{
	int num = 3;
	
	class Inner
	{
		int num = 4;
		void show()
		{
			int num = 5;
			System.out.println(Outer.this.num); //���Ϊ3
			System.out.println(Inner.this.num); //���Ϊ4
			System.out.println(this.num);       //���Ϊ4
			System.out.println(num);            //���Ϊ5
			System.out.println(Outer.num);      //innerclassdemo2.java:24: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� num
                                          //                         System.out.println(Outer.num);
                                          //Ϊʲô�ڲ�����ֱ�ӷ����ⲿ��ĳ�Ա�أ�
                                          //������Ϊ�ڲ���������ⲿ������� --- �ⲿ����.this
		}
	}
	
	void method()
	{
		new Inner().show();
		System.out.println(num);
	}
}

class InnerClassDemo2
{
	public static void main(String args[])
	{
		new Outer().method();
	}
}