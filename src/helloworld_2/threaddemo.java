/**
time��2018-1-23 11:01:57
author��@su

need�������̵߳ĵ�һ�ַ��� --- ����Thread��
step��1. ����һ�������̳�Thread��
			2. ����Thread�е�run����
			3. ֱ�Ӵ���Thread���������
			4. ����start���������߳�
thought��1. �Զ�����߳��������������
						thread�����������̣߳��߳�����Ҫ����ģ�����threadҲ�Ƕ����������������������ͨ��thread���е�run������ʵ�֣�
						Ҳ����˵��run�������Ƿ�װ���Զ����߳���������ĺ�����
						
						run�����ж���ľ����߳�Ҫ���е��������
						

*/

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		super(name);  //���  su su...
		//this.name = name;    // ��� Thread-0 Thread-0...
	}
	
	public void run()
	{
		for(int i =0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

class ThreadDemo
{
	public static void main(String args[])
	{
		Demo d = new Demo("su");
		d.start();
	}
}