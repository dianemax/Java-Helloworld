/**
time��2017-10-30 14:44:50
author��@su

����interface --- �ӿ�
˼·����һ���������еķ������ǳ����ʱ�����¾Ϳ��Խ��ó���������һ����ʽ����ͱ�ʾ�����ǽӿ� --- interface
�ĵã�1.����ӿ�ʹ�õĹؼ�����interface
				eg.interface Demo
					 {
					 		abstract void show������
					 		abstract void show������
					 }
			2.���ڽӿ��г����ĳ�Ա,������Щ��Ա���й̶������η�
				1> ȫ�ֱ�����public static find
				2> ���󷽷���public abstract
				�ɴ˵ó����ۣ��ӿ��еĳ�Ա���ǹ�����Ȩ�ޡ�
				eg.public static final int num = 4�� //�����д�κ�һ����ϵͳ���Զ���ȫ��������дΪ NUM = 4������ʾ������Ҫ��д��
				
			3.������֮���Ǽ̳й�ϵ������ӿ�֮����ʵ�ֹ�ϵ --- implements
				eg.class DemoImpl implements Demo     // ��DemoImplʵ��Demo�ӿ�
				
		��4.�ӿڲ����Ա�ʵ������
				ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ��е����еĳ��󷽷��󣬸�����ſ��Ա�ʵ������
				
*/

interface Demo
{
	public static final int NUM = 4;
	
	abstract void show1();
	abstract void show2();
}

class DemoImpl implements Demo  //ʵ�ֽӿڵ����࣬�����˽ӿ������еĳ��󷽷������ʵ����
{
	public void show1(){}
	public void show2(){}  //�����д�����䣬�ᱨ��DemoImpl���ǳ����, ����δ����Demo�еĳ��󷽷�show2()
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		DemoImpl d = new DemoImpl();
		System.out.println(Demo.NUM);   //�ӿ����Ƶ����Լ��ĳ�Ա
		//System.out.println(d.NUM);
	}
}