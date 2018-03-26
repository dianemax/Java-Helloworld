/**
time：2018-1-25 15:24:08
author：@su

need：wait\sleep   和   线程停止   和 守护线程   和  join方法  和   暂停
step：
thought：1. wait 和 sleep的区别？
						1. wait可以指定时间也可以不指定时间
							 sleep必须指定时间
						2. 在同步中，对CPU的执行权和锁的处理不同
							 wait ：释放执行权，释放锁
							 sleep：释放执行权，不释放锁
				 
				 2. 线程停止方法
				 		1. stop方法
				 		2. run方法结束
				 		
				 		怎么控制线程的任务结束呢？
				 		任务中都会有循环结构，只要控制住循环就可以结束线程任务。
				 		
				 		控制循环 --- 通常用定义标记来完成
				 		但是如果线程处于了冻结状态，无法读取标记，如何结束呢？
				 		
				 		interrupt（）方法可以将线程从冻结状态强制恢复到运行状态来，让线程具备CPU的执行资格
				 		这个强制动作会发生InterruptedException，记得要处理。
				 		
				 3. setDeamon 
				 		将该线标记为守护线程或用户线程。当正在运行的县城都是守护线程时，Java虚拟机退出。
				 		该方法必须在启动线程之前调用。
				 		
				 4. Thread.join(); Thread线程要申请加入进来，运行，临时加入一个线程运算时可以使用join方法
				 		线程本身有一个 toString（）方法返回该线程的名称、优先级和线程组
				 		
				 5. 线程优先级
				 		Thread.setPriority(Thread.MAX_PRIORITY)   --- 一般是10,5,1等等，也可以max min mid
				 
				 6. 线程组
				 
				 7. yield（） --- 暂停
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