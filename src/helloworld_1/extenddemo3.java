/**
time：2017-10-29 12:01:22
author：@su

需求：子父类中的构造函数
结果：fu run
			zi run
心得：1.子类构造对象中，访问子类的构造函数时，父类也运行了
				1> 为什么呢？
					 原因：在子类的构造函数中第一行有一个默认的隐式语句。 --- super（）；
					 子类的实例化过程：子类中所有的构造函数默认都会访问父类中的空参数的构造函数。
				2> 为什么子类实例化的时候要访问父类的构造函数？
					 那是因为子类继承父类，获取了父类的内容和属性，所以在使用父类内容之前，要先看父类是如何对自己的内容进行初始化
					 所以，子类在构造对象时，必须访问父类中的构造函数。完成这个必须的动作，就在子类的构造函数中加入了super语句。
				3> 如果父类中没有定义空参数的构造函数，那么子类的构造函数就必须使用super（）来明确调用父类中的那个构造函数。

*/

class Fu
{
	Fu()
	{
		System.out.println("fu run");
	}
}

/*
//非空参数的函数
class Fu
{
	Fu(int x)
	{
		System.out.println("fu run");
	}
}
*/

class Zi extends Fu
{
	Zi()
	{
		//supper(); //调用的就是父类中空参数的构造函数 --- 空参数！构造函数！Fu（），省略了super这句
		//如果没有空参数的函数，可以通过 super（4）；语句来调用，输出结果不变。
		System.out.println("zi run");
	}
}

class ExtendDemo3
{
	public static void main(String args[])
	{
		new Zi();
	}
}