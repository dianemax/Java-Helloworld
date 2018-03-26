/**
time：2017-11-14 16:50:09
author：@su

需求：object类 --- hashcode方法
思路：hashcode：返回对象的哈希码值 --- 十六进制
心得：1.写法规范：
				1> hashCode：其中h小写，code的C要大写；
				2> p1.hashCode();  而不是hashCode（p1）；因为：无法将类 Object中的方法 hashCode应用到给定类型;
				3> Integer.toHexString(p1.hashCode());
			2. hash常规协定
				1> 在Java应用程序执行期间，在对同一对象多次调用hashcode方法时，必须一致的返回整数，前提是讲对象
					 进行 equals 比较所用信息没有被修改；
				2> 如果两个对象是相等的，那么这两个对象中的每个对象调用hashcode方法都必须生成相同的整数结果；
				3> 两个对象不相等，那么两个中任意对象调用hashcode方法不一定能生成不同的整数结果（两个对象不同，哈希码值可能相同）

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
		
//		System.out.println(Integer.toHexString(p1.hashCode(p2)));  //error:objectclasshashcodedemo.java:30: 错误: 无法将类 Object中的方法 hashCode应用到给定类型;
//																																	                System.out.println(Integer.toHexString(p1.hashCode(p2)));
//																																	                                                         ^
//																																	   需要: 没有参数
//																																	   找到: Person
//																																	   原因: 实际参数列表和形式参数列表长度不同
	}
}