/**
time��2017-10-21 20:46:39
author��@su

�����������͵Ĳ�������
˼·��1.�����������Ͳ����Ĵ���
			2.�����������͵Ĵ���
����������4
�ĵã�1.������ջ��Ϊmain���������ڴ棬����һ���µ� �� ���͵Ķ���n��ͬʱ�ڶ��ڴ��г�ʼ��x��ֵΪ0�����Ҹ�nһ�����ڴ�ĵ�ַ
				����ڶ��ڴ��н�x��ֵ��Ϊ3
				n.x = 6�� �����ڴ��е�x��Ϊ6
				����use��������ջ�з����ڴ棬��x��ֵ��Ϊ4�����ջ
				�����������main �� n �ĵ�ַָ����У��������������ֵΪ4
			2.java�г�Ա�����ͷ�����Ϊ��̬��ʵ��
			  a.����һ���� class Text
			  						 {
			  						 		public static int number;
			  						 		public int temp;
			  						 		public static void method(){}
			  						 }
			  	��������temp���ͱ�����newһ���Ķ���Text b = new Text(); ���ܷ���
			  	b.temp����ʵ����Ա����
		���� �����number������ʱ�򣬲���Ҫ����Text��ʵ���Ϳ��Է��ʣ����磺Text.number
			
		���𣺷��ʶ����費��Ҫ��������
				  �������Ա���������ж����ǹ���һ������
*/

class NumberUse2
{
	int x = 3;	//��ȷ
	//public static int x = 3; //��ȷ
	public static void main(String args[])
	{
		//int x = 3;   //error
		NumberUse2 n = new NumberUse2();	//numberuse2.java:17: ����: ��Ҫ'('��'['
     																	//NumberUse2 n = new NumberUse2;
		n.x = 6;
		use(n);
		System.out.println(n.x);
	}
	public static void use(NumberUse2 d)
	{
		d.x = 4;
	}
	
}
/*
����� int x = 3������34�У��ᷢ�����±�����Ϊjava�г�Ա�����ͷ�����Ϊ��̬��ʵ��

numberuse2.java:25: ����: �Ҳ�������
                n.x = 6;
                 ^
  ����:   ���� x
  λ��: ����ΪNumberUse2�ı��� n
numberuse2.java:27: ����: �Ҳ�������
                System.out.println(n.x);
                                    ^
  ����:   ���� x
  λ��: ����ΪNumberUse2�ı��� n
numberuse2.java:31: ����: �Ҳ�������
                d.x = 4;
                 ^
  ����:   ���� x
  λ��: ����ΪNumberUse2�ı��� d
3 ������
*/