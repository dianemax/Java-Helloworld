/**
time：2018-1-25 09:31:24
author：@su

need：多生产者多消费者问题
step：
thought：while --- 要循环判断，防止死锁
				 notifyAll --- notify会导致死锁，因为可能会唤醒自己一方，因此用notify（）会死锁
				 							 因此用notifyAll唤醒全部线程，尽管notifyAll也会唤醒自己一方的线程，但是自己一方的线程唤醒后还会判断flag，继续等待，但是对方线程被唤醒

*/

class Resource
{
	private String name;
	private int cout = 1;
	private boolean flag = false;
	
	public synchronized  void set(String name) 
	{
		while(flag)
		{
			try{this.wait();} catch(Exception e){}  
		}
		this.name = name + cout;
		cout++;
		
		try{Thread.sleep(100);} catch(Exception e){}
		System.out.println(Thread.currentThread().getName() + "---生产者---" + this.name);
		flag = true;
		notifyAll();
		
	}
	
	public synchronized void out()  
	{
		while(!flag)
			{try{this.wait();} catch(Exception e){} }
		try{Thread.sleep(50);} catch(Exception e){}
		System.out.println(Thread.currentThread().getName() + "-----消费者-----" + this.name );
		flag = false;
		notifyAll();
		
	}
	
}

class Input implements Runnable
{
	private Resource r;
	Input(Resource r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
			r.set("烤鸭");
		}
	}
	
}

class Output implements Runnable
{
	private Resource r;
	Output(Resource r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
		r.out();
		}
	}
	
}

class ProConDemo2
{
	public static void main(String args[])
	{
		Resource r = new Resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t0 = new Thread(in);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		Thread t3 = new Thread(out);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
	}
}