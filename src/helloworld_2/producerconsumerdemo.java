/**
time：2018-1-24 19:45:27
author：@su

need：生产者消费者问题 --- 生产一次消费一次
step：1. 资源 --- 封装资源、生产、消费
				 1> 物品、数目
				 2> 生产物品
				 3> 消耗物品
			2. 生产者
			3. 消费者
			4. 主线程
thought：

*/

class Resource
{
	private String name;
	private int cout;
	private boolean flag = false;
	
	public synchronized  void set(String name,int cout)
	{
		if(flag)
		{
			try{this.wait();} catch(Exception e){}
		}
		this.name = name + cout;
		cout++;
		
		try{Thread.sleep(100);} catch(Exception e){}
		System.out.println(Thread.currentThread().getName() + "---生产者---" + this.name );
		flag = true;
		this.notify();
		
	}
	
	public synchronized void out()
	{
		if(!flag)
		{
			try{this.wait();} catch(Exception e){}
		}
		
		try{Thread.sleep(100);} catch(Exception e){}
		System.out.println(Thread.currentThread().getName() + "-----消费者-----" + this.name );
		flag = false;
		this.notify();
	}
	
}

class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
			r.set("烤鸭",1);
	}
}

class Consumer implements Runnable
{
	private Resource r;
	Consumer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
			r.out();
	}
}

class ProducerConsumerDemo
{
	public static void main(String args[])
	{
		Resource r = new Resource();
		Producer in = new Producer(r);
		Consumer out = new Consumer(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
	}
}