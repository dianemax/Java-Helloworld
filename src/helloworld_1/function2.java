/**
2017-10-5 19:33:52
需求：定义一个函数，比较两个数是否相等
思路：函数的编写需要明确两个问题：
			明确一：这个功能的结果是什么？
					结果是相等或者不相等 --- boolean类型
			明确二：这个函数实现过程中是否有未知内容参与运算？
					有，需要两个相比较的数字 --- int
*/

class Function2
{
	public static void main(String args[])
	{
		boolean e = equal(5,6);  //函数的返回值类型是什么，相应的输出数据的类型就是什么
		System.out.println(e);
		
	}
	
	public static boolean equal(int x, int y)
	{
		//高级写法：因为return本身返回的就是boolean类型的值
		
		return x == y;
		
//		if(x == y)
//			return true;
//
//		else 
//			return false;		
	}
	
}