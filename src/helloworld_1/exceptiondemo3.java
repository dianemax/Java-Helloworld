/**
time：2017-11-18 13:06:10
author：@su

need：异常Exception --- 多catch情况以及finally代码块
step：抛出几个处理几个
			finally代码块是一定会执行的代码
thought：1. public int method(int[] arr,int index) throws OutOfBoundsException,FuShuException,NullPointException
				 		有几个抛出去几个，中间用逗号隔开
				2. 关于catch中exception的顺序
					 1> 先catch  Exception 随后在catch自定义的异常：error  会先执行系统的Exception就停止，不会运行后面的
					 		try{}
					 		catch（Exception e）{}
					 		catch（NullPointException e）{}
					 		catch（FuShuException e）{}
					 2> 先执行自定义异常在执行系统异常父类Exception：可以正常运行
					 		try{}
					 		catch（NullPointException e）{}
					 		catch（FuShuException e）{}
					 		catch（Exception e）{}
					 原因：try检测错误，检测到错误后抛给catch，由上向下看看是否属于catch（）括号中的对象，但是Exception包含了
					 			 所有的异常，下面两个自定义异常就不会运行，因此会报错
					 解决：catch（Exception e）{} //多catch父类的catch放在最下面，否则会编译失败
				3. 异常的处理原则：
					 1> 函数内容如果抛出需要检测异常，那么函数上必须声明，否则必须在函数内用try catch捕捉，否则编译失败
					 2> 如果调用了声明异常的函数，要么try catch 要么throws，否则编译失败
					 3> 什么时候用catch 什么时候用throws？
					 			功能内容可以解决，用catch；
					 			解决不了，用throws告诉调用者，由调用者解决。
					 4> 一个功能如果抛出了多个异常，那么调用时，必须有对应多个catch针对性处理；
					 		内部需要几个检测的异常，就抛出几个异常，就catch几个。
					 		
				4. finally
					 使用时间：通常用于关闭（释放）资源
					 功能：连接数据库
					 			 查询 Exception
					 			 关闭联通 --- 一定要执行关闭动作
				
				5. try catch finally 代码块组合特点
					 1> try catch finally 
					 2> try catch（多个）  当没有必要资源需要释放时，可以不用定义finally
					 3> try finally        异常无法直接catch处理，但是资源需要关闭
			
结果: 负！数！      
			角标为负哟~   
			message负！数！
			String： FuShuException: 负！数！ 
			FuShuException: 负！数！          
			        at Demo.method(exceptiondemo3.java:63)
			        at ExceptionDemo3.main(exceptiondemo3.java:19)
			负数啊！      
			finally       
			
			over为什么没有输出？？？ ----   因为catch里面加了return退出了程序
			
结果分析：

			1.不会执行finally后面的内容
				finally
				{
					里面的句子    一定会执行
				}
				后面的要看前面是不是发生异常
				如果try{}里面的 正常执行完后 finally 做结束处理 那么finally{} 后面还有 那当然会执行
				如果 try{} 发生异常 到catch{}捕捉 或直抛出 然后要执行finally{} 里面的，但是后面的就不会执行了。
				
			2.会执行finally后面的内容
			
				code：
						class test 
						{

							public static void main(String[] args) 
							{
								new FinallyTestDemo().test(0);
								System.out.println("------------------");
								new FinallyTestDemo().test(1);
							}

						}

						class FinallyTestDemo 
						{
							public void test(int a) 
							{
								try 
								{
									int i = 0 / a;
								} 
								catch (Exception ex) 
								{
									System.err.println("程序异常了!");
								} 
								finally 
								{
									System.out.println("执行finally!");
								}
								System.out.println("执行finally后面的语句!");
							}
						}

				code结果：
						程序异常了!
						执行finally!
						执行finally后面的语句!
						------------------
						执行finally!
						执行finally后面的语句!

*/

class ExceptionDemo3
{
	public static void main(String args[]) 
	{
		int[] arr = new int[5];
		Demo d = new Demo();
		try
		{
			int num = d.method(arr,-5);
			System.out.println("num = " + num);
		}
		
		catch(OutOfBoundsException e)
		{
			System.out.println("message" + e.getMessage());
			System.out.println("String： " + e.toString());
			e.printStackTrace();
			System.out.println("越界了！");
		}
		catch(FuShuException e)
		{
			System.out.println("message" + e.getMessage());
			System.out.println("String： " + e.toString());
			e.printStackTrace();
			System.out.println("负数啊！");
			
			return;   //此处执行return退出程序，但finally还能执行
		}
		catch(NullPointException e)
		{
			System.out.println("message" + e.getMessage());
			System.out.println("String： " + e.toString());
			e.printStackTrace();
			System.out.println("是空的！");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		
		finally
		{
			System.out.println("finally");
		}
		
		System.out.println("over");
	}
}

class Demo
{
	public int method(int[] arr,int index) throws OutOfBoundsException,FuShuException,NullPointException
	{
		if(index > arr.length)
		{
			throw new OutOfBoundsException("越！界！");
		}
		else if(index < 0)
		{
			throw new FuShuException("负！数！");
		}
		else if(arr == null)
		{
			throw new NullPointException("空！数！组！");
		}
		else
		{
			System.out.println("num = " + arr[index]);
			return arr[index];
		}
	}
}

class OutOfBoundsException extends Exception
{
	OutOfBoundsException(){}
	OutOfBoundsException(String message)
	{
		super(message);
		System.out.println(message);
		System.out.println("越界啦！");
	}
}

class FuShuException extends Exception
{
	FuShuException(){}
	FuShuException(String message)
	{
		super(message);
		System.out.println(message);
		System.out.println("角标为负哟~");
	}
}

class NullPointException extends Exception
{
	NullPointException(){}
	NullPointException(String message)
	{
		super(message);
		System.out.println(message);
		System.out.println("空数组哦 - -！");
	}
}