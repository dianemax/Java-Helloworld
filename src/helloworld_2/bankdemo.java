/**
time��2018-1-23 15:58:46
author��@su
need��������Ǯ ���� һ�˴�һ�Σ�������
thought: Ϊʲôprivate Bank b = new Bank(); ������� 100 200 300 400 500 600
				 ��  Bank b = new Bank(); �������100 100 200 200 300 300������
				 
				 ��Ϊ�������̣߳�ÿ���̶߳�newһ�������൱�������У�����private���񴴽�
				 			 һ�Σ��൱�������û���һ�����������Ǯ��

*/

class Bank  //���
{
	private int sum=0;
	private Object obj = new Object();
	public void add(int i)
	{
		synchronized(obj)         //��װ�飬ͬʱ����Ҳ��һ����װ�飬��˿���ͬ������
		{
			sum = sum + i;
			try{Thread.sleep(10);}  catch(InterruptedException e){}
			System.out.println("��" + sum );
		}
	}
	
}

class Customer implements Runnable //��Ǯ
{
	private int i = 100;
	
	private Bank b = new Bank();  //new Bank������run���������ԭ�򣺺���ÿ����һ���߳̾�Ҫnewһ�������൱�����������д�Ǯ
																//bank ǰ���private��ԭ��
	
	public void run()
	{
//		Bank b = new Bank();
		for(int t =0; t < 3; t++)
		{
			b.add(100);
		}
	}
	
}

class BankDemo
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