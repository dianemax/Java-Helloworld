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
			System.err.println("�����쳣��!");
		} 
		finally 
		{
			System.out.println("ִ��finally!");
		}
		System.out.println("ִ��finally��������!");
	}
}
