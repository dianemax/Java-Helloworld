/**
time：2018-1-24 14:30:29
author：@su

need：等待唤醒机制
step：
thought：1. wait（）：让线程处于冻结状态
				 2. notify（）：唤醒线程池中的一个线程，没有顺序 是任意的
				 3. notifyAll（）：唤醒线程池中的所有线程。
				 		这些方法都必须定义在同步中，因为这些方法是用于操作线程状态的方法，必须要
				 明确到底操作的是那个锁上的线程。
				 
				 为什么操作线程的方法wait notify notifyALL定义在了Object中？
				 因为这些方法是监视器的方法，监视器其实就是锁。
				 锁可以是任意的对象 任意的对象调用的方式一定定义在Object中。
				
*/

class Resource
{
	private String name;
	private String sex;
	private boolean flag = false;
	
	public synchronized void set(String name,String sex)
	{
		if(flag)
		{
			try{this.wait();} catch(Exception e){}
		}
		this.name = name;
		this.sex = sex;
		
		flag = true;
		
		notify();
	}
	
	public synchronized void out()
	{
		if(!flag)
		{
			try{this.wait();} catch(Exception e){}
		}
		System.out.println(name +"---" + sex);
		
		flag = false;
		notify();
	}
}

class Input implements Runnable
{
	Resource r;
	Input(Resource r)
	{
		this.r = r;
	}
	
	public void run()
	{
		int x = 0;
		while(true)
		{
			if(x == 0)
			{
				r.set("sususu","male");
			}
			else
			{
				r.set("苏苏苏","------女");
			}
			x = (x + 1) % 2;
		}
	}
	
}

class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
			try{Thread.sleep(100);} catch(Exception e){}
			r.out();
		}
	}
	
}

class ResourceDemo2
{
	public static void main(String args[])
	{
		Resource r = new Resource();
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
	}
}