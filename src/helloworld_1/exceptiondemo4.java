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
			System.out.println("String�� " + e.toString());
			e.printStackTrace();
			System.out.println("Խ���ˣ�");
		}
		catch(FuShuException e)
		{
			System.out.println("message" + e.getMessage());
			System.out.println("String�� " + e.toString());
			e.printStackTrace();
			System.out.println("��������");
			
			return;   //�˴�ִ��return�˳����򣬵�finally����ִ��
		}
		catch(NullPointException e)
		{
			System.out.println("message" + e.getMessage());
			System.out.println("String�� " + e.toString());
			e.printStackTrace();
			System.out.println("�ǿյģ�");
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
			throw new OutOfBoundsException("Խ���磡");
		}
		else if(index < 0)
		{
			throw new FuShuException("��������");
		}
		else if(arr == null)
		{
			throw new NullPointException("�գ������飡");
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
		System.out.println("Խ������");
	}
}

class FuShuException extends Exception
{
	FuShuException(){}
	FuShuException(String message)
	{
		super(message);
		System.out.println(message);
		System.out.println("�Ǳ�Ϊ��Ӵ~");
	}
}

class NullPointException extends Exception
{
	NullPointException(){}
	NullPointException(String message)
	{
		super(message);
		System.out.println(message);
		System.out.println("������Ŷ - -��");
	}
}