/**
2017-10-6 21:20:31
���󣺽�һ����������
˼·�����ú�������Ҫ��ȷ�������⣺
			��ȷһ�����ú����ķ��ؽ����ʲô��
				����������ŵ����飬û�з���ֵ --- void
			��ȷ�������ú�������û��δ֪�����������㣿
				�У���Ҫѡ����ĸ��������� --- int[]
*/

class BubbleSort
{
	public static void main(String args[])
	{
		int [] arr = {34,19,3,109,65,28};
		printarray(arr);
		bubblesort(arr);
		printarray(arr);
		
	}
	
	public static void bubblesort(int [] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=0; j < arr.length-1-i; j++)
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
		}
		
	}
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int i=0; i < arr.length; i++)
		{
			if(i != arr.length-1)
			{
				System.out.print(arr[i] + ",");
			}
			else
			System.out.print(arr[i] + "]" );
			
		}
		System.out.println();
	}
	
}