/**
time��2017-10-26 19:50:41
author��@su

����static���֪ʶ
�ĵã�1. 	new Person().name = "��ͬѧ";
					new Person().shou();
				������Ϊ��null��China
				ԭ�򣺴������������ϣ���ʼ�����Σ���һ���������ͬѧ���ڶ��θ��ǣ��������null������country�Ǿ�̬���������һֱ���China
			2.	Person p = new Person();
					p.name = "��ͬѧ";
					p.shou();
				������Ϊ����ͬѧ��China
				ԭ�����Ϸ�ʽ����������Զ�ε���
			3.	Person p = new Person();
					p.name = "��ͬѧ";
					p.shou();
					System.out.println();
					System.out.println(p.country);
					System.out.println();
					System.out.println(Person.country);
				������Ϊ����ͬѧ��China

										China

										China
				ԭ��static���εĳ�Ա����һ�ֵ��÷�ʽ --- ֱ�ӱ��������� eg.	System.out.println(Person.country);
�ܽ᣺1.static���ص㣺
				1> static��һ�����η����������γ�Ա��
				2> ��static���εĳ�Ա�����ж�����
				3> static�����ڶ�����ڣ���Ϊstatic�ĳ�Ա������ļ��ض����ڣ�
				4> static���εĳ�Ա����һ�ֵ��÷�ʽ --- ֱ�ӱ���������
					 ��ʽ������.��̬��Ա
				5> static���ε��ǹ������ݣ������д洢������������
			2.��Ա�����;�̬����������
				1> �����������������ڲ�ͬ��
					 ��Ա�������Ŷ���Ĵ��������ڣ����Ŷ���Ļ��ն��ͷţ�
					 ��̬����������ļ��ض����ڣ����������ʧ����ʧ�����������ʱ��ʧ����
				2> ���÷�ʽ��ͬ��
					 ��Ա������������ã�
					 ��̬�������Ա�������ã������Ա�����ã�
				3> ������ͬ��
					 ��Ա����Ҳ����Ϊʵ��������
					 ��̬��������Ϊ�������
				4> ���ݵĴ洢λ�ò�ͬ��
					 ��Ա�������ݴ洢�ڶ��ڴ��еĶ����У�����Ҳ�ж�����������ݣ�
					 ��̬���������ݴ洢�ڷ��������������еľ�̬��������Ҳ�ж���Ĺ������ݡ�
			3.��̬��ʹ��ע�����
				1> ��̬����ֻ�ܷ��ʾ�̬��Ա���Ǿ�̬�ȿ��Է��ʾ�̬�ֿ��Է��ʷǾ�̬�� --- �޷��Ӿ�̬���¶��������÷Ǿ�̬�������о�������֣���
				2> ��̬�����в�����ʹ��this ���� super�ؼ��� --- eg. System.out.println(this.name + "��" + country); ����û�д����������Բ�����this��
				3> �������Ǿ�̬�ģ�
				4> ��̬ʡ�Ե����������Ǿ�̬ʡ�Ե���this�� --- System.out.println(Person.country + this.name);

*/

class Person
{
	String name; //��Ա������ʵ������
	static String country = "China"; //��̬�����������
	public void shou()
	{
		System.out.println(name + "��" + country);
	}	
}

class StaticDemo
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.name = "��ͬѧ";
		p.shou();
		System.out.println();
		System.out.println(p.country);
		System.out.println();
		System.out.println(Person.country);
	}
	
}