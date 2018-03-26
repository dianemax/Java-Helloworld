/**
time：2018-1-23 15:355:57
author：@su

need：买票
thought：四个窗口在卖票
				 如下：
					d.start();
					d.start();
					d.start();
					d.start();
				 会抛出异常： 余票:19---Thread-0Exception in thread "main"
															 						 java.lang.IllegalThreadStateException余票:6---Thread-0
											        at java.lang.Thread.start(Thread.java:708)

											余票:5---Thread-0       at TicketDemo4.main(ticketdemo4.java:39)
											余票:4---Thread-0
				 原因：
				 			多次启动一个程序是违法的，特别是当线程已经结束后，不能再重新启动。
				 			
				 多线程的安全问题：
				 			线程安全问题的现象的原因 --- 1. 多线程在操作共享的数据
				 																	 2. 操作共享数据的线程代码有多条
				 															 当一个线程在执行操作共享数据的多条代码的过程中，其他线程参与
				 															 了运算，就会导致安全问题的产生。
				 			解决思路：就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候其他线程不可以参与运算
				 								必须要当前的线程把这些代码都执行完毕后，其他线程才可以参与运算。
				 				--- 同步代码块
				 	need：同步代码块 --- 解决线程安全问题
					step：同步代码块的格式：
									synchronied（对象）
									{
										需要被同步的代码；
									}
									
								eg：
									public void run()
									{
										while(true)
										{
											synchronized(obj)
											{
												if(num > 0)
												{
													try
													{
														Thread.sleep(10);
													}
													catch(InteruptedException e){}
													System.out.println("over");
												}
											}
										}
									}
					thought：同步的好处：解决了线程的安全问题
									 同步的弊端：相对降低了效率，因为同步外的线程都会判断同步锁消耗资源
									 同步的前提：必须有多个线程使用同一个锁。
				 			
				 
*/

class Ticket implements Runnable
{
	private static int num = 30;
	
	public void run()
	{
		sale();
	}
	public void sale()
	{
		while(true)
		{
			if(num >= 0)
			{
				System.out.println("余票:" + num + "---" + Thread.currentThread().getName() );
				num--;
			}
		}
	}
}

class TicketDemo4
{
	public static void main(String args[])
	{
		Ticket t = new Ticket();
		Thread d = new Thread(t);
		
		d.start();
		d.start();
		d.start();
		d.start();
	}
}