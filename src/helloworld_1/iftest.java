/**
2017-10-3 16:50:05
需求：输入月份，判断所处的季节
			春季：3 4 5   夏季：6 7 8   秋季：9 10 11   冬季：12 1 2

思路：1. 利用if判断语句，在输入1-12是判断并打印出正确所处季节，在输入除1-12之外的数字给出相应文字提示
			2. 利用switch语句判断

心得：1. 或的两种表达方式都可以实现
						//if(month == 3 || month == 4 || month == 5) --- 数据简单时候使用
						//if(month == 3 | month == 4 | month == 5)
				 区别：
				 | --- 单或：就算或的左边是true，也要从左向右依次执行
				 || --- 双或：当左边的判断结果为true时，不执行右边 --- 效率更高，具有“短路”功能
			2. 一定要在英文环境下输入，出现非法字符的提示可能有两种情况：
					1> 分号     英文状态 --- ;     中文状态 --- ；    
					2> 双引号   英文状态 --- ""    中文状态 --- “”  
			3. 可以使用区间 if（month >= 3 && month <= 5）--- 连续区间或者数据较多时使用
*/
class IfTest
{
	public static void main(String args[])
	{
		int month;
		month = 5;
		
//		if(month == 3 || month == 4 || month == 5)
		if(month == 3 | month == 4 | month == 5)
		{
			System.out.println(month + "is spring");
		}
		else if(month == 6 || month == 7 || month == 8)
		{
			System.out.println(month + "is summer");
		}
		else if(month == 9 | month == 10 | month == 11)
		{
			System.out.println(month + "is autumn");
		}
		else if(month == 12 | month == 1 | month == 2)
		{
			System.out.println(month + "is winter");
		}
		else
		{
			System.out.println("wrong number!");
		}
	}
}