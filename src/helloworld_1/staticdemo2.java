/**
time：2017-10-27 14:49:25
author：@su

需求：static相关知识
思路：1> 主函数是静态的；
			2> 静态省略的是类名，非静态省略的是this。
心得：1> 当主函数写为：public  void main(String[] args)时发生如下报错：
					错误: main 方法不是类 StaticDemo2 中的static, 请将 main 方法定义为:
   				public static void main(String[] args)
			2> 当输入为show（）时，输出为：
					staticdemo2.java:19: 错误: 无法从静态上下文中引用非静态 方法 show()
			3> new StaticDemo2().show();
					要用 new 对象.方法 来调用
*/

class StaticDemo2
{
	int num = 4;
	public static void main(String[] args)
	{
		new StaticDemo2().show();
	}
 
	public void show()
	{
		System.out.println(num);
	}
}