/**
time��2017-10-24 14:32:57
author��@su

����˽�� ��ϰ --- private
�ĵã�1.˽�� private --- �����ڸ����з���
			2.����public��������Է��ʣ�û�а�ȫ�ԣ�����private�ǽ�ֹ������ɲ���������������Ҫ���� --- ����
			3.������Ҫ�Ķ����ṩ������ȫ�����������������Զ����أ����ṩ���������������
		��4.�޷��Ӿ�̬���������÷Ǿ�̬���� 
			5.˽�� private ������һ�����η����������γ�Ա��˽�е������ڱ�������Ч
			  ˽�н����Ƿ�װ��һ�����֣���˽��һ������ʵ��

*/

class Person
{
	private int age;
	
	public void check(int a)  //������Ϊpublic static void check ʱ��㱨�� --- 
														//privatedemo.java:18: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� age
														//�˴����� void check����Ҳ���Գɹ�����
	{
		if(a > 0 && a < 110)
			
			{
				age = a;
				speak();
			}
		else
			System.out.println("�������");
	}
	void speak()
	{
		System.out.println("������" + age);
	}
	
}


class PrivateDemo
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.check(22);
	}
}