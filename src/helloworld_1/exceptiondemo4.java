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