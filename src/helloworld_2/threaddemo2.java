/**
time��2018-1-23 11:01:57
author��@su

need�������̵߳ĵڶ��ַ��� --- �ӿڣ�Runnable�ӿ�
step��1. ����ʵ��Runable�ӿ�
			2. ���ǽӿڵ�runnable���������߳���������װ��run������
			3. ͨ��thread�ഴ���̶߳��󣬲���runnable�ӿڵ����������Ϊ���캯���Ĳ������д���
						Ϊʲô��
						��Ϊ�̵߳����񶼷�װ��runnable�ӿڵ���������run������
						����Ҫ���̶߳��󴴽�ʱ�ͱ�����ȷҪ���е�����
			4. �����̶߳����start���������߳�
thought��1. ʵ��runnable�ӿڵĺô���
						1> ���̵߳�������̵߳������з�������������˼򵥵ķ�װ
						2> �����˵��̳еľ�����
				 2. ����������һЩ��

*/

class Demo implements Runnable  //����ʵ��runnable�ӿ�
{
	public void show()
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println(i +"---" + Thread.currentThread().getName());
		}
	}
	
	public void run()   //����run����
	{
		show();	
	}
}

class ThreadDemo2
{
	public static void main(String args[])
	{
		Demo d = new Demo();      //ͨ��thread�ഴ���̶߳��󣬲�ͨ��runnable�ӿڵ����������Ϊ�������д���
		Thread t1 = new Thread (d);
		Thread t2 = new Thread (d);
		t1.start();          //�����߳�
		t2.start();
	}
}