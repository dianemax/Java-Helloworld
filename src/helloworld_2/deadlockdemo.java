/**
time：2018-1-24 09:55:22
author：@su

need：死锁
step：同步的嵌套，同步代码块里加同步函数，同步函数里面加同步代码块
result：if --- lock.a --- Thread-0
				else --- lock.b --- Thread-1

*/

class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag = flag;
	}
	public void run()
	{
		show();
	}
	
	public void show()
	{
		if(flag)
		{
			synchronized(Lock.locka)
			{
				System.out.println("if --- lock.a --- " + Thread.currentThread().getName() );
				
				synchronized(Lock.lockb)
				{
					System.out.println("if --- lock.b --- " + Thread.currentThread().getName() );	
				}
				
			}
		}
		else
		{
			synchronized(Lock.lockb)
			{
				System.out.println("else --- lock.b --- " + Thread.currentThread().getName() );
				
				synchronized(Lock.locka)
				{
					System.out.println("else --- lock.a --- " + Thread.currentThread().getName() );	
				}
				
			}
		}
	}
}

class Lock
{
	public static Object locka = new Object();
	public static Object lockb = new Object();
}

class DeadLockDemo
{
	public static void main(String args[])
	{
		Test a = new Test(true);
		Test b = new Test(false);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
	}
}