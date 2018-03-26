 /**
time：2017-10-21 20:18:33
author：@su

需求：数据类型的参数传递
思路：1.基本数据类型参数的传递
			2.引用数据类型的传递
心得：1.结果都是3
			2.第一种有返回值，返回值是int类型
			  第二种是无返回值类型，无返回值
			3.原因：函数运行，找到函数入口main，在栈中分配内存，并且设置x的值为3，之后调用use函数，栈中在分配一块内存，将x的值修改为4
				完成之一动作之后弹栈，所以只剩下主函数的main，显示x为3
				
	 ☆ 4. 有无返回值都无法修改x的值，所以return返回的作用是什么的？
	 			关键：“形参和实参”
			 			use函数括号中的是形参，	public static int use(int a)，其中int类型的变量名是x还是a都无所谓，只是形式参数，无法将函数返回给实参
				但是要注意：在use函数中变量名要一致，否则会出现如下报错
					  numberuse.java:31: 错误: 找不到符号
			              x = 4;

*/

class NumberUse
{
	public static void main(String args[])
	{
		int x = 3;
		use(4);
		System.out.println("x = " + x );
	}

	public static int use(int a)
	{
//		a = 4; 可以省略
		return a;
	}

	
//	public static void use(int x)
//	{
//		x = 4;
//	}
//	
}