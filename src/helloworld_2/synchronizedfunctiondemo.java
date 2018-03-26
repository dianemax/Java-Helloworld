/**
time：2018-1-23 19:45:58
author：@su
need：同步函数
thought: 12行 --- 同步函数
				 同步函数使用的锁是 this
				 
				 同步函数和同步代码块的区别：同步函数的锁是固定的this
				 														 同步代码块的锁是任意的对象
				 建议使用同步代码块。
*/

class Bank  //余额
{
	private int sum=0;
	private Object obj = new Object();
	public synchronized void add(int i)
	{
			sum = sum + i;
			try{Thread.sleep(10);}  catch(InterruptedException e){}
			System.out.println("余额：" + sum );
	}
	
}

class Customer implements Runnable //存钱
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