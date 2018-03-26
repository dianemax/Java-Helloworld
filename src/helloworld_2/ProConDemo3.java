/**
time：2018-1-25 10:50:05
author：@su

need：多生产消费者
step：
thought：Lock接口：
						替代了同步代码块或者同步函数，将同步的隐式锁操作变为显式锁，同时更加灵活
						可以一个锁上加多组监视器
				 Condition接口：替代了Object中的wait notify notifyall方法
				 		将这些监视器方法单独进行了封装，变成了Condition监视器方法，可以对任意锁进行组合

*/
import java.util.concurrent.locks.* ;
class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	//创建一个锁对象
	Lock lock = new ReentrantLock();
	//通过已有的锁获取该锁上的监视器对象
	Condition Producer_con = lock.newCondition();
	Condition Consumer_con = lock.newCondition();
	
	public void set(String name)
	{
		lock.lock();
		try
		{
			while(flag)
				try{Producer_con.await();} catch(Exception e) {}
			this.name = name + count;
			count++;
			try{Thread.sleep(50);} catch(Exception e){}
			System.out.println(Thread.currentThread().getName() + "---生产者---" + this.name);
			flag = true;
			Consumer_con.signal();
		}
		
		finally
		{
			lock.unlock();
		}
	}
	
	public void out()
	{
		lock.lock();
		try
		{
			while(!flag)
				try{Consumer_con.await();} catch(Exception e) {}
			try{Thread.sleep(50);} catch(Exception e){}
			System.out.println(Thread.currentThread().getName() + "-----消费者-----" + this.name );
			flag = false;
			Producer_con.signal();
		}
		finally
		{
		 	lock.unlock();
		}
		
	}
	
}

class Producer implements Runnable
{
	Resource r;
	Producer(Resource r)
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

class Consumer implements Runnable
{
	Resource r;
	Consumer(Resource r)
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
class ProConDemo3
{
	public static void main(String args[])
	{
		Resource r = new Resource();
		
		Producer in = new Producer(r);
		Consumer out = new Consumer(r);
		
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
