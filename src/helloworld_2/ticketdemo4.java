/**
time��2018-1-23 15:355:57
author��@su

need����Ʊ
thought���ĸ���������Ʊ
				 ���£�
					d.start();
					d.start();
					d.start();
					d.start();
				 ���׳��쳣�� ��Ʊ:19---Thread-0Exception in thread "main"
															 						 java.lang.IllegalThreadStateException��Ʊ:6---Thread-0
											        at java.lang.Thread.start(Thread.java:708)

											��Ʊ:5---Thread-0       at TicketDemo4.main(ticketdemo4.java:39)
											��Ʊ:4---Thread-0
				 ԭ��
				 			�������һ��������Υ���ģ��ر��ǵ��߳��Ѿ������󣬲���������������
				 			
				 ���̵߳İ�ȫ���⣺
				 			�̰߳�ȫ����������ԭ�� --- 1. ���߳��ڲ������������
				 																	 2. �����������ݵ��̴߳����ж���
				 															 ��һ���߳���ִ�в����������ݵĶ�������Ĺ����У������̲߳���
				 															 �����㣬�ͻᵼ�°�ȫ����Ĳ�����
				 			���˼·�����ǽ����������������ݵ��̴߳����װ�����������߳���ִ����Щ�����ʱ�������̲߳����Բ�������
				 								����Ҫ��ǰ���̰߳���Щ���붼ִ����Ϻ������̲߳ſ��Բ������㡣
				 				--- ͬ�������
				 	need��ͬ������� --- ����̰߳�ȫ����
					step��ͬ�������ĸ�ʽ��
									synchronied������
									{
										��Ҫ��ͬ���Ĵ��룻
									}
									
								eg��
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
					thought��ͬ���ĺô���������̵߳İ�ȫ����
									 ͬ���ı׶ˣ���Խ�����Ч�ʣ���Ϊͬ������̶߳����ж�ͬ����������Դ
									 ͬ����ǰ�᣺�����ж���߳�ʹ��ͬһ������
				 			
				 
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
				System.out.println("��Ʊ:" + num + "---" + Thread.currentThread().getName() );
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