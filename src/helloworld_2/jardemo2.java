/**
time��2017-11-20 16:14:24
author��@su

���󣺰����֮��ķ��� �Լ� error����������취
˼·��
�ĵã�1> code1��		JarDemo d = new JarDemo();
										d.show();
				 error1��   jardemo2.java:16: ����: �Ҳ�������
										                JarDemo d = new JarDemo();
										                ^
										  ����:   �� JarDemo
										  λ��: �� JarDemo2
										jardemo2.java:16: ����: �Ҳ�������
										                JarDemo d = new JarDemo();
										                                ^
										  ����:   �� JarDemo
										  λ��: �� JarDemo2
					ans1�� ����д��
								 ��Ϊ��JarDemo���Ѿ��а������������Ա���Ҫ��ȷ�����
					ע�⣺ JarDemo��������Ǵ���ģ���ȷ������ ����.����  jardemo.JarDemo
								 ��˳���Ӧ�ø�Ϊ��jardemo.JarDemo d = new jardemo.JarDemo();
								 
		 	2>  code2��jardemo.JarDemo d = new jardemo.JarDemo();
		 						 d.show();
		 			error2��   jardemo2.java:31: ����: JarDemo��jardemo�в��ǹ�����; �޷����ⲿ������ж�����з���
											                jardemo.JarDemo d = new jardemo.JarDemo();
											                       ^
										 jardemo2.java:31: ����: JarDemo��jardemo�в��ǹ�����; �޷����ⲿ������ж�����з���
											                jardemo.JarDemo d = new jardemo.JarDemo();
											                                               ^
										 2 ������
					ans2�� Ȩ�����⡣
								 �����ļ�����Ҫ������һ���ļ��������óɹ��е�public
								 �޸�Ϊ��public class JarDemo
								 
			 3> code3:   public class JarDemo
			 		error3:  jardemo2.java:45: ����: JarDemo��jardemo�в��ǹ�����; �޷����ⲿ������ж�����з���
               		 jardemo.JarDemo d = new jardemo.JarDemo();
          ans:   Ȩ�����⡣
          			 �����ļ����ʵ���һ���ļ��еı����ú�����Ȩ�����ó�public
          			 �޸�Ϊ��public void show()
       �ܽ᣺�����֮�������з��ʣ������ʵ��������public�ģ������ʵİ��е�������ͱ�����public��
								 

*/

package jardemo2;   //�ǵüӷֺţ�
class JarDemo2
{
	public static void main(String args[])
	{
		jardemo.JarDemo d = new jardemo.JarDemo();
		d.show();
		System.out.println("mypack2 run~");
	}
}