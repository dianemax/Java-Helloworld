/**
time��2017-10-10 22:10:57
author��@su

���󣺶�������������
���裺��ӡ��printarray����
				1. ���践�� --- void
				2. ��Ҫδ֪�������� --- int[]
			����forѭ��Ƕ�� --- ѡ������
				1. ���践�� --- void
				2. ��Ҫδ֪�������� --- int[]

*/

class SortPractice
{
	public static void main(String args[])
	{
		int[] arr = {34,19,56,5,109,28};
		printarray(arr);
		sort(arr);
		printarray(arr);
	}
	
	public static void sort(int[] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=0; j <arr.length-1-i; j++ )
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	} 
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int i=0; i <arr.length; i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}
	
}