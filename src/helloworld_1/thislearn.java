/**
time：2017-10-25 10:28:14
author：@su

需求：this的相关知识
心得：1.如下分别定义了几个类，例如 空参数的Person（），含参数的	Person(String name)和	Person(int age)	以及 Person(String name,int age)
				但是在	Person(String name,int age) 中初始化，需要对名字name 和年龄age 都进行初始化，会造成重复
				
			※.this可以用在构造函数中，调用其他构造函数，但只能定义在构造函数的第一行，因为初始化动作需要优先执行
			
			2.	Person(String name,int age)
					{
						this(name);   	// 此处本来是应该 this.Person的，但是Person还没有被初始化，所以不能调用，因此this(name);	调用	Person(String name)
						this.age = age;
					}
					
			3.	Person(String name)
					{
						this.name = name;
					}
					Person(int age)
					{
						this.age = age;
					}
					Person(String name,int age)
					{
						this(name);
						this(age);       //error 因为this只能定义在构造函数的第一行，所以此处调用两个this会发生报错
					}
					
			4.如下程序的运行结果为：
					angle:22

					baby cry
					baby:0
					
				因为：Person p1 = new Person("苏同学",22);创建对象时，要调用	Person(String name)，该函数内this.name = "angle";
				angle将苏同学覆盖，所以输出的是angle。
*/

class Person
{
	private String name;
	private int age;
	
	Person()
	{
		name = "baby";
		age = 0;
		System.out.println("baby cry");
	}
	
	Person(String name)
	{
		this.name = "angle";
	}
	
//	Person(int age)
//	{
//		this.age = age;
//	}
	
	Person(String name,int age)
	{
		this(name);
		this.age = age;
	}
	void speak()
	{
		System.out.println(this.name + ":" + this.age);
	}
		
}

class ThisLearn
{
	public static void main(String args[])
	{
		Person p1 = new Person("苏同学",22);
		p1.speak();
		System.out.println();
		Person p2 = new Person();
		p2.speak();
	}	
}