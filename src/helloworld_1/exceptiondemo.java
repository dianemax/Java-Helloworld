/**
time��2017-11-14 17:29:11
author��@su

�����쳣 --- exception
˼·����ǰ���������Ǵ�������⴦�����ϣ����ڽ��������̴������������룬����Ķ���
			eg. ��ǰ��																						|	���ڣ�
					public static void main(String args[]��						| public static void main(String args[]��
					{																									| {
						if��time < 0��																	|		if(time < 0)
						{																								|   {
							����취��																		|			�׳� new FuTime();
							����취;																			|   }
						}																								|   if(time > 10000)
						if��time > 10000��															|   {
						{																								|     �׳� new BigTime������
							����취��																		|   }
							����취��																		| }
						}																								|
					}																									|
					
			ע��FuTime�������ʹ����ʱ��Ϊ�����������������л����������������
			
�ĵã�1. �쳣����������ʱ�ڷ����Ĳ��������
							 ��Java���������ʽ�Բ�������������������ͷ�װ����
			2. ��ʵ�쳣����Javaͨ����������˼�뽫�����װ���˶���
			3. ����ܶ࣬��ζ����������Ҳ�ܶ࣬���乲�Խ������ϳ�ȡ���γ����쳣��ϵ
			4. �������⣺
					   ����������ͷֳ��������� 1> һ�㲻���ɴ����  Error
						 													2> ���Դ���� Exception
					A. Throwable: ������error�������쳣���⣬���ⷢ����Ӧ�ÿ����׳����õ�����֪��������
						 						//����ϵ���ص������Throwable�������е����඼���п�����
							   �����Ե���ָʲô�أ���ô�����ֿ������أ�
								 ��ʵ��ͨ�������ؼ��������ֵ� --- throw throws�����ǿ��Ա��������ؼ�������������Ͷ����Ǿ��п����Ե�
					B. Error��
								 �ص㣺����jvm�׳��������Ե����⣬�������ⷢ��һ�㲻����Դ���
�����Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: ����Ǳ�Խ�磬Խ��Ǳ��ǣ�3
															        at Demo.method(exceptiondemo.java:47)
															        at ExceptionDemo.main(exceptiondemo.java:59)
							 

*/

class Demo
{
	public int method (int[] arr,int index) //throws FuShuIndexException
	{
		if(index >= arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("����Ǳ�Խ�磬Խ��Ǳ��ǣ�" + index);
		}
		return arr[index];
	}
}

class ExceptionDemo
{
	public static void main(String args[])
	{
		int[] arr = new int[3];
		Demo d = new Demo();
		int num = d.method(arr,3);
	}
}