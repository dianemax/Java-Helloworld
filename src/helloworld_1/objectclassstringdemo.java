/**
time：2017-11-14 17:22:03
author：@su

需求：object类 --- toString方法
思路：该方法返回一个字符串，它的值为 getClass（）.getName() + ‘@’f
心得：返回该字符发串的表示形式

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