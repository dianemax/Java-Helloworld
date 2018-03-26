/**
time：2017-11-11 21:04:46
author：@su

需求：内部类的初始化过程 
思路：
心得：

*/

/*
code1:		 new Zi();
result1:   fu constructor run
					 show   0
					 zi constructor  9
step1:  1. new Zi,但是Zi继承了Fu，先要初始化Fu，因此先输出fu constructor run；
			  2. 随后有show（），子类中有，因此执行子类中的show（），输出show   0 ，此时的num还是初始值0；
			  3. 最后执行子类的程序，输出zi constructor  9
			  4. 为什么不继续执行子类中的show（）呢？因为主程序main中只有输出了new Zi（），而不是new Zi（）.show（）
			  
code2:     new Zi().show();
result2:   fu constructor run
					 show   0
					 zi constructor  9
					 show   10
step2:	1. new Zi,但是Zi继承了Fu，先要初始化Fu，因此先输出fu constructor run；
			  2. 随后有show（），子类中有，因此执行子类中的show（），输出show   0 ，此时的num还是初始值0；
			  3. 最后执行子类的程序，输出zi constructor  9
			  4. 然后执行new Zi()中的show（），这时候子类里面num被赋值为9，随后被覆盖为10，最终输出show   10
			  
code3:     

*/
class Fu
{
	Fu()
	{
		System.out.println("fu constructor run");
		show();
	}
	
	void show()
	{
		System.out.println("show");
	}
}

class Zi extends Fu
{
	int num = 9;
	
	//代码块
	{
		System.out.println("代码块  " + num);
		num = 10;
	}
	
	Zi()
	{
		//super();
		//显式初始化
		//构造代码块初始化
		System.out.println("zi constructor  " + num);
	}
	
	void show()
	{
		System.out.println("show   " + num);
	}
	
}

class InnerClassDemo7
{
	public static void main(String args[])
	{
		new Zi().show();
	}
}
