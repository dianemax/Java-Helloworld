/**
time��2017-11-9 21:49:09
author��@su

����������
�ĵã�1. Object obj = new Object()  //�������ö�������ת�ͣ��������޶����������Ӧ��
				 ���²���ʹ����������з�������Ϊ�����ڲ��࣬�����������ת�ͳ�Ϊ��object����
			2. static ���ܺ� this ����
			

*/
//��������
class Outer
{
	void method()
	{
		new Object()
		{
			public void show()
			{
				System.out.println("������");
			}
		}.show();
	}
}

class InnerClassDemo6
{
	public static void main(String args[])
	{
		new Outer().method();
	}
	
}


/*
class Outer
{
	void method()
	{
		Object obj = new Object()  //�������ö�������ת�ͣ��������޶����������Ӧ��
		{
			public void show()
			{
				System.out.println("������");
			}
		};
		obj.show();               //innerclassdemo6.java:22:  ����: �Ҳ�������
																												                obj.show();
																												                   ^
																												  ����:   ���� show()
																												  λ��: ����ΪObject�ı��� obj
														 //���²���ʹ����������з�������Ϊ�����ڲ��࣬�����������ת�ͳ�Ϊ��object����
	}
}

class InnerClassDemo6
{
	public static void main(String args[])
	{
		new Outer().method();
	}
	
}
*/