/**
time��2017-10-25 10:28:14
author��@su

����this�����֪ʶ
�ĵã�1.���·ֱ����˼����࣬���� �ղ�����Person��������������	Person(String name)��	Person(int age)	�Լ� Person(String name,int age)
				������	Person(String name,int age) �г�ʼ������Ҫ������name ������age �����г�ʼ����������ظ�
				
			��.this�������ڹ��캯���У������������캯������ֻ�ܶ����ڹ��캯���ĵ�һ�У���Ϊ��ʼ��������Ҫ����ִ��
			
			2.	Person(String name,int age)
					{
						this(name);   	// �˴�������Ӧ�� this.Person�ģ�����Person��û�б���ʼ�������Բ��ܵ��ã����this(name);	����	Person(String name)
						this.age = age;
					}
					
			3.	Person(String name)
					{
						this.name = name;
					}
					Person(int age)
					{
						this.age = age;
					}
					Person(String name,int age)
					{
						this(name);
						this(age);       //error ��Ϊthisֻ�ܶ����ڹ��캯���ĵ�һ�У����Դ˴���������this�ᷢ������
					}
					
			4.���³�������н��Ϊ��
					angle:22

					baby cry
					baby:0
					
				��Ϊ��Person p1 = new Person("��ͬѧ",22);��������ʱ��Ҫ����	Person(String name)���ú�����this.name = "angle";
				angle����ͬѧ���ǣ������������angle��
*/

class Person
{
	private String name;
	private int age;
	
	Person()
	{
		name = "baby";
		age = 0;
		System.out.println("baby cry");
	}
	
	Person(String name)
	{
		this.name = "angle";
	}
	
//	Person(int age)
//	{
//		this.age = age;
//	}
	
	Person(String name,int age)
	{
		this(name);
		this.age = age;
	}
	void speak()
	{
		System.out.println(this.name + ":" + this.age);
	}
		
}

class ThisLearn
{
	public static void main(String args[])
	{
		Person p1 = new Person("��ͬѧ",22);
		p1.speak();
		System.out.println();
		Person p2 = new Person();
		p2.speak();
	}	
}