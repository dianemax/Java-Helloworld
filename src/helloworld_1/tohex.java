/**
2017-10-7 14:35:52
��������һ��������ӡ����Ӧ��16������
˼·����Ҫ���ú���������Ӧ����ȷ��������
			��ȷһ��������������Ľ����ʲô��
				û�н���������������������У����δ�ӡ --- void
			��ȷ��������������Ҫδ֪��������������
				��Ҫ�����ĸ�����Ϊʮ�����ƾ��ڱ�������������� --- int
���⣺�ó���������
			�ó���������
			�ó���������
*/

class Tohex
{
	public static void main(String args[])
	{
		int num;
		toHex(60);
		
	}
	
	public static void toHex(int num)
	{
		if(num == 0)
		{
			System.out.println("0");
			return;
		}

		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		char[] arr = new char[8];			//����һ����ʱ���� --- ����
		int pos = arr.length;			//���ڴ�ȡ���������ֵ�ָ��
					
		while(num != 0)
		{
			int temp = num & 15;
			arr[--pos] = chs[temp];
			//arr[pos--] = chs[temp];		//�±�Խ��
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8  
			num = num >>> 4;
			
		}
		for(int x=pos; x < arr.length; x++)
		{
			System.out.print(arr[x] + " ");
		}
		System.out.println();
	}
	
}