/**
2017-10-6 14:59:26
���󣺴�ӡ �����е����ֵ
˼·����Ҫ���ú�����������ȷ��
			��ȷһ����������Ľ����ʲô��
				����������е��������ֵ --- int
			��ȷ�����������ʵ�ֹ������Ƿ���δ֪�����������㣿
				�У���Ҫһ��  ---  �����飡�����ĸ������е����ֵ��
			
*/

class ArrayMax
{
	public static void main(String args[])
	{
		int[] arr = {34,16,35,74,85};
		int max = max_array(arr);
		System.out.println("max = " + max );
	}
	
	public static int max_array(int[] a)
	{
		int max;
		max = a[1];
		
		for(int i = 0;i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}		
		}
		return max;
	}

}