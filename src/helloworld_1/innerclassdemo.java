/**
time：2017-11-8 20:37:03
author：@su

需求：面向对象 --- 内部类 inner
			内部类：将一个类定义在另一个类里面，对里面那个类就成为内部类（内置类，嵌套类）
心得：1. 访问特点：内部类可以直接访问外部类中的成员，包括私有成员
									 外部类要访问内部类中的成员必须建立内部类的对象
			2. 1> 内部类是private --- 直接访问外部类中的内部类中的成员
						eg. Outer.Inner in = new Outer().new Inner();
				 2> 如果内部类是静态的，就相当于一个外部类
				 		eg. Outer.Inner in = new Outer.Inner();
				 3> 如果内部类是静态的，成员是静态的,就可以直接调用
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
//	法一：
//		Outer ou = new Outer();
//		ou.method();

//  法二：error
//		Outer.Inner in = new Outer().Inner();    //innerclassdemo.java:35: 错误: 找不到符号
//																						                Outer.Inner in = new Outer().Inner();
//																						                                            ^
//																						  符号:   方法 Inner()
//																						  位置: 类 Outer

//  法三：
		Outer.Inner in = new Outer().new Inner(); 
		in.show();
	}
}


/*
//内部类典型错误写法 --- 内部类是在一个类中的内部，不能跨类调用
//error ：innerclassdemo.java:36: 错误: 找不到符号
				                Inner in = new Inner();
				                ^
				  符号:   类 Inner
				  位置: 类 InnerClassDemo
class Outer
{
	private int num = 3;
	
	class Inner //内部类
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