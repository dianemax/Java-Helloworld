/**
time：2017-10-27 21:51:55
author：@su

需求：static相关知识
心得：1.静态的使用时机：
				1> 静态变量
						 当分析对象中所具备的成员变量的值都是相同的，这是这个成员就可以被静态修饰；
						 只要数据在数据中是不同的，就是对象的特有数据，必须存储在对象中，就是非静态的；
						 如果相同的数据，对象不需要做修改，只需要使用即可，不需要存储在对象中就定义成静态的。
				2> 静态函数
					   函数能否用静态修饰，就参考一点 --- 函数的功能是否有访问到对象中的特有数据！
					   简单来说: 从源代码上来看，该功能是否需要访问非静态的成员变量，如果需要，该功能就是非静态的；
					             如果不需要，就可以将该功能函数定义成静态，也可以定义成非静态。
				3> 但是非静态需要被对象调用
			2.静态代码块
				1> 随着类的加载而执行，而且只执行一次；
				2> 作用：用于对类进行初始化，有些类不需要创建对象；
				3> 构造代码块可以给所有的对象初始化。
结果：1> 当代码为：	static
										{
											System.out.println("hahaha");
											System.out.println("xixixi");
										}
										
										public static void main(String args[])
										{
											System.out.println();
											System.out.println("show run!");
										}
	
				 输出结果为：hahaha
										 xixixi

										 show run!
			
				 说明：先执行静态代码块的内容进行初始化，再开始执行主函数。
				 
			2> 当代码为：	public static void main(String args[])
										{
											System.out.println();
											System.out.println("show run!");
										}
										
										//静态代码块
										static
										{
											System.out.println("hahaha");
											System.out.println("xixixi");
										}
				 输出结果为：hahaha
										 xixixi

										 show run!
			
				 说明：不论静态代码块的位置，都是先执行静态代码块的内容进行初始化，再开始执行主函数。					
	

*/

class StaticDemo3
{
	//静态代码块
	static
	{
		System.out.println("hahaha");
		System.out.println("xixixi");
	}
	
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("show run!");
	}
	
//	//静态代码块
//	static
//	{
//		System.out.println("hahaha");
//		System.out.println("xixixi");
//	}
//	
	
}