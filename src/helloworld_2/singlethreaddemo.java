/**
time：2018-1-23 20:24:53
author：@su

need：多线程下的单例设计模式
step：
thought：单例设计模式：
				 //懒汉式
						class SingleThreadDemo
						{
							private static final SingleThreadDemo s = new SingleThreadDemo();
							private SingleThreadDemo(){}
							public static SingleThreadDemo getInstance()
							{
								return s;
							}
						}

				 //饿汉式
						class SingleThreadDemo
						{
							private static SingleThreadDemo s = null;
							private SingleThreadDemo(){}
							public static SingleThreadDemo getInstance()
							{
								if(s == null)
									s = new SingleThreadDemo();
								else
									return s;
							}
						}

*/

//懒汉式中加入线程
class Single
{
	private static Single s = null;
	private Single(){}
	public static Single getInstance()
	{
		if(s == null)//线程0 和 线程1 ，当线程0进来的时候为null,判断锁，拿到锁
		{
			synchronized(Single.class) //判断锁消耗资源 于是在锁外面加一个判断语句
			{
				if(s == null) 
					s = new Single();  //线程0拿到执行权创建s，挂在这里，s不为空，线程1进不来
				
			}
		}
		return s;
	}
}