/**
2017-10-6 15:58:02
���󣺶�һ������������� --- ѡ������
˼·����Ҫ���ú�����������ȷ��
			��ȷһ�����ú����Ľ����ʲô��
				������ź�������� --- ���践�� --- void
			��ȷ�������ú������費��Ҫδ֪�����������㣿
				��Ҫ����Ҫ��ȷ���Ǹ������������� --- int[]
*/

class SelectSort
{
	public static void main(String args[])
	{
		int[] arr = {34,19,3,109,65,28};
		printarray(arr);
		selectsort(arr);
		printarray(arr);
		
	}
	
	public static void selectsort(int [] arr)
	{
		for(int x = 0; x < arr.length-1; x++)
		{
			for(int y = x + 1; y < arr.length; y++)
			{
				if(arr[x] > arr[y])
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}	
			}	
		}	 
	}
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length-1)
			System.out.print(arr[i] + ", ");
			else
			System.out.print(arr[i] + "]");
		}
		System.out.println();
	}
	
}