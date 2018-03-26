/**
time��2018-1-23 20:24:53
author��@su

need�����߳��µĵ������ģʽ
step��
thought���������ģʽ��
				 //����ʽ
						class SingleThreadDemo
						{
							private static final SingleThreadDemo s = new SingleThreadDemo();
							private SingleThreadDemo(){}
							public static SingleThreadDemo getInstance()
							{
								return s;
							}
						}

				 //����ʽ
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

//����ʽ�м����߳�
class Single
{
	private static Single s = null;
	private Single(){}
	public static Single getInstance()
	{
		if(s == null)//�߳�0 �� �߳�1 �����߳�0������ʱ��Ϊnull,�ж������õ���
		{
			synchronized(Single.class) //�ж���������Դ �������������һ���ж����
			{
				if(s == null) 
					s = new Single();  //�߳�0�õ�ִ��Ȩ����s���������s��Ϊ�գ��߳�1������
				
			}
		}
		return s;
	}
}