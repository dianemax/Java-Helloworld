/**
time��2018-1-24 10:41:04
author��@su

need��
step��
thought��

*/

class Resource
{
	String name;
	String sex;
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
			synchronized(r)
			{
				if(x == 0)
				{
					r.name = "sususu";
					r.sex = "male";
				}
				else
				{
					r.name = "������";
					r.sex = "ŮŮŮŮŮŮ";
				}
				
				x = (x+1)%2;
			}
		}
//		x = (x+1)%2;  while����ѭ������������������
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
			synchronized(r)
			{
				try{Thread.sleep(100);} catch(Exception e){}
				System.out.println(r.name +"---" + r.sex );
			}	
		}	
	}
}

class ResourceDemo
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