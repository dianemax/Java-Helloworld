/**
time��2017-11-11 21:04:46
author��@su

�����ڲ���ĳ�ʼ������ 
˼·��
�ĵã�

*/

/*
code1:		 new Zi();
result1:   fu constructor run
					 show   0
					 zi constructor  9
step1:  1. new Zi,����Zi�̳���Fu����Ҫ��ʼ��Fu����������fu constructor run��
			  2. �����show�������������У����ִ�������е�show���������show   0 ����ʱ��num���ǳ�ʼֵ0��
			  3. ���ִ������ĳ������zi constructor  9
			  4. Ϊʲô������ִ�������е�show�����أ���Ϊ������main��ֻ�������new Zi������������new Zi����.show����
			  
code2:     new Zi().show();
result2:   fu constructor run
					 show   0
					 zi constructor  9
					 show   10
step2:	1. new Zi,����Zi�̳���Fu����Ҫ��ʼ��Fu����������fu constructor run��
			  2. �����show�������������У����ִ�������е�show���������show   0 ����ʱ��num���ǳ�ʼֵ0��
			  3. ���ִ������ĳ������zi constructor  9
			  4. Ȼ��ִ��new Zi()�е�show��������ʱ����������num����ֵΪ9����󱻸���Ϊ10���������show   10
			  
code3:     

*/
class Fu
{
	Fu()
	{
		System.out.println("fu constructor run");
		show();
	}
	
	void show()
	{
		System.out.println("show");
	}
}

class Zi extends Fu
{
	int num = 9;
	
	//�����
	{
		System.out.println("�����  " + num);
		num = 10;
	}
	
	Zi()
	{
		//super();
		//��ʽ��ʼ��
		//���������ʼ��
		System.out.println("zi constructor  " + num);
	}
	
	void show()
	{
		System.out.println("show   " + num);
	}
	
}

class InnerClassDemo7
{
	public static void main(String args[])
	{
		new Zi().show();
	}
}
