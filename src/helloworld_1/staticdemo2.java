/**
time��2017-10-27 14:49:25
author��@su

����static���֪ʶ
˼·��1> �������Ǿ�̬�ģ�
			2> ��̬ʡ�Ե����������Ǿ�̬ʡ�Ե���this��
�ĵã�1> ��������дΪ��public  void main(String[] args)ʱ�������±���
					����: main ���������� StaticDemo2 �е�static, �뽫 main ��������Ϊ:
   				public static void main(String[] args)
			2> ������Ϊshow����ʱ�����Ϊ��
					staticdemo2.java:19: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� show()
			3> new StaticDemo2().show();
					Ҫ�� new ����.���� ������
*/

class StaticDemo2
{
	int num = 4;
	public static void main(String[] args)
	{
		new StaticDemo2().show();
	}
 
	public void show()
	{
		System.out.println(num);
	}
}