/**
	2017-10-2 21:50:25
	需求：
				 对两个整数进行互换（不使用第三个变量）
	思路：
			1. 使用异或的性质：一个数异或同一个数结果还是这个数 --- 正确（位运算）
			2. 使用加法求和 --- 可以实现
				                  缺点：这种实现方式不适用于数值过大的数，容易引起强制转换，从而损失精度
	问题：
			1.1 		int i = 5;
							int j = 6;
		
							i = j ^ 3 ^3;
							j = i;		//error 显而易见无法实现交换
							
			1.2			System.out.println("i="+（j ^ 3 ^ 3 ）);	  //error  exchange.java:26: 错误: 非法字符: '\uff08'
                																									 System.out.println("i="+（j ^ 3 ^ 3 ）);
																																	 exchange.java:26: 错误: 需要';'
                																									 System.out.println("i="+（j ^ 3 ^ 3 ）);
																																   exchange.java:26: 错误: 非法的表达式开始
                																									 System.out.println("i="+（j ^ 3 ^ 3 ）);
	解决：
			1.1			i = i ^ j;	//i = 5 ^ 6 ；
							j = i ^ j;	//j = 5 ^ 6  ^ 6 = 5;
							i = i ^ j;	//i = 5 ^ 6  ^ 5 = 6;
							
			1.2			i = i + j;	//i = 5 + 6 = 11；
							j = i - j;	//j = 11 - 6 = 5;
							i = i - j;	//i = 11 - 5 = 6;
*/
class Exchange
{
	public static void main(String args[])
	{
		int i = 5;
		int j = 6;
		
//		i = j ^ 3 ^3;
//		j = i;
		
//		System.out.println("i="+（j ^ 3 ^ 3 ）);	
//		System.out.println("j="+i);

/*		
		//第一种方法
		i = i + j;	//i = 5 + 6 = 11；
		j = i - j;	//j = 11 - 6 = 5;
		i = i - j;	//i = 11 - 5 = 6;
*/

		//第二种办法 --- 面试时用，阅读性差但是效率高
		i = i ^ j;	//i = 5 ^ 6 ；
		j = i ^ j;	//j = 5 ^ 6  ^ 6 = 5;
		i = i ^ j;	//i = 5 ^ 6  ^ 5 = 6;
		
		//第三种方法 --- 传统引用第三个变量方法，阅读性高效率也不是很差 --- 开发时用
		
		System.out.println("i="+i+",j="+j);
	}	
}