/**
time��2017-11-9 21:14:01
author��@su

���������ڲ���ϸ��
�ĵã�new Inner(); 	 //eg1  //innerclassdemo5.java:20: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� this
                            // 												 new Inner();
                            // ����취��static class Inner
                     //eg2  //ע�͵� new Inner�������У������ʾ����ɹ�������Ϊʲô�أ�
                     				//��Ϊ�����method��������new Inner���� = new this.Inner ();
                     				//Ϊʲô�������� main �в�ʹ�� new this.Inner();�أ�
                     				//��Ϊ static ���ܺ� this ���档

*/

class InnerClassDemo5
{
	class Inner
	{
		
	}
	
	public static void main(String args[])
	{
		System.out.println("hello world");
		new Inner();   	 //eg1  //innerclassdemo5.java:20: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� this
                            // 												 new Inner();
                            // ����취��static class Inner
                     //eg2  //ע�͵� new Inner�������У������ʾ����ɹ�������Ϊʲô�أ�
                     				//��Ϊ�����method��������new Inner���� = new this.Inner ();
                     				//Ϊʲô�������� main �в�ʹ�� new this.Inner();�أ�
                     				//��Ϊ static ���ܺ� this ���档
	}
	
	public void method()
	{
		new Inner();
	}
	
}