/**
time��2017-11-8 14:44:16
author��@su

���󣺶�̬���ص�
�ĵã�1. ��Ա����
					 ����ʱ���ο������ͱ��������������Ƿ��е���class�ĳ�Ա����������������ͨ����û�У���ʧ��
					 ����ʱ���ο������ͱ��������������Ƿ��е��ó�Ա�����������и��������еĳ�Ա����
				 eg.class Fu
						{
							int num = 3;
						}

						class Zi extends Fu
						{
							int num = 4;
						}
			 		 Fu f = new Zi();
				 	 ��˵����������ж��ο���ߣ���̬���ͷ����ߣ����࣬�����ࣩ
				 	 ԭ����룺f �������Ǹ��࣬���������������
				 	 					 ���������:class Fu
																{
																	
																}

																class Zi extends Fu
																{
																	int num = 4;
																}
																
																Fu f = new Zi();
																System.out.println(f.num);
																
				 	 					 ����ǣ�duotaidemo2.java:85: ����: �Ҳ�������
													                System.out.println(f.num);
													                                    ^
													  ����:   ���� num
													  λ��: ����ΪFu�ı��� f
										 ԭ������� f.num �������е����ݶ������е�����Ϊ��
				 	 
			2. ��Ա����
					 ����ʱ���ο������Ա��������������Ƿ��е��õĺ������У������ͨ����û�У���ʧ��
					 ����ʱ���ο����Ƕ��������������Ƿ��е��ú������У������ͨ����û�У���ʧ��
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
					 ��˵�����뿴��ߣ����п��ұߡ�
					 ԭ����룺�������У��ڶ��ڴ��д���new Zi�࣬�����ĵ�ַ���͵�ջ�У������ɵ�ַָ�������е�����
					 ע���Ǿ�̬�����ɶ�������ɣ����������Ƕ��󣬱������ָ���Ķ�����
					 
			3. ��Ա��������̬��
				 	 ����ʱ�����������ͱ��������������Ƿ��е��õľ�̬����
				 	 ����ʱ�����������ͱ��������������Ƿ��е��õľ�̬����
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
					 ��˵����������ж������(��ʵ���ھ�̬�������ǲ���Ҫ����ģ�ֱ�����������ɡ�

*/

//��Ա����eg1 --- ���Ϊ3
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

//��Ա����eg2 --- ���error
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

//��Ա�������Ǿ�̬��eg1 ---  �����zi show
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

//��Ա�������Ǿ�̬��eg2��������ûshow ---  ���error
//�ο������Ա��� f �������� Fu ���Ƿ��е��õĺ��� --- û��  ��˱���ʧ��
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


//��Ա�������Ǿ�̬��eg2��������ûshow ---  ���: fu show
//�ο������Ա��� f �������� Fu ���Ƿ��е��õĺ��� --- ��  ����û����� zi show ���ұ���ɹ�������ΪZi��̳���Fu��
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


//��Ա��������̬�� ---  ��������fu show
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