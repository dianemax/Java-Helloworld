/**
time：2017-10-30 14:44:50
author：@su

需求：interface --- 接口
思路：当一个抽象类中的方法都是抽象的时候，这事就可以将该抽象类用另一种形式定义和表示，就是接口 --- interface
心得：1.定义接口使用的关键字是interface
				eg.interface Demo
					 {
					 		abstract void show（）；
					 		abstract void show（）；
					 }
			2.对于接口中常见的成员,而且这些成员都有固定的修饰符
				1> 全局变量：public static find
				2> 抽象方法：public abstract
				由此得出结论：接口中的成员都是公共的权限。
				eg.public static final int num = 4； //如果少写任何一个，系统会自动补全完整，简写为 NUM = 4；（表示常量，要大写）
				
			3.类与类之间是继承关系，类与接口之间是实现关系 --- implements
				eg.class DemoImpl implements Demo     // 类DemoImpl实现Demo接口
				
		※4.接口不可以被实例化！
				只能由实现了接口的子类并覆盖了接口中的所有的抽象方法后，该子类才可以被实例化！
				
*/

interface Demo
{
	public static final int NUM = 4;
	
	abstract void show1();
	abstract void show2();
}

class DemoImpl implements Demo  //实现接口的子类，覆盖了接口中所有的抽象方法后才能实例化
{
	public void show1(){}
	public void show2(){}  //如果不写这两句，会报错：DemoImpl不是抽象的, 并且未覆盖Demo中的抽象方法show2()
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		DemoImpl d = new DemoImpl();
		System.out.println(Demo.NUM);   //接口名称调用自己的成员
		//System.out.println(d.NUM);
	}
}