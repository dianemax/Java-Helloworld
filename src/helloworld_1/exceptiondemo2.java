/**
time：2017-11-15 21:48:51
author：@su

需求：Exception --- 异常的分类与捕捉
心得：一、异常的分类
					1. 分类：1> 编译时被检测异常：只要Exception和其子类都是，除了特殊子类RuntimeException体系
													这种情况一旦出现，希望在编译时进行检测，让这种问题有对应的处理方式，这种问题可以针对想处理。
									 2> 编译时不检测异常（运行时异常） --- 就是RuntimeException和其子类
									 				这种问题的发生，无法让功能继续，运算无法运行，更多的是因为调用的原因导致的或者引发了内部状态的改变导致的，
									 		  那么这种问题一般不处理，直接编译通过，在运行时，让调用者调用时的程序强制停止，让调用者对代码进行修正。
					2. 自定义异常：要么继承Exception 要么继承RuntimeException
					3. throw和throws的区别：
						 1> throw  使用在函数内；
						 		throws 使用在函数上。
						 2> throw  抛出的是异常对象；
						 	  throws 抛出的是异常类，可以抛出多个，用逗号隔开。
						 	   
			二、异常的捕捉
					1. 格式： try{}  											//需要被检测异常的代码
										catch（异常类 变量）{}      //处理异常代码
										finally{}										//一定会被执行的代码
										
				  2. 什么时候try什么时候throw？
				  	 当这个问题你可以解决的时候就try，解决不了就throw。
				  	 
				  3. 如何编写java中的自定义异常类？当getmessage输出的信息为null是怎么办？ --- 注意super
				  	 编写自定义异常类实际上是继承一个API标准异常类，用新定义的异常处理信息覆盖原有信息的过程。常用的编写自定义异常类的模式如下：
								eg：
								public class CustomException extends Exception  //或者继承任何标准异常类
								{    
								    public CustomException()  {}                //用来创建无参数对象
								    public CustomException(String message)      //用来创建指定参数对象
								    {        
								        super(message);                         //调用超类构造器
								    }
								}

*/

class ExceptionDemo2
{
	public static void main(String args[])
	{
		int[] arr = new int[3];
		Demo d = new Demo();
		
		try
		{
			int num = d.method(arr,-30);
			System.out.println("num=" + num);
		}
		
		catch(FuShuIndexException e)
		{
			System.out.println("message： " + e.getMessage()); //getmessage（）返回throw中的信息
			System.out.println("String： " + e.toString());
			e.printStackTrace();															 //返回值为void，所以可以直接由e调用
																												 //追踪输出到其指定的输出流，jvm默认的异常处理机制就是调用异常对象的这个方法
			System.out.println("负数角标异常");
		}
		
		System.out.println("over");
		
	}
}

class Demo
{
	public int method(int[] arr,int index) throws FuShuIndexException   //异常声明
	//此处删掉throws会报错。错误: 在相应的 try 语句主体中不能抛出异常错误FuShuIndexException
	{
		if(index < 0)
		{
			throw new FuShuIndexException("角标变成负数啦！");
		}
		else
			return arr[index];
	}
}

class FuShuIndexException extends Exception //自定义类必须继承exception
{
	FuShuIndexException()
	{}
	FuShuIndexException(String msg)
	{
		super(msg);       //必须加super
		System.out.println(msg);
	}
}