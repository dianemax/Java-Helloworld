/**
time��2017-11-15 21:48:51
author��@su

����Exception --- �쳣�ķ����벶׽
�ĵã�һ���쳣�ķ���
					1. ���ࣺ1> ����ʱ������쳣��ֻҪException�������඼�ǣ�������������RuntimeException��ϵ
													�������һ�����֣�ϣ���ڱ���ʱ���м�⣬�����������ж�Ӧ�Ĵ���ʽ�����������������봦��
									 2> ����ʱ������쳣������ʱ�쳣�� --- ����RuntimeException��������
									 				��������ķ������޷��ù��ܼ����������޷����У����������Ϊ���õ�ԭ���µĻ����������ڲ�״̬�ĸı䵼�µģ�
									 		  ��ô��������һ�㲻����ֱ�ӱ���ͨ����������ʱ���õ����ߵ���ʱ�ĳ���ǿ��ֹͣ���õ����߶Դ������������
					2. �Զ����쳣��Ҫô�̳�Exception Ҫô�̳�RuntimeException
					3. throw��throws������
						 1> throw  ʹ���ں����ڣ�
						 		throws ʹ���ں����ϡ�
						 2> throw  �׳������쳣����
						 	  throws �׳������쳣�࣬�����׳�������ö��Ÿ�����
						 	   
			�����쳣�Ĳ�׽
					1. ��ʽ�� try{}  											//��Ҫ������쳣�Ĵ���
										catch���쳣�� ������{}      //�����쳣����
										finally{}										//һ���ᱻִ�еĴ���
										
				  2. ʲôʱ��tryʲôʱ��throw��
				  	 �������������Խ����ʱ���try��������˾�throw��
				  	 
				  3. ��α�дjava�е��Զ����쳣�ࣿ��getmessage�������ϢΪnull����ô�죿 --- ע��super
				  	 ��д�Զ����쳣��ʵ�����Ǽ̳�һ��API��׼�쳣�࣬���¶�����쳣������Ϣ����ԭ����Ϣ�Ĺ��̡����õı�д�Զ����쳣���ģʽ���£�
								eg��
								public class CustomException extends Exception  //���߼̳��κα�׼�쳣��
								{    
								    public CustomException()  {}                //���������޲�������
								    public CustomException(String message)      //��������ָ����������
								    {        
								        super(message);                         //���ó��๹����
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
			System.out.println("message�� " + e.getMessage()); //getmessage��������throw�е���Ϣ
			System.out.println("String�� " + e.toString());
			e.printStackTrace();															 //����ֵΪvoid�����Կ���ֱ����e����
																												 //׷���������ָ�����������jvmĬ�ϵ��쳣������ƾ��ǵ����쳣������������
			System.out.println("�����Ǳ��쳣");
		}
		
		System.out.println("over");
		
	}
}

class Demo
{
	public int method(int[] arr,int index) throws FuShuIndexException   //�쳣����
	//�˴�ɾ��throws�ᱨ������: ����Ӧ�� try ��������в����׳��쳣����FuShuIndexException
	{
		if(index < 0)
		{
			throw new FuShuIndexException("�Ǳ��ɸ�������");
		}
		else
			return arr[index];
	}
}

class FuShuIndexException extends Exception //�Զ��������̳�exception
{
	FuShuIndexException()
	{}
	FuShuIndexException(String msg)
	{
		super(msg);       //�����super
		System.out.println(msg);
	}
}