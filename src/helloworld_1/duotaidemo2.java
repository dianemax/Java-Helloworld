/**
time：2017-11-8 14:44:16
author：@su

需求：多态的特点
心得：1. 成员变量
					 编译时：参考引用型变量所属的类中是否有调用class的成员变量，如果有则编译通过，没有，则失败
					 运行时：参考引用型变量所属的类中是否有调用成员变量，并运行该所属类中的成员变量
				 eg.class Fu
						{
							int num = 3;
						}

						class Zi extends Fu
						{
							int num = 4;
						}
			 		 Fu f = new Zi();
				 	 简单说：编译和运行都参考左边（多态类型分两边，左父类，右子类）
				 	 原理猜想：f 的类型是父类，因此输出父类的内容
				 	 					 如果程序是:class Fu
																{
																	
																}

																class Zi extends Fu
																{
																	int num = 4;
																}
																
																Fu f = new Zi();
																System.out.println(f.num);
																
				 	 					 结果是：duotaidemo2.java:85: 错误: 找不到符号
													                System.out.println(f.num);
													                                    ^
													  符号:   变量 num
													  位置: 类型为Fu的变量 f
										 原因：输出的 f.num 看父类中的内容而父类中的内容为空
				 	 
			2. 成员函数
					 编译时：参考引用性变量所属的类中是否有调用的函数，有，则编译通过，没有，则失败
					 运行时：参考的是对象所属的类中是否有调用函数，有，则编译通过，没有，则失败
				 eg.class Fu
						{
							void show()
							{
								System.out.println("fu show");
							}
						}

						class Zi extends Fu
						{
							void show()
							{
								System.out.println("zi show");
							}
						}
						Fu f = new Zi();
					 简单说：编译看左边，运行看右边。
					 原理猜想：程序运行，在堆内存中创建new Zi类，产生的地址发送到栈中，最终由地址指向子类中的内容
					 注：非静态必须由对象来完成，它依赖的是对象，必须绑定在指定的对象上
					 
			3. 成员函数（静态）
				 	 编译时：参与引用型变量所属的类中是否有调用的静态方法
				 	 运行时：参与引用型变量所属的类中是否有调用的静态方法
				 eg.class Fu
						{
							static void show()
							{
								System.out.println("fu show");
							}
						}

						class Zi extends Fu
						{
							static void show()
							{
								System.out.println("zi show");
							}
						}
						Fu f = new Zi();
						f.show();
					 简单说：编译和运行都看左边(其实对于静态方法，是不需要对象的，直接用类名即可。

*/

//成员变量eg1 --- 输出为3
class Fu
{
	int num = 3;
}

class Zi extends Fu
{
	int num = 4;
}

class DuoTaiDemo2
{
	public static void main(String args[])
	{
		Fu f = new Zi();
		System.out.println(f.num);
	}
}

//成员变量eg2 --- 输出error
class Fu
{
	
}

class Zi extends Fu
{
	int num = 4;
}

class DuoTaiDemo2
{
	public static void main(String args[])
	{
		Fu f = new Zi();
		System.out.println(f.num);
	}
}

//成员函数（非静态）eg1 ---  输出：zi show
class Fu
{
	void show()
	{
		System.out.println("fu show");
	}
}

class Zi extends Fu
{
	void show()
	{
		System.out.println("zi show");
	}
}

class DuoTaiDemo2
{
	public static void main(String args[])
	{
		Fu f = new Zi();
		f.show();
	}
}

//成员函数（非静态）eg2；父类中没show ---  输出error
//参考引用性变量 f 所属的类 Fu 中是否有调用的函数 --- 没有  因此编译失败
class Fu
{
//	void show()
//	{
//		System.out.println("fu show");
//	}
}

class Zi extends Fu
{
	void show()
	{
		System.out.println("zi show");
	}
}

class DuoTaiDemo2
{
	public static void main(String args[])
	{
		Fu f = new Zi();
		f.show();
	}
}


//成员函数（非静态）eg2；父类中没show ---  输出: fu show
//参考引用性变量 f 所属的类 Fu 中是否有调用的函数 --- 有  但是没有输出 zi show 并且编译成功，是因为Zi类继承了Fu类
class Fu
{
	void show()
	{
		System.out.println("fu show");
	}
}

class Zi extends Fu
{
//	void show()
//	{
//		System.out.println("zi show");
//	}
}

class DuoTaiDemo2
{
	public static void main(String args[])
	{
		Fu f = new Zi();
		f.show();
	}
}


//成员函数（静态） ---  输出结果：fu show
class Fu
{
	static void show()
	{
		System.out.println("fu show");
	}
}

class Zi extends Fu
{
	static void show()
	{
		System.out.println("zi show");
	}
}

class DuoTaiDemo2
{
	public static void main(String args[])
	{
		Fu f = new Zi();
		f.show();
	}
}