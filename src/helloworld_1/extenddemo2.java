/**
time��2017-10-29 08:55:27
author��@su

���󣺼̳�
�ĵã�1.���Ӹ����г��ֳ�Ա����һģһ�������������������ĺ������������󣬳�Ϊ���ǲ����� --- �����
				�������������ԣ�
				1> ���ء�ͬһ�����С�overload
				2> ���ǡ������С�����Ҳ��Ϊ��д����д��override
			2.���ǵ�ע�����
				1> ���෽�����Ǹ��෽��ʱ������Ȩ�ޱ���Ҫ���ڵ��ڸ����Ȩ�ޣ� eg.public��static��private
					 eg.������public void show������������private void show������ �����Ȩ�޾͵��ڸ���Ȩ�ޣ������Լ̳и��ǡ�
				2> ��ֻ̬�ܸ��Ǿ�̬���򱻾�̬���� --- �ټ�
			3.ʲôʱ��ʹ�ø��ǲ�����
				������һ��������������չʱ��������Ҫ��������Ĺ�������������Ҫ���������иù��ܵ���������ʱ����ʹ�ø��ǲ�����ɡ�

*/

/*
������Ϊ��fu run
						zi run

//����һ
class Fu
{
	void show1()
	{
		System.out.println("fu run");
	}
}

class Zi extends Fu
{
	void show2()
	{
		System.out.println("zi run");
	}
}

class ExtendDemo2
{
	public static void main(String args[])
	{
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}

*/


//����Ľ���ǣ�zi run

//�����
class Fu
{
	void show()
	{
		System.out.println("fu run");
	}
}

class Zi extends Fu
{
	void show()
	{
		System.out.println("zi run");
	}
}

class ExtendDemo2
{
	public static void main(String args[])
	{
		Zi z = new Zi();
		z.show();
	}
}