/**
time��2017-11-7 19:58:24
author��@su

���󣺶�̬ --- ĳһ������Ķ��ִ�����̬
�ĵã�1. һ�������Ӧ�Ų�ͬ������
			 	 eg. animal x = new cat������ //һ������������̬ --- ��=���������߲�ͬ�����Ƕ�̬
				 è��������ȼ����è����̬���־߱����������
			2. ��̬�ڴ����е����֣�������߽ӿڵ�����ָ��������Ķ���
			3. �ô���
				 		 ����˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڶ�������ݡ�
				 		 
			4. ת�� --- ���ڶ�̬�ı׶ˣ�ǰ�ڶ�������ݲ���ʹ�ú�������Ĺ��ܣ�����ʹ����������й��ܣ�
				 Animal a = new Cat();   //�Զ�����������è��������Ϊ�˶���
				 //�׶ˣ������˶����й��ܵķ���
				 //רҵ�������ת��
				 //��������þ���Ķ��è��������������������ת��
				 1> 		Animal a = new Cat();
								a.eat();
								a.catchmouse();    error ��duotaidemo.java:52: ����: �Ҳ�������
																	  			//	                a.catchmouse();
																					//	                 ^
																					// ����:   ���� catchmouse()
																					// λ��: ����ΪAnimal�ı��� a
						ע�⣺����ת���޷����������е����й���
				 2> 		Animal a = new Cat();
								a.eat();
								Cat c = (Cat)a;
								c.catchmouse();
						ǿ������ת�������Է���������������ݡ�
			5. �����жϣ�if��a  instanceof Cat��   //instanceof �����ж϶���������͡�ֻ�����������������͵��ж�
				 |
				 ----- ͨ��������ת��ǰ���ڽ�׳�Ե��жϡ�
						
				 		 

*/

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("meat");
	}
	
	void lookhome()
	{
		System.out.println("look home and wangwang");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("fish");
	}
	void catchmouse()
	{
		System.out.println("catch mouse");
	}
}

class DuoTaiDemo
{
	public static void main(String args[])
	{
		Animal a = new Cat();
		a.eat();
		//a.catchmouse();    error ��duotaidemo.java:52: ����: �Ҳ�������
											  			//	                a.catchmouse();
															//	                 ^
															// ����:   ���� catchmouse()
															// λ��: ����ΪAnimal�ı��� a
		
		Cat c = (Cat)a;
		c.catchmouse();
	}
}