/**
time：2017-10-29 22:03:58
author：@su

需求：abstract相关知识
心得：1.抽象函数所在的类也要加上abstract。
			2.抽象类的特点：
				1> 方法只有声明没有实现时，该方法就是抽象方法。需要被abstract修饰抽象方法必须定义在抽象类中，该类必须被abstract修饰；
				2> 抽象类不可以被实例化，为什么？
					 因为调用抽象方法没有意义。
				3> 抽象类必须由其子类覆盖了所有的抽象方法时，该子类才可以实例化，否则，这个子类也是抽象类
			3.常见问题：
				1> 抽象类中有构造函数吗？
					 有，用于给子类对象进行初始化。
				2> 抽象类中可以不定义抽象方法吗？
					 可以的，但是这种情况很少，目的是不让该类创建对象，通常这个类中有方法体但是没有内容
					 eg.abstract class Demo()
					 		{
					 			void show(){}
					 			void show(){}
					 		}
				3> 抽象类关键字不可以和哪些关键字共存？
					 private 不行 // 非法的修饰符组合 private 和 abstract
					 static  不行 // 非法的修饰符组合 private 和 abstract
					 final   不行
				4> 抽象类和一般类的异同点
					 相同点：抽象类和一般类都是用来描述事物的，都在内部定义了成员。
					 不同点；1> 一般类有足够的信息描述事物
					 						抽象类描述事物的信息可能不足
					 				 2> 一般类中不能定义抽象方法，只能定义非抽象类方法
					 				 		抽象类中可以定义抽象方法
					 				 3> 一般类可以被实例化，抽象类不可以
				5> 抽象类一定是父类吗？
					 是的，因为需要子类覆盖其方法后才可以对子类进行实例化。
					 
*/

/**
抽象类练习：
雇员示例：要求：公司中有程序员有姓名，工号，薪水，工作内容
								项目经理除了有姓名，工号，薪水，工作内容还有奖金
								对以上给出的信息进行建模
					分析：在这个问题中，先找出设计的对象，可以通过名词提炼法
								eg.1> 程序员：属性：姓名 工号 薪水
															行为：工作
									 2> 经理：  属性：姓名 工号 薪水 奖金
									 						行为：工作
总结：1.成员变量定义成私有也很方便，在父类中直接设置输出语句打印就可以。
			2.父类中设置多一点“接口”
			3.解决的方法是多样的！
									 						
*/

//描述雇员
abstract class Employee //因为工作的内容是抽象类，所以类也是抽象的
{
	private String name;
	private String ID;
	private double pay;
	
	Employee(String name,String ID,double pay)
	{
		this.name = name;
		this.ID = ID;
		this.pay = pay;
	}
	
	public abstract void work();
	
	public void show()
	{
		System.out.println("name：" + name +"  ID:" + ID + "  pay:" + pay );
	}
	
	/*
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	
	public String getID()
	{
		return ID;
	}
	public void setname(String ID)
	{
		this.ID = ID;
	}
	
	public double getpay()
	{
		return pay;
	}
	public void setpay()
	{
		this.pay = pay;
	}
	*/
	
}

//描述程序员
class Programmer extends Employee
{
	Programmer(String name,String ID,double pay)
	{
		super(name,ID,pay);
	}
	public void work()
	{
		System.out.println("code");
		//System.out.println("：" + name + " " + ID + " " + pay);
	}
	
}

//描述经理
class Manager extends Employee
{
	private double bonus;
	
	Manager(String name,String ID,double pay,double bonus)
	{
		super(name,ID,pay);
		this.bonus = bonus;
	}
	/*
	public double getbonus()
	{
		return bonus;
	}
	public void setbonus(double bonus)
	{
		this.bonus = bonus;
	}
	*/
	
	public void work()
	{
		System.out.println("manage");
		//System.out.println("：" + name + " " + ID + " " + pay +" " + bonus );
		super.show();
		System.out.println("bonus：" + bonus );
	}
	/*
	public void show()
	{
		super.show();
		System.out.println("bonus：" + bonus );
	}
	*/
}


class AbstractDemo
{
	public static void main(String args[])
	{
	Manager m = new Manager("sutongxue","y17041211959",8000,4000);
	m.work();
	//m.show();
	}
}