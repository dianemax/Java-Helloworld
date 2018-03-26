/**
time：2017-10-24 20:03:48
author：@su

需求：构造函数
心得：构造函数--- 构造创建对象时候调用的函数
				1>函数名与类名相同；
				2>不用定义返回值类型；
				3>没有具体的返回值；
			作用：
				给对象进行初始化。
			注：一个类中如果没有定义过构造函数，那么该类中会有一个默认的空参数构造函数，
				如果类中定义了一个指定的构造函数，那么类中的默认的构造函数就没有了。
			一般函数与构造函数的区别：
				1.构造函数：对象创建时就会调用与之相对应的构造函数对对象进行初始化
				  一般函数：对象创造后，需要该函数的功能，该函数才会被调用
				2.构造函数：对象创建时，会调用，并且只调用一次
				  一般函数：对象创建后，可以被调用很多次
结果1：person run!
			 null: 0
证明1：注释：对象创建后 构造函数就会运行，进行初始化操作
						构造函数如果时空参数，默认初始的值为null 或者 0

结果2：person run
			 苏同学: 22
心得2：this的使用时间 --- 当成员变量和局部变量重名，就可以用关键字this来区分
			 this用法：哪个对象调用了this所在的函数，this就代表哪个对象
			 eg：
			 	Person(String n ,int a)									|		Person(String name ,int age)	
				{                												|     {                  
					name = n;															|				this.name = name;
					age = a;															|				this.age = age;
					System.out.println("person run");			|				System.out.println("person run");
				}																				|			}
			
			上述两种写法结果一样，前者便于阅读，后者更为常用（成员变量名和局部变量名重名）
			以左边为例，其中name是类中的变量，即成员变量，而n和a仅仅是局部变量
					this.成员变量 = 局部变量
			上述用法表示，将局部变量name的值赋给成员变量，两者之间通过this来区分。
			
			详解：	按照java语言的变量作用范围规定，参数a的作用范围是类的内部，这样在构造方法和一般函数
						方法内部就存在了变量a的冲突，Java语言规定当变量作用范围重叠时，作用域小的变量覆盖作
						用域大的变量。
							这样需要访问成员变量a则必须使用this进行引用（如上述程序右侧）。当然，如果变量名不发生重叠，则this可以
						省略（如上述程序左侧）。
			
			如下也可以正常运行：
				public void speak()
				{
					System.out.println(this.name +": "+ this.age );
				}
			
*/

class Person
{
	private String name;
	private int age;
	
	//person类的构造函数，而且是空参数
	/*
	Person()
	{
		System.out.println("person run!");
	}
	*/
	
	//person类的构造函数，参数不为空
	Person(String n ,int a)
	{
		name = n;
		age = a;
		System.out.println("person run");
	}
	
	public void speak()
	{
		System.out.println(name +": "+ age );
	}
}

class GouZaoDemo
{
	public static void main(String args[])
	{
		Person p = new Person("苏同学",22);
		p.speak();
	}
	
}