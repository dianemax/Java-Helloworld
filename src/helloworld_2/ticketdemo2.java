/**
time：2018-1-23 15:10:12
author：@su

need：买票
thought：四个窗口在卖票
wrong：总共30张票 但是每个窗口都卖出去三十张
			 原因：在栈中有五个线程 --- 一个main线程 四个自定义的线程
			 			 但是在堆中，创建了四个num
			 解决：将num放在方法区中，共用 --- static

*/

class Ticket implements Runnable
{
	private int num = 30;
	
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

class TicketDemo2
{
	public static void main(String args[])
	{
		Ticket t = new Ticket();
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		
		Thread d = new Thread(t);
		Thread d1 = new Thread(t1);
		Thread d2 = new Thread(t2);
		Thread d3 = new Thread(t3);
		
		d.start();
		d1.start();
		d2.start();
		d3.start();
	}
}