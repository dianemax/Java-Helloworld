/**
time：2017-10-21 20:46:39
author：@su

需求：数据类型的参数传递
思路：1.基本数据类型参数的传递
			2.引用数据类型的传递
结果：输出是4
心得：1.接着在栈中为main函数分配内存，创建一个新的 类 类型的对象n，同时在堆内存中初始化x的值为0，并且给n一个堆内存的地址
				随后在堆内存中将x的值变为3
				n.x = 6； 将堆内存中的x改为6
				调用use函数，在栈中分配内存，将x的值改为4，随后弹栈
				最后由主函数main 的 n 的地址指向堆中，最终输出函数的值为4
			2.java中成员变量和方法分为静态和实例
			  a.定义一个类 class Text
			  						 {
			  						 		public static int number;
			  						 		public int temp;
			  						 		public static void method(){}
			  						 }
			  	如果想访问temp，就必须先new一个的对象，Text b = new Text(); 才能访问
			  	b.temp就是实例成员变量
		但是 想访问number变量的时候，不需要创建Text的实例就可以访问，例如：Text.number
			
		区别：访问对象需不需要创建对象
				  对于类成员变量，所有对象是共享一个变量
*/

class NumberUse2
{
	int x = 3;	//正确
	//public static int x = 3; //正确
	public static void main(String args[])
	{
		//int x = 3;   //error
		NumberUse2 n = new NumberUse2();	//numberuse2.java:17: 错误: 需要'('或'['
     																	//NumberUse2 n = new NumberUse2;
		n.x = 6;
		use(n);
		System.out.println(n.x);
	}
	public static void use(NumberUse2 d)
	{
		d.x = 4;
	}
	
}
/*
如果将 int x = 3；放在34行，会发生如下报错，因为java中成员变量和方法分为静态和实例

numberuse2.java:25: 错误: 找不到符号
                n.x = 6;
                 ^
  符号:   变量 x
  位置: 类型为NumberUse2的变量 n
numberuse2.java:27: 错误: 找不到符号
                System.out.println(n.x);
                                    ^
  符号:   变量 x
  位置: 类型为NumberUse2的变量 n
numberuse2.java:31: 错误: 找不到符号
                d.x = 4;
                 ^
  符号:   变量 x
  位置: 类型为NumberUse2的变量 d
3 个错误
*/