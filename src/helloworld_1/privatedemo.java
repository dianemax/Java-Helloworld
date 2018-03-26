/**
time：2017-10-24 14:32:57
author：@su

需求：私有 练习 --- private
心得：1.私有 private --- 仅能在该类中访问
			2.其中public是随意可以访问，没有安全性，但是private是禁止访问造成不方便的情况，这是要考虑 --- 加锁
			3.将不需要的对外提供的内容全部隐藏起来，把属性都隐藏，仅提供公共方法对其访问
		※4.无法从静态上下文引用非静态变量 
			5.私有 private 仅仅是一个修饰符，用于修饰成员，私有的内容在本类中有效
			  私有仅仅是封装的一种体现，不私有一样可以实现

*/

class Person
{
	private int age;
	
	public void check(int a)  //当输入为public static void check 时候汇报错 --- 
														//privatedemo.java:18: 错误: 无法从静态上下文中引用非静态 变量 age
														//此处输入 void check（）也可以成功运行
	{
		if(a > 0 && a < 110)
			
			{
				age = a;
				speak();
			}
		else
			System.out.println("输入错误");
	}
	void speak()
	{
		System.out.println("年龄是" + age);
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