/**
time��2018-1-25 09:31:24
author��@su

need���������߶�����������
step��
thought��while --- Ҫѭ���жϣ���ֹ����
				 notifyAll --- notify�ᵼ����������Ϊ���ܻỽ���Լ�һ���������notify����������
				 							 �����notifyAll����ȫ���̣߳�����notifyAllҲ�ỽ���Լ�һ�����̣߳������Լ�һ�����̻߳��Ѻ󻹻��ж�flag�������ȴ������ǶԷ��̱߳�����

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
		System.out.println(Thread.currentThread().getName() + "---������---" + this.name);
		flag = true;
		notifyAll();
		
	}
	
	public synchronized void out()  
	{
		while(!flag)
			{try{this.wait();} catch(Exception e){} }
		try{Thread.sleep(50);} catch(Exception e){}
		System.out.println(Thread.currentThread().getName() + "-----������-----" + this.name );
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
			r.set("��Ѽ");
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