/**
time：2017-11-20 15:38:43
author：@su

需求：包 --- jar
思路：1. 对类文件进行分类管理
			2. 对类提供多层命名空间
			3. 写在程序的第一行
			4. 类名的全称是  包名.类名
			5. 包也是一种封装形式
心得：编译时：
						D:\javacode\practice>javac -d .jardemo.java  //其中-d + 目录，其中.jardemo.java 表示当前目录
						D:\javacode\practice>java mypack.JarDemo     //mypack中的class文件
						package


*/

//定义包用package
package jardemo;
public class 	JarDemo
{
	public static void main(String args[])
	{
		System.out.println("package");
	}
	
	public void show()
	{
		System.out.println("jardemo run");
	}
}