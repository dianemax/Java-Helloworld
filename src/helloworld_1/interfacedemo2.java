/**
time：2017-10-30 17:40:32
author：@su

需求：接口 --- interface的多实现
思路：在Java中不直接支持多继承，因此会出现调用的不确定性，因此Java中进行了改良，变成了多实现 --- 一个类可以实现多个接口
心得：
			务必：只能由实现了接口的子类覆盖了接口中的所有的抽象方法后，该子类才可以被实例化！
						eg. class InterfaceDemo extends Q implements A,Z
								{
									public void showA(){}
									public void showZ(){}
									void show()
									{
										System.out.println("hello world");
									}
								}
			
			1.接口的出现避免了单继承的局限性
				接口与接口之间是继承关系，而且接口可以多继承
				
				类实现接口 接口可以多继承
			
			2.接口的特点；对外暴露、程序的功能扩展、降低耦合性、可以用来多实现
			3.接口和抽象类的区别:
				  相同点：都是不断向上抽取而来的
				  不同点：1> 抽象类需要被继承，而且只能单继承
				  					 接口需要被实现，而且可以多实现
				  				2> 抽象类中可以定义抽象方法和非抽象方法，子类集成后可以直接使用非抽象方法
				  					 接口中只能定义抽象方法，必须由子类去实现
				  				3> 抽象类继承是 is a 关系，定义体系的基本共性内容
				  					 接口的实现是 like a 关系，定义体系额外功能。

*/

interface A
{
	public void showA();
}

interface Z
{
	public void showZ();
}

class Q
{
	public void method(){}
}

class InterfaceDemo extends Q implements A,Z
{
	public void showA(){}
	public void showZ(){}
	void show()
	{
		System.out.println("hello world");
	}
}

class InterfaceDemo2
{
	public static void main(String args[])
	{
		InterfaceDemo i = new InterfaceDemo();
		i.show();
	}
}