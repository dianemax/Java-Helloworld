/**
time��2017-10-29 22:03:58
author��@su

����abstract���֪ʶ
�ĵã�1.���������ڵ���ҲҪ����abstract��
			2.��������ص㣺
				1> ����ֻ������û��ʵ��ʱ���÷������ǳ��󷽷�����Ҫ��abstract���γ��󷽷����붨���ڳ������У�������뱻abstract���Σ�
				2> �����಻���Ա�ʵ������Ϊʲô��
					 ��Ϊ���ó��󷽷�û�����塣
				3> ����������������า�������еĳ��󷽷�ʱ��������ſ���ʵ�����������������Ҳ�ǳ�����
			3.�������⣺
				1> ���������й��캯����
					 �У����ڸ����������г�ʼ����
				2> �������п��Բ�������󷽷���
					 ���Եģ���������������٣�Ŀ���ǲ��ø��ഴ������ͨ����������з����嵫��û������
					 eg.abstract class Demo()
					 		{
					 			void show(){}
					 			void show(){}
					 		}
				3> ������ؼ��ֲ����Ժ���Щ�ؼ��ֹ��棿
					 private ���� // �Ƿ������η���� private �� abstract
					 static  ���� // �Ƿ������η���� private �� abstract
					 final   ����
				4> �������һ�������ͬ��
					 ��ͬ�㣺�������һ���඼��������������ģ������ڲ������˳�Ա��
					 ��ͬ�㣻1> һ�������㹻����Ϣ��������
					 						�����������������Ϣ���ܲ���
					 				 2> һ�����в��ܶ�����󷽷���ֻ�ܶ���ǳ����෽��
					 				 		�������п��Զ�����󷽷�
					 				 3> һ������Ա�ʵ�����������಻����
				5> ������һ���Ǹ�����
					 �ǵģ���Ϊ��Ҫ���า���䷽����ſ��Զ��������ʵ������
					 
*/

/**
��������ϰ��
��Աʾ����Ҫ�󣺹�˾���г���Ա�����������ţ�нˮ����������
								��Ŀ������������������ţ�нˮ���������ݻ��н���
								�����ϸ�������Ϣ���н�ģ
					����������������У����ҳ���ƵĶ��󣬿���ͨ������������
								eg.1> ����Ա�����ԣ����� ���� нˮ
															��Ϊ������
									 2> ����  ���ԣ����� ���� нˮ ����
									 						��Ϊ������
�ܽ᣺1.��Ա���������˽��Ҳ�ܷ��㣬�ڸ�����ֱ�������������ӡ�Ϳ��ԡ�
			2.���������ö�һ�㡰�ӿڡ�
			3.����ķ����Ƕ����ģ�
									 						
*/

//������Ա
abstract class Employee //��Ϊ�����������ǳ����࣬������Ҳ�ǳ����
{
	private String name;
	private String ID;
	private double pay;
	
	Employee(String name,String ID,double pay)
	{
		this.name = name;
		this.ID = ID;
		this.pay = pay;
	}
	
	public abstract void work();
	
	public void show()
	{
		System.out.println("name��" + name +"  ID:" + ID + "  pay:" + pay );
	}
	
	/*
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	
	public String getID()
	{
		return ID;
	}
	public void setname(String ID)
	{
		this.ID = ID;
	}
	
	public double getpay()
	{
		return pay;
	}
	public void setpay()
	{
		this.pay = pay;
	}
	*/
	
}

//��������Ա
class Programmer extends Employee
{
	Programmer(String name,String ID,double pay)
	{
		super(name,ID,pay);
	}
	public void work()
	{
		System.out.println("code");
		//System.out.println("��" + name + " " + ID + " " + pay);
	}
	
}

//��������
class Manager extends Employee
{
	private double bonus;
	
	Manager(String name,String ID,double pay,double bonus)
	{
		super(name,ID,pay);
		this.bonus = bonus;
	}
	/*
	public double getbonus()
	{
		return bonus;
	}
	public void setbonus(double bonus)
	{
		this.bonus = bonus;
	}
	*/
	
	public void work()
	{
		System.out.println("manage");
		//System.out.println("��" + name + " " + ID + " " + pay +" " + bonus );
		super.show();
		System.out.println("bonus��" + bonus );
	}
	/*
	public void show()
	{
		super.show();
		System.out.println("bonus��" + bonus );
	}
	*/
}


class AbstractDemo
{
	public static void main(String args[])
	{
	Manager m = new Manager("sutongxue","y17041211959",8000,4000);
	m.work();
	//m.show();
	}
}