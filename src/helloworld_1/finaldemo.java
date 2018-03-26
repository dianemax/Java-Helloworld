/**
time：2017-10-29 20:10:04
author：@su

需求：final的相关用法
心得：1.final的作用：
				1> final是一个修饰符，可以修饰类，方法，变量
				2> final修饰类不可以被继承
				3> final修饰的方法不可以被覆盖
				4> final修饰的变量是一个常量，只能赋值一次。
			
		    写法规范：常量的所有字母都大写，多个单词中间用下划线连接。
		   2.继承的缺陷：打破了系统的封装性。

*/

//final修饰类 --- final是一个修饰符可以修饰类  and  final修饰的类可以被继承
final class Fu
{
	void method()
	{
						//调用了底层的系统资源
	}
}

class Zi extends Fu
{
	void method()
	{
		System.out.println("hello world");
	}
}

class FinalDemo
{
	public static void main(String args[])
	{
		
		final int x = 9; //x一直是9
		
		System.out.println("");
	}
}