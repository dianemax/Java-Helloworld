/**
time��2018-1-25 15:24:08
author��@su

need��wait\sleep   ��   �߳�ֹͣ   �� �ػ��߳�   ��  join����  ��   ��ͣ
step��
thought��1. wait �� sleep������
						1. wait����ָ��ʱ��Ҳ���Բ�ָ��ʱ��
							 sleep����ָ��ʱ��
						2. ��ͬ���У���CPU��ִ��Ȩ�����Ĵ���ͬ
							 wait ���ͷ�ִ��Ȩ���ͷ���
							 sleep���ͷ�ִ��Ȩ�����ͷ���
				 
				 2. �߳�ֹͣ����
				 		1. stop����
				 		2. run��������
				 		
				 		��ô�����̵߳���������أ�
				 		�����ж�����ѭ���ṹ��ֻҪ����סѭ���Ϳ��Խ����߳�����
				 		
				 		����ѭ�� --- ͨ���ö����������
				 		��������̴߳����˶���״̬���޷���ȡ��ǣ���ν����أ�
				 		
				 		interrupt�����������Խ��̴߳Ӷ���״̬ǿ�ƻָ�������״̬�������߳̾߱�CPU��ִ���ʸ�
				 		���ǿ�ƶ����ᷢ��InterruptedException���ǵ�Ҫ����
				 		
				 3. setDeamon 
				 		�����߱��Ϊ�ػ��̻߳��û��̡߳����������е��سǶ����ػ��߳�ʱ��Java������˳���
				 		�÷��������������߳�֮ǰ���á�
				 		
				 4. Thread.join(); Thread�߳�Ҫ���������������У���ʱ����һ���߳�����ʱ����ʹ��join����
				 		�̱߳�����һ�� toString�����������ظ��̵߳����ơ����ȼ����߳���
				 		
				 5. �߳����ȼ�
				 		Thread.setPriority(Thread.MAX_PRIORITY)   --- һ����10,5,1�ȵȣ�Ҳ����max min mid
				 
				 6. �߳���
				 
				 7. yield���� --- ��ͣ
				 		Thread.yield();
				 

*/

class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName() + "---" );
				
			}
			System.out.println(Thread.currentThread().getName() + "*****");
		}
	}
	
//	public void setFlag()
//	{
//		flag = false;
//	}
}

class StopThreadDemo
{
	public static void main(String args[])
	{
		StopThread st = new StopThread();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.setDaemon(true);
		t1.start();
		t2.setDaemon(true);
		t2.start();
		
		System.out.println();
		
		int num = 1;
		for(;;)
		{
			if(++num==50)
			{
				//st.setflag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			
			System.out.println("main --- " + num);
		}
		
		System.out.println("over");
		
	}
	
}