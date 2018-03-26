/**
time：2017-10-28 16:41:33
author：@su

需求：单例设计的另外一种形式 --- 懒汉式（存在安全隐患，面试中用）
思路：懒汉式
心得：new一个对象
			私有化构造函数
			定义一个静态类的共有办法，将其返回

*/

//延迟加载形式
class Single2   //类加载进来，没有对象，只有调用了getInstance方法时，才会创建对象
{
	private int num;
	private static Single2 s = null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s == null)
		{
			s = new Single2();
		}
		return s;
	}
	
	public void setnum(int num)
	{
		this.num = num;
	}
	
	public int getnum()
	{
		return num;
	}
	
}

class SingleDemo3
{
	public static void main(String args[])
	{
		Single2 s = Single2.getInstance();
		s.setnum(20);
		System.out.println(s.getnum());
	}
}