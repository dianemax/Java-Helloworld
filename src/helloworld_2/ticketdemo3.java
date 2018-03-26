/**
time£º2018-1-23 15:16:22
author£º@su

need£ºÂòÆ±
thought£ºËÄ¸ö´°¿ÚÔÚÂôÆ±

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
				System.out.println("ÓàÆ±:" + num + "---" + Thread.currentThread().getName() );
				num--;
			}
		}
	}
}

class TicketDemo3
{
	public static void main(String args[])
	{
		Ticket t = new Ticket();
		
		Thread d = new Thread(t);
		Thread d1 = new Thread(t);
		Thread d2 = new Thread(t);
		Thread d3 = new Thread(t);
		
		d.start();
		d1.start();
		d2.start();
		d3.start();
	}
}