/**
time：2017-10-29 08:55:27
author：@su

需求：继承
心得：1.当子父类中出现成员函数一模一样的情况，会运行子类的函数，这种现象，称为覆盖操作。 --- 程序二
				函数的两个特性：
				1> 重载。同一个类中。overload
				2> 覆盖。子类中。覆盖也称为重写，覆写。override
			2.覆盖的注意事项：
				1> 子类方法覆盖父类方法时，子类权限必须要大于等于父类的权限； eg.public，static，private
					 eg.子类是public void show（）；父类是private void show（）； 子类的权限就低于父类权限，不可以继承覆盖。
				2> 静态只能覆盖静态，或被静态覆盖 --- 少见
			3.什么时候使用覆盖操作？
				当对于一个类进行子类的扩展时，子类需要保留父类的功能声明，但是要定义子类中该功能的特有内容时，就使用覆盖操作完成。

*/

/*
输出结果为：fu run
						zi run

//程序一
class Fu
{
	void show1()
	{
		System.out.println("fu run");
	}
}

class Zi extends Fu
{
	void show2()
	{
		System.out.println("zi run");
	}
}

class ExtendDemo2
{
	public static void main(String args[])
	{
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}

*/


//输出的结果是：zi run

//程序二
class Fu
{
	void show()
	{
		System.out.println("fu run");
	}
}

class Zi extends Fu
{
	void show()
	{
		System.out.println("zi run");
	}
}

class ExtendDemo2
{
	public static void main(String args[])
	{
		Zi z = new Zi();
		z.show();
	}
}