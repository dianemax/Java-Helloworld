/**
time：2017-11-9 21:49:09
author：@su

需求：面试题
心得：1. Object obj = new Object()  //建立引用对象向上转型，隐藏了限定子类的特殊应用
				 导致不能使用子类的特有方法，因为匿名内部类，这个子类向上转型成为了object类型
			2. static 不能和 this 共存
			

*/
//正常运行
class Outer
{
	void method()
	{
		new Object()
		{
			public void show()
			{
				System.out.println("。。。");
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
		Object obj = new Object()  //建立引用对象向上转型，隐藏了限定子类的特殊应用
		{
			public void show()
			{
				System.out.println("。。。");
			}
		};
		obj.show();               //innerclassdemo6.java:22:  错误: 找不到符号
																												                obj.show();
																												                   ^
																												  符号:   方法 show()
																												  位置: 类型为Object的变量 obj
														 //导致不能使用子类的特有方法，因为匿名内部类，这个子类向上转型成为了object类型
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