/**
time��2018-1-23 14:15:57
author��@su

need����Ʊ
thought��һ����������Ʊ

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
				System.out.println("��Ʊ:" + num + "---" + Thread.currentThread().getName() );
				num--;
			}
		}
	}
}

class TicketDemo
{
	public static void main(String args[])
	{
		Ticket t = new Ticket();
		Thread d = new Thread(t);
		
		d.start();
	}
}