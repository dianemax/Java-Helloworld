/**
2017-10-7 10:12:13
���󣺲����������Ƿ����һ����
˼·��1. ͨ�÷��� --- forѭ����������
			2. �۰���ң����ַ����ң� --- ǰ����������Ҫ��ǰ�ź���
				2.1 ��������
				2.2 �۰����
				2.3 ����������Ҫ��ȷ��������
					��ȷһ�����������Ľ����ʲô��
						������Ҫ�������ֵ��±� --- int
					��ȷ���������������Ƿ�Ҫ����δ֪����
						��Ҫ��һ���ǵ����ĸ����� һ������Ҫ���ҵ���
*/

class Search
{
	public static void main(String args[])
	{
		int[] arr = {34,28,1,95,5,25};
		printarray(arr);
		sort(arr);
		printarray(arr);
		int index = search(arr,28);
		System.out.println("Index = " + index);
		
	}
	
	public static int search(int[] arr, int key)
	{
		int min = 0;
		int max = arr.length-1;
		int mid ;
		while(min <= max)
		{
			mid = (min + max)>>1;
			if(key > arr[mid])
			{
				min = mid + 1;
			}	
			else if(key < arr[mid])
			{
				max = mid - 1;
			}
			else
			return mid;
		}
		return -1;
	}
	
	public static void sort(int[] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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