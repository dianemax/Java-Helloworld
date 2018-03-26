/**
time：2017-11-7 19:58:24
author：@su

需求：多态 --- 某一类事物的多种存在形态
心得：1. 一个对象对应着不同的类型
			 	 eg. animal x = new cat（）； //一个对象两种形态 --- “=”左右两边不同，就是多态
				 猫这类事物既兼具着猫的形态，又具备动物的属性
			2. 多态在代码中的体现：父类或者接口的引用指向其子类的对象
			3. 好处：
				 		 提高了代码的扩展性，前期定义的代码可以使用后期定义的内容。
				 		 
			4. 转型 --- 由于多态的弊端：前期定义的内容不能使用后期子类的功能（不能使用子类的特有功能）
				 Animal a = new Cat();   //自动类型提升，猫对象提升为了动物
				 //弊端：限制了对特有功能的访问
				 //专业术语：向上转型
				 //如果还想用具体的动物，猫的特有特征，可以向下转型
				 1> 		Animal a = new Cat();
								a.eat();
								a.catchmouse();    error ：duotaidemo.java:52: 错误: 找不到符号
																	  			//	                a.catchmouse();
																					//	                 ^
																					// 符号:   方法 catchmouse()
																					// 位置: 类型为Animal的变量 a
						注意：向上转型无法访问子类中的特有功能
				 2> 		Animal a = new Cat();
								a.eat();
								Cat c = (Cat)a;
								c.catchmouse();
						强制类型转换，可以访问子类的特有内容。
			5. 类型判断：if（a  instanceof Cat）   //instanceof 用于判断对象具有类型。只能用于引用数据类型的判断
				 |
				 ----- 通常在向下转型前用于健壮性的判断。
						
				 		 

*/

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("meat");
	}
	
	void lookhome()
	{
		System.out.println("look home and wangwang");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("fish");
	}
	void catchmouse()
	{
		System.out.println("catch mouse");
	}
}

class DuoTaiDemo
{
	public static void main(String args[])
	{
		Animal a = new Cat();
		a.eat();
		//a.catchmouse();    error ：duotaidemo.java:52: 错误: 找不到符号
											  			//	                a.catchmouse();
															//	                 ^
															// 符号:   方法 catchmouse()
															// 位置: 类型为Animal的变量 a
		
		Cat c = (Cat)a;
		c.catchmouse();
	}
}