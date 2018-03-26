/**
time：2017-10-27 22:18:15
author：@su

需求：单例设计模式 --- 对问题行之有效的解决方案，其实它是一种思路。
思路：1。 单例设计模式
					解决的问题：可以保证一个类在内存中的对象唯一性。 --- 单个设计模式即为单例
					对于多个程序使用同一个配置信息对象时，就需要保证该对象的唯一性。
					
					如何让保证对象的唯一性？
					1> 不允许其他程序用new创建对象 --- 避免产生很多对象，导致不可控；
					2> 禁止其他new一个对象，自己本身来创建对象 --- 在该类中创建本类实例；
					3> 对外提供一个方法让其他程序可以获取该对象；
					
					步骤：
					1> 通过new在本类中创建一个私有并静态的对象；
					2> 私有化该类的构造函数；
					3> 定义一个静态的共有的方法，将创建的对象返回。
心得：

*/
class Single
{
	private static Single s = new Single();  //创建对象
	
	private Single(){}  //私有化构造函数
	
	public static Single getInatance()   //创建一个共有方法
	{
		return s;  //将创建对象返回
	}
}

class SingleDemo
{
	public static void main(String args[])
	{
		//new Single().getInstance();  // error 因为single是私有化的禁止其他创建对象
		//调用有两种方式 --- 类名调用 and 对象调用 --- 对象调用不可以，所以只能类名调用
											// 类名调用的前提是 --- 静态 所以要写成 public static Single getInatance();
											
		Single ss = Single.getInstance();  //right1
		Single ss = Single.s;  //right2
		
	}
	
}