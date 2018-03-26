/**
time��2017-11-14 16:13:51
author��@su

����object�� --- equal�෽���ĸ���
˼·��eg. �Ƚ�Person�����䣬�Ƿ���ͬ����
�ĵã�

*/

class Person extends Object
{
	private int age;
	
	Person(int age)
	{
		this.age = age;
	}

/*------code1������ת�� error��. �Ҳ�������------	
	public boolean equals(Object obj) 	//Object obj = p2;
																			//p2 ������ Person���ͣ���������ת�ͳ�Ϊ��Objiet���ͣ���ʧ�������й��ܣ��ᱨ��
																			//objectclassdemo2.java:23: ����: �Ҳ�������
                                      //                          return this.age = obj.age;
	{
		return this.age == obj.age;
	}
*/

/*------code2��ǿ��ת���޸�����ת�ʹ����Ĵ���------
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;   //ǿ������ת��
															//ע�⣺�ڹ��캯�����߹�����������Ĳ���Ϊ���ʱ��Ҫע���Ƿ�����ǿ��ת����ǿ��ת���ᱨ��
		return this.age == p.age;
	}
*/

/*------code3: ����if��ǿ����Ľ�׳��------*/
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
		{
			return false;
		}
		
		else
		{
			Person p = (Person)obj;
			return this.age == p.age;
		}	
	}

}

class Demo
{
	
}

class ObjectClassEqualDemo2
{
	public static void main(String args[])
	{
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		
		System.out.println(p1.equals(p2));
	}
}