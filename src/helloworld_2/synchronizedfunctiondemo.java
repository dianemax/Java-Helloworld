/**
time��2018-1-23 19:45:58
author��@su
need��ͬ������
thought: 12�� --- ͬ������
				 ͬ������ʹ�õ����� this
				 
				 ͬ��������ͬ������������ͬ�����������ǹ̶���this
				 														 ͬ����������������Ķ���
				 ����ʹ��ͬ������顣
*/

class Bank  //���
{
	private int sum=0;
	private Object obj = new Object();
	public synchronized void add(int i)
	{
			sum = sum + i;
			try{Thread.sleep(10);}  catch(InterruptedException e){}
			System.out.println("��" + sum );
	}
	
}

class Customer implements Runnable //��Ǯ
{
	private int i = 100;
	private Bank b = new Bank();  
	
	public void run()
	{
		for(int t =0; t < 3; t++)
		{
			b.add(100);
		}
	}
	
}

class synchronizedfunctiondemo
{
	public static void main(String args[])
	{
		Customer c = new Customer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}