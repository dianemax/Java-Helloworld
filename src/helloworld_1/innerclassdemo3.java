/**
time：2017-11-9 19:39:00
author：@su

需求：局部内部类 --- 内部类可以放在局部位置上
心得：1. 内部类中访问局部变量x，需要被声明为最终类型 final --- 调用完会释放，因此加final
						原理：内部类在局部位置上只能访问局部类中被final修饰的局部变量

*/

class Outer
{
  int num = 3;    
	void method()
	{	
		int x = 5;
		class Inner
		{
			void show()
			{
				System.out.println("show ... " + x);
			}
//			Inner in = new Inner();    //innerclassdemo3.java:22: 错误: 需要<标识符>
//                      																			in.show();
//			in.show();                 //原因：inner内部无法new inner 并调用show
		}
		Inner in = new Inner();
		in.show();
	}
	
/* 
//创建function调用show --- 不可以实现，因为show所述的Inner类是局部内部类，function不知道里面有show
	
	public void function()
	{
		Inner in = new Inner();
		in.show();
	}
*/

}

class InnerClassDemo3
{
	public static void main(String args[])
	{
		new Outer().method();
	}
}