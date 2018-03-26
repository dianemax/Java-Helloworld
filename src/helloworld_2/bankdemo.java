/**
time：2018-1-23 15:58:46
author：@su
need：储户存钱 俩人 一人存一次，存三次
thought: 为什么private Bank b = new Bank(); 输出的是 100 200 300 400 500 600
				 而  Bank b = new Bank(); 输出的是100 100 200 200 300 300？？？
				 
				 因为：开启线程，每个线程都new一个对象，相当于俩银行，加了private就像创建
				 			 一次，相当于两个用户往一个银行里面存钱。

*/

class Bank  //余额
{
	private int sum=0;
	private Object obj = new Object();
	public void add(int i)
	{
		synchronized(obj)         //封装块，同时函数也是一个封装块，因此可以同步函数
		{
			sum = sum + i;
			try{Thread.sleep(10);}  catch(InterruptedException e){}
			System.out.println("余额：" + sum );
		}
	}
	
}

class Customer implements Runnable //存钱
{
	private int i = 100;
	
	private Bank b = new Bank();  //new Bank不放在run方法里面的原因：后面每开启一次线程就要new一个对象，相当于在两个银行存钱
																//bank 前面加private的原因
	
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