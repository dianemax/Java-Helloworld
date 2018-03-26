/**
time：2017-11-14 17:29:11
author：@su

需求：异常 --- exception
思路：以前正常流程是代码和问题处理相结合，现在将正常流程代码和问题相分离，提高阅读性
			eg. 以前：																						|	现在：
					public static void main(String args[]）						| public static void main(String args[]）
					{																									| {
						if（time < 0）																	|		if(time < 0)
						{																								|   {
							处理办法；																		|			抛出 new FuTime();
							处理办法;																			|   }
						}																								|   if(time > 10000)
						if（time > 10000）															|   {
						{																								|     抛出 new BigTime（）；
							处理办法；																		|   }
							处理办法；																		| }
						}																								|
					}																									|
					
			注：FuTime（）；就代码的时间为这种情况，这个对象中会包含这个问题的名称
			
心得：1. 异常：是在运行时期发生的不正常情况
							 在Java中用类的形式对不正常情况进行了描述和封装对象
			2. 其实异常就是Java通过面向对象的思想将问题封装成了对象
			3. 问题很多，意味着描述的类也很多，将其共性进行向上抽取，形成了异常体系
			4. 最终问题：
					   不正常情况就分成了两大类 1> 一般不不可处理的  Error
						 													2> 可以处理的 Exception
					A. Throwable: 无论是error，还是异常问题，问题发生就应该可以抛出，让调用着知道并处理
						 						//该体系的特点就在于Throwable及其所有的子类都具有可抛性
							   可抛性到底指什么呢？怎么来体现可抛性呢？
								 其实是通过两个关键字来体现的 --- throw throws，凡是可以被这两个关键字所操作的类和对象都是具有可抛性的
					B. Error：
								 特点：是由jvm抛出的严重性的问题，这种问题发生一般不针对性处理
结果：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 数组角标越界，越界角标是：3
															        at Demo.method(exceptiondemo.java:47)
															        at ExceptionDemo.main(exceptiondemo.java:59)
							 

*/

class Demo
{
	public int method (int[] arr,int index) //throws FuShuIndexException
	{
		if(index >= arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("数组角标越界，越界角标是：" + index);
		}
		return arr[index];
	}
}

class ExceptionDemo
{
	public static void main(String args[])
	{
		int[] arr = new int[3];
		Demo d = new Demo();
		int num = d.method(arr,3);
	}
}