/**
time��2018-1-23 15:10:12
author��@su

need����Ʊ
thought���ĸ���������Ʊ
wrong���ܹ�30��Ʊ ����ÿ�����ڶ�����ȥ��ʮ��
			 ԭ����ջ��������߳� --- һ��main�߳� �ĸ��Զ�����߳�
			 			 �����ڶ��У��������ĸ�num
			 �������num���ڷ������У����� --- static

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