/**
time��2017-11-14 15:36:39
author��@su

����object�� --- equal����
˼·��
�ĵã�1. object��������ĸ���
			2. object�ǲ��ϳ�ȡ�����ģ��߱������ж��󶼾߱��Ĺ�������
			
			3. equals�Ƚϵ��� ��ַ ��

*/

//���ù�������
class Person extends Object
{
	private int age;
	Person (int age)
	{
		this.age = age;
	}
}

class Demo
{
	
}

class ObjectClassEqualDemo
{
	public static void main(String args[])
	{
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		Person p3 = p1;
		Demo d = new Demo();
		
		System.out.println(p1 == p2);        //false
		System.out.println(p1 == p3);				 //true
		System.out.println(p1.equals(p2));	 //false
		System.out.println(p1.equals(p3));	 //true
		System.out.println(p1.equals(d));	 	 //false
	}
}