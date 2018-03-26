/**
time：2018-1-23 11:01:57
author：@su

need：创建线程的第二种方法 --- 接口：Runnable接口
step：1. 定义实现Runable接口
			2. 覆盖接口的runnable方法，将线程任务代码封装到run方法中
			3. 通过thread类创建线程对象，并将runnable接口的子类对象作为构造函数的参数进行传递
						为什么？
						因为线程的任务都封装在runnable接口的子类对象的run方法中
						所以要在线程对象创建时就必须明确要运行的任务
			4. 调用线程对象的start方法开启线程
thought：1. 实现runnable接口的好处：
						1> 将线程的任务从线程的子类中分离出来，进行了简单的封装
						2> 避免了单继承的局限性
				 2. 方法二常用一些！

*/

class Demo implements Runnable  //定义实现runnable接口
{
	public void show()
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println(i +"---" + Thread.currentThread().getName());
		}
	}
	
	public void run()   //覆盖run方法
	{
		show();	
	}
}

class ThreadDemo2
{
	public static void main(String args[])
	{
		Demo d = new Demo();      //通过thread类创建线程对象，并通过runnable接口的子类对象作为参数进行传递
		Thread t1 = new Thread (d);
		Thread t2 = new Thread (d);
		t1.start();          //开启线程
		t2.start();
	}
}