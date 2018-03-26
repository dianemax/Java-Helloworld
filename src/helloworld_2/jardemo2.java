/**
time：2017-11-20 16:14:24
author：@su

需求：包与包之间的访问 以及 error情况及其解决办法
思路：
心得：1> code1：		JarDemo d = new JarDemo();
										d.show();
				 error1：   jardemo2.java:16: 错误: 找不到符号
										                JarDemo d = new JarDemo();
										                ^
										  符号:   类 JarDemo
										  位置: 类 JarDemo2
										jardemo2.java:16: 错误: 找不到符号
										                JarDemo d = new JarDemo();
										                                ^
										  符号:   类 JarDemo
										  位置: 类 JarDemo2
					ans1： 类名写错。
								 因为：JarDemo类已经有包的所属，所以必须要明确其包名
					注意： JarDemo这个名字是错误的，正确名称是 包名.类名  jardemo.JarDemo
								 因此程序应该改为：jardemo.JarDemo d = new jardemo.JarDemo();
								 
		 	2>  code2：jardemo.JarDemo d = new jardemo.JarDemo();
		 						 d.show();
		 			error2：   jardemo2.java:31: 错误: JarDemo在jardemo中不是公共的; 无法从外部程序包中对其进行访问
											                jardemo.JarDemo d = new jardemo.JarDemo();
											                       ^
										 jardemo2.java:31: 错误: JarDemo在jardemo中不是公共的; 无法从外部程序包中对其进行访问
											                jardemo.JarDemo d = new jardemo.JarDemo();
											                                               ^
										 2 个错误
					ans2： 权限问题。
								 将跨文件访问要访问另一个文件得类设置成共有的public
								 修改为：public class JarDemo
								 
			 3> code3:   public class JarDemo
			 		error3:  jardemo2.java:45: 错误: JarDemo在jardemo中不是公共的; 无法从外部程序包中对其进行访问
               		 jardemo.JarDemo d = new jardemo.JarDemo();
          ans:   权限问题。
          			 将跨文件访问的另一个文件中的被调用函数的权限设置成public
          			 修改为：public void show()
       总结：包与包之间的类进行访问，被访问的类必须是public的，被访问的包中的类的类型必须是public的
								 

*/

package jardemo2;   //记得加分号！
class JarDemo2
{
	public static void main(String args[])
	{
		jardemo.JarDemo d = new jardemo.JarDemo();
		d.show();
		System.out.println("mypack2 run~");
	}
}