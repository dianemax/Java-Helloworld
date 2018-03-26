/**
time：2017-10-26 19:50:41
author：@su

需求：static相关知识
心得：1. 	new Person().name = "苏同学";
					new Person().shou();
				输出结果为：null：China
				原因：创建对象按照如上，初始化两次，第一次输入的苏同学被第二次覆盖，最终输出null，但是country是静态变量，因此一直输出China
			2.	Person p = new Person();
					p.name = "苏同学";
					p.shou();
				输出结果为：苏同学：China
				原因：如上方式创建对象可以多次调用
			3.	Person p = new Person();
					p.name = "苏同学";
					p.shou();
					System.out.println();
					System.out.println(p.country);
					System.out.println();
					System.out.println(Person.country);
				输出结果为：苏同学：China

										China

										China
				原因：static修饰的成员多了一种调用方式 --- 直接被类名调用 eg.	System.out.println(Person.country);
总结：1.static的特点：
				1> static是一个修饰符，用于修饰成员；
				2> 被static修饰的成员被所有对象共享；
				3> static优先于对象存在，因为static的成员随着类的加载而存在；
				4> static修饰的成员多了一种调用方式 --- 直接被类名调用
					 格式：类名.静态成员
				5> static修饰的是共享数据，对象中存储的是特有数据
			2.成员变量和静态变量的区别？
				1> 两个变量的生命周期不同。
					 成员变量随着对象的创建而存在，随着对象的回收而释放；
					 静态变量随着类的加载而存在，随着类的消失而消失（虚拟机结束时消失）；
				2> 调用方式不同。
					 成员变量被对象调用；
					 静态变量可以被对象调用，还可以被类调用；
				3> 别名不同。
					 成员变量也被称为实例变量；
					 静态变量被称为类变量；
				4> 数据的存储位置不同。
					 成员变量数据存储在堆内存中的对象中，所以也叫对象的特有数据；
					 静态变量的数据存储在方法区（方法区中的静态区）所以也叫对象的共享数据。
			3.静态的使用注意事项：
				1> 静态方法只能访问静态成员（非静态既可以访问静态又可以访问非静态） --- 无法从静态上下而文中引用非静态（报错中经常会出现）；
				2> 静态方法中不可以使用this 或者 super关键字 --- eg. System.out.println(this.name + "：" + country); 由于没有创建对象，所以不能用this；
				3> 主函数是静态的；
				4> 静态省略的是类名，非静态省略的是this。 --- System.out.println(Person.country + this.name);

*/

class Person
{
	String name; //成员变量，实例变量
	static String country = "China"; //静态变量，类变量
	public void shou()
	{
		System.out.println(name + "：" + country);
	}	
}

class StaticDemo
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.name = "苏同学";
		p.shou();
		System.out.println();
		System.out.println(p.country);
		System.out.println();
		System.out.println(Person.country);
	}
	
}