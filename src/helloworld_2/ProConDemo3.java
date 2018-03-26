/**
time��2018-1-25 10:50:05
author��@su

need��������������
step��
thought��Lock�ӿڣ�
						�����ͬ����������ͬ����������ͬ������ʽ��������Ϊ��ʽ����ͬʱ�������
						����һ�����ϼӶ��������
				 Condition�ӿڣ������Object�е�wait notify notifyall����
				 		����Щ�������������������˷�װ�������Condition���������������Զ��������������

*/
import java.util.concurrent.locks.* ;
class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	//����һ��������
	Lock lock = new ReentrantLock();
	//ͨ�����е�����ȡ�����ϵļ���������
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
			System.out.println(Thread.currentThread().getName() + "---������---" + this.name);
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
			System.out.println(Thread.currentThread().getName() + "-----������-----" + this.name );
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
			r.set("��Ѽ");
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
