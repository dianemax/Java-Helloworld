/**
time��2017-11-14 17:22:03
author��@su

����object�� --- toString����
˼·���÷�������һ���ַ���������ֵΪ getClass����.getName() + ��@��f
�ĵã����ظ��ַ������ı�ʾ��ʽ

*/

class Person
{
	private int age;
	
	Person(int age)
	{
		this.age = age;
	}
	
	public String toString()
	{
		return "Person:" + age;
	}
}

class ObjectClassStringDemo
{
	public static void main(String args[])
	{
		Person p1 = new Person(20);
		System.out.println(p1.toString());
	}
}