/**
time：2017-11-8 22:57:54
author：@su

需求：内部类
心得：1. 内部类中定义了静态成员，该内部成员也必须是静态的
			2. 外部类名.this
				 eg. System.out.println(Outer.this.num);

*/

class Outer
{
	int num = 3;
	
	class Inner
	{
		int num = 4;
		void show()
		{
			int num = 5;
			System.out.println(Outer.this.num); //输出为3
			System.out.println(Inner.this.num); //输出为4
			System.out.println(this.num);       //输出为4
			System.out.println(num);            //输出为5
			System.out.println(Outer.num);      //innerclassdemo2.java:24: 错误: 无法从静态上下文中引用非静态 变量 num
                                          //                         System.out.println(Outer.num);
                                          //为什么内部类能直接访问外部类的成员呢？
                                          //那是因为内部类持有了外部类的引用 --- 外部类名.this
		}
	}
	
	void method()
	{
		new Inner().show();
		System.out.println(num);
	}
}

class InnerClassDemo2
{
	public static void main(String args[])
	{
		new Outer().method();
	}
}