/**
time��2017-10-27 21:51:55
author��@su

����static���֪ʶ
�ĵã�1.��̬��ʹ��ʱ����
				1> ��̬����
						 ���������������߱��ĳ�Ա������ֵ������ͬ�ģ����������Ա�Ϳ��Ա���̬���Σ�
						 ֻҪ�������������ǲ�ͬ�ģ����Ƕ�����������ݣ�����洢�ڶ����У����ǷǾ�̬�ģ�
						 �����ͬ�����ݣ�������Ҫ���޸ģ�ֻ��Ҫʹ�ü��ɣ�����Ҫ�洢�ڶ����оͶ���ɾ�̬�ġ�
				2> ��̬����
					   �����ܷ��þ�̬���Σ��Ͳο�һ�� --- �����Ĺ����Ƿ��з��ʵ������е��������ݣ�
					   ����˵: ��Դ�������������ù����Ƿ���Ҫ���ʷǾ�̬�ĳ�Ա�����������Ҫ���ù��ܾ��ǷǾ�̬�ģ�
					             �������Ҫ���Ϳ��Խ��ù��ܺ�������ɾ�̬��Ҳ���Զ���ɷǾ�̬��
				3> ���ǷǾ�̬��Ҫ���������
			2.��̬�����
				1> ������ļ��ض�ִ�У�����ִֻ��һ�Σ�
				2> ���ã����ڶ�����г�ʼ������Щ�಻��Ҫ��������
				3> ����������Ը����еĶ����ʼ����
�����1> ������Ϊ��	static
										{
											System.out.println("hahaha");
											System.out.println("xixixi");
										}
										
										public static void main(String args[])
										{
											System.out.println();
											System.out.println("show run!");
										}
	
				 ������Ϊ��hahaha
										 xixixi

										 show run!
			
				 ˵������ִ�о�̬���������ݽ��г�ʼ�����ٿ�ʼִ����������
				 
			2> ������Ϊ��	public static void main(String args[])
										{
											System.out.println();
											System.out.println("show run!");
										}
										
										//��̬�����
										static
										{
											System.out.println("hahaha");
											System.out.println("xixixi");
										}
				 ������Ϊ��hahaha
										 xixixi

										 show run!
			
				 ˵�������۾�̬������λ�ã�������ִ�о�̬���������ݽ��г�ʼ�����ٿ�ʼִ����������					
	

*/

class StaticDemo3
{
	//��̬�����
	static
	{
		System.out.println("hahaha");
		System.out.println("xixixi");
	}
	
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("show run!");
	}
	
//	//��̬�����
//	static
//	{
//		System.out.println("hahaha");
//		System.out.println("xixixi");
//	}
//	
	
}