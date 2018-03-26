/**
time��2018-1-24 14:30:29
author��@su

need���ȴ����ѻ���
step��
thought��1. wait���������̴߳��ڶ���״̬
				 2. notify�����������̳߳��е�һ���̣߳�û��˳�� �������
				 3. notifyAll�����������̳߳��е������̡߳�
				 		��Щ���������붨����ͬ���У���Ϊ��Щ���������ڲ����߳�״̬�ķ���������Ҫ
				 ��ȷ���ײ��������Ǹ����ϵ��̡߳�
				 
				 Ϊʲô�����̵߳ķ���wait notify notifyALL��������Object�У�
				 ��Ϊ��Щ�����Ǽ������ķ�������������ʵ��������
				 ������������Ķ��� ����Ķ�����õķ�ʽһ��������Object�С�
				
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
				r.set("������","------Ů");
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