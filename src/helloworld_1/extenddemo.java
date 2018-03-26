/**
time：2017-10-29 07:59:09
author：@su

需求：继承 --- extend
心得：1.继承的好处
				1> 提高了代码的复用性；
				2> 让类与类之间产生关系，给第三个特征 --- 多态 提供了前提。
			  Java中支持单继承，但是不支持多继承，但对C++中的多继承机制进行了改良。
			2.单继承：一个子类只能有一个直接父类。
				多继承：一个子类可以有多个直接父类（Java中不允许，但是进行了改良）
								不直接支持，因为多个父类中有相同的成员，会产生调用的不确定性
			3.Java中支持多层（多重）继承
				C继承B，B继承A，就会出现继承关系。
			4.当要使用一个继承体系的时候
				1> 查看该体系中的顶层类，了解体系的基本功能；
				2> 创建体系中的子类对象，完成功能的调用。
			5.什么时候定义继承呢？
				当类与类之间产生所属关系时，就会产生继承。   eg.xxx是yyy的一种
																												xxx extends yyy
			6.当本类的成员和局部变量同名，就用this区分
				当子父类中的成员变量同名就用super区分父类
			7.this代表一个本类对象的引用，
				super代表一个父类对象空间。

*/

class Fu
{
	int num = 4;
}

class Zi extends Fu
{
	int num = 5;
	void show()
	{
		System.out.println(this.num +" " + super.num);
	}
}

class ExtendDemo
{
	public static void main(String args[])
	{
		Zi z = new Zi();
		z.show();
	}
}