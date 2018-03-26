/**
time：2018-1-23 11:01:57
author：@su

need：创建线程的第一种方法 --- 创建Thread类
step：1. 定义一个类来继承Thread类
			2. 覆盖Thread中的run方法
			3. 直接创建Thread的子类对象
			4. 调用start方法开启线程
thought：1. 自定义的线程它的任务在哪里？
						thread类用于描述线程，线程是需要任务的，所以thread也是对任务的描述，这个任务就是通过thread类中的run方法来实现，
						也就是说，run方法就是封装在自定义线程运行任务的函数。
						
						run方法中定义的就是线程要运行的任务代码
						

*/

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		super(name);  //输出  su su...
		//this.name = name;    // 输出 Thread-0 Thread-0...
	}
	
	public void run()
	{
		for(int i =0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

class ThreadDemo
{
	public static void main(String args[])
	{
		Demo d = new Demo("su");
		d.start();
	}
}