/**
time��2018-1-24 19:45:27
author��@su

need������������������ --- ����һ������һ��
step��1. ��Դ --- ��װ��Դ������������
				 1> ��Ʒ����Ŀ
				 2> ������Ʒ
				 3> ������Ʒ
			2. ������
			3. ������
			4. ���߳�
thought��

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
		System.out.println(Thread.currentThread().getName() + "---������---" + this.name );
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
		System.out.println(Thread.currentThread().getName() + "-----������-----" + this.name );
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
			r.set("��Ѽ",1);
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