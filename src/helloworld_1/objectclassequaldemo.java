/**
time：2017-11-14 15:36:39
author：@su

需求：object类 --- equal方法
思路：
心得：1. object是所有类的根类
			2. object是不断抽取而来的，具备着所有对象都具备的共性内容
			
			3. equals比较的是 地址 ！

*/

//常用共性内容
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