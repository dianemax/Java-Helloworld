/**
time��2017-11-14 16:50:09
author��@su

����object�� --- hashcode����
˼·��hashcode�����ض���Ĺ�ϣ��ֵ --- ʮ������
�ĵã�1.д���淶��
				1> hashCode������hСд��code��CҪ��д��
				2> p1.hashCode();  ������hashCode��p1������Ϊ���޷����� Object�еķ��� hashCodeӦ�õ���������;
				3> Integer.toHexString(p1.hashCode());
			2. hash����Э��
				1> ��JavaӦ�ó���ִ���ڼ䣬�ڶ�ͬһ�����ε���hashcode����ʱ������һ�µķ���������ǰ���ǽ�����
					 ���� equals �Ƚ�������Ϣû�б��޸ģ�
				2> ���������������ȵģ���ô�����������е�ÿ���������hashcode����������������ͬ�����������
				3> ����������ȣ���ô����������������hashcode������һ�������ɲ�ͬ�������������������ͬ����ϣ��ֵ������ͬ��

*/

class Person
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	
}

class ObjectClassHashCodeDemo
{
	public static void main(String args[])
	{
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		
		System.out.println(p1);			//Person@15db9742
		System.out.println(p1.hashCode());
		System.out.println(Integer.toHexString(p1.hashCode()));   //Person@15db9742
//																															366712642
//																															15db9742
		
//		System.out.println(Integer.toHexString(p1.hashCode(p2)));  //error:objectclasshashcodedemo.java:30: ����: �޷����� Object�еķ��� hashCodeӦ�õ���������;
//																																	                System.out.println(Integer.toHexString(p1.hashCode(p2)));
//																																	                                                         ^
//																																	   ��Ҫ: û�в���
//																																	   �ҵ�: Person
//																																	   ԭ��: ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ
	}
}