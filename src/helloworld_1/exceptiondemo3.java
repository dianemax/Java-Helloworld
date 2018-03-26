/**
time��2017-11-18 13:06:10
author��@su

need���쳣Exception --- ��catch����Լ�finally�����
step���׳�����������
			finally�������һ����ִ�еĴ���
thought��1. public int method(int[] arr,int index) throws OutOfBoundsException,FuShuException,NullPointException
				 		�м����׳�ȥ�������м��ö��Ÿ���
				2. ����catch��exception��˳��
					 1> ��catch  Exception �����catch�Զ�����쳣��error  ����ִ��ϵͳ��Exception��ֹͣ���������к����
					 		try{}
					 		catch��Exception e��{}
					 		catch��NullPointException e��{}
					 		catch��FuShuException e��{}
					 2> ��ִ���Զ����쳣��ִ��ϵͳ�쳣����Exception��������������
					 		try{}
					 		catch��NullPointException e��{}
					 		catch��FuShuException e��{}
					 		catch��Exception e��{}
					 ԭ��try�����󣬼�⵽������׸�catch���������¿����Ƿ�����catch���������еĶ��󣬵���Exception������
					 			 ���е��쳣�����������Զ����쳣�Ͳ������У���˻ᱨ��
					 �����catch��Exception e��{} //��catch�����catch���������棬��������ʧ��
				3. �쳣�Ĵ���ԭ��
					 1> ������������׳���Ҫ����쳣����ô�����ϱ�����������������ں�������try catch��׽���������ʧ��
					 2> ��������������쳣�ĺ�����Ҫôtry catch Ҫôthrows���������ʧ��
					 3> ʲôʱ����catch ʲôʱ����throws��
					 			�������ݿ��Խ������catch��
					 			������ˣ���throws���ߵ����ߣ��ɵ����߽����
					 4> һ����������׳��˶���쳣����ô����ʱ�������ж�Ӧ���catch����Դ���
					 		�ڲ���Ҫ���������쳣�����׳������쳣����catch������
					 		
				4. finally
					 ʹ��ʱ�䣺ͨ�����ڹرգ��ͷţ���Դ
					 ���ܣ��������ݿ�
					 			 ��ѯ Exception
					 			 �ر���ͨ --- һ��Ҫִ�йرն���
				
				5. try catch finally ���������ص�
					 1> try catch finally 
					 2> try catch�������  ��û�б�Ҫ��Դ��Ҫ�ͷ�ʱ�����Բ��ö���finally
					 3> try finally        �쳣�޷�ֱ��catch����������Դ��Ҫ�ر�
			
���: ��������      
			�Ǳ�Ϊ��Ӵ~   
			message��������
			String�� FuShuException: �������� 
			FuShuException: ��������          
			        at Demo.method(exceptiondemo3.java:63)
			        at ExceptionDemo3.main(exceptiondemo3.java:19)
			��������      
			finally       
			
			overΪʲôû����������� ----   ��Ϊcatch�������return�˳��˳���
			
���������

			1.����ִ��finally���������
				finally
				{
					����ľ���    һ����ִ��
				}
				�����Ҫ��ǰ���ǲ��Ƿ����쳣
				���try{}����� ����ִ����� finally ���������� ��ôfinally{} ���滹�� �ǵ�Ȼ��ִ��
				��� try{} �����쳣 ��catch{}��׽ ��ֱ�׳� Ȼ��Ҫִ��finally{} ����ģ����Ǻ���ľͲ���ִ���ˡ�
				
			2.��ִ��finally���������
			
				code��
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

				code�����
						�����쳣��!
						ִ��finally!
						ִ��finally��������!
						------------------
						ִ��finally!
						ִ��finally��������!

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