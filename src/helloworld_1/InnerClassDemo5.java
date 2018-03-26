/**
time：2017-11-9 21:14:01
author：@su

需求：匿名内部类细节
心得：new Inner(); 	 //eg1  //innerclassdemo5.java:20: 错误: 无法从静态上下文中引用非静态 变量 this
                            // 												 new Inner();
                            // 解决办法：static class Inner
                     //eg2  //注释掉 new Inner（）这行，这会显示编译成功，这是为什么呢？
                     				//因为下面的method方法中有new Inner（） = new this.Inner ();
                     				//为什么在主程序 main 中不使用 new this.Inner();呢？
                     				//因为 static 不能和 this 共存。

*/

class InnerClassDemo5
{
	class Inner
	{
		
	}
	
	public static void main(String args[])
	{
		System.out.println("hello world");
		new Inner();   	 //eg1  //innerclassdemo5.java:20: 错误: 无法从静态上下文中引用非静态 变量 this
                            // 												 new Inner();
                            // 解决办法：static class Inner
                     //eg2  //注释掉 new Inner（）这行，这会显示编译成功，这是为什么呢？
                     				//因为下面的method方法中有new Inner（） = new this.Inner ();
                     				//为什么在主程序 main 中不使用 new this.Inner();呢？
                     				//因为 static 不能和 this 共存。
	}
	
	public void method()
	{
		new Inner();
	}
	
}