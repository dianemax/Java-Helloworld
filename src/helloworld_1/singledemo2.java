/**
time：2017-10-28 15:24:34
author：@su

需求：single --- 单例设计模式举例 --- 饿汉式（开发时使用较多）
思路：getnum()
			步骤：
				1> 通过new在本类中创建一个私有并静态的对象；
				2> 私有化该类的构造函数；
				3> 定义一个静态的共有的方法，将创建的对象返回。
心得：在原有动作上加三步动作：	private static Test t = new Test(); //通过new创建一个私有静态的本类对象
																private Test(){} // 私有化该类的构造函数
																
																public static Test getInstance() // 顶一个静态的该类的共有方法
																{
																	return t;
																}

*/

class Test   //类一加载，对象就已经存在
{
	private int num;
	
	private static Test t = new Test(); //通过new创建一个私有静态的本类对象
	private Test(){} // 私有化该类的构造函数
	
	public static Test getInstance() // 定义一个静态的该类的共有方法
	{
		return t;
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

class SingleDemo2
{
	public static void main(String args[])
	{
		Test t1 = Test.getInstance(); // 调用公共方法
		t1.setnum(10);
		System.out.println(t1.getnum());
		
		Test t2 = Test.getInstance();
		t2.setnum(20);
		System.out.println(t2.getnum());
		
	}
}