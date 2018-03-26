/**
time：2017-11-9 20:51:36
author：@su

需求：匿名内部类 --- 前提：内部类必须继承或者实现一个外部类或者接口
心得：匿名内部类其实就是一个匿名子类对象
			格式：
					 	new . 父类or接口 （）
					 	{
					 		 子类内容；
					 	}
			使用场景：当函数参数是接口类型时，而且接口中的方法不超过三个

*/

abstract class Demo
{
	abstract void show();
}

class Outer
{
	int num = 4;
	
	public void method()
	{
		int num = 5;
		new Demo()
		{
			void show()
			{
				System.out.println("show" + num);
			}
		}.show();
	}
	
	/*
	class Inner extends Demo
	{
		void show()
		{
			System.out.println("show" + num);
		}
	}
	
	public void method()
	{
		new Inner().show();
	}
	*/
}



class InnerClassDemo4
{
	public static void main(String args[])
	{
		new Outer().method();
	}
}