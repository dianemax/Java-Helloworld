/**
time：2017-11-14 16:13:51
author：@su

需求：object类 --- equal类方法的覆盖
思路：eg. 比较Person的年龄，是否是同龄人
心得：

*/

class Person extends Object
{
	private int age;
	
	Person(int age)
	{
		this.age = age;
	}

/*------code1：向上转型 error：. 找不到符号------	
	public boolean equals(Object obj) 	//Object obj = p2;
																			//p2 本来是 Person类型，现在向上转型成为了Objiet类型，丢失子类特有功能，会报错
																			//objectclassdemo2.java:23: 错误: 找不到符号
                                      //                          return this.age = obj.age;
	{
		return this.age == obj.age;
	}
*/

/*------code2：强制转换修复向上转型带来的错误------
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;   //强制类型转换
															//注意：在构造函数或者构造类中输入的参数为类的时候，要注意是否发生了强制转换，强制转换会报错
		return this.age == p.age;
	}
*/

/*------code3: 加入if增强程序的健壮性------*/
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