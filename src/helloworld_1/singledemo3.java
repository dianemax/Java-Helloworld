/**
time��2017-10-28 16:41:33
author��@su

���󣺵�����Ƶ�����һ����ʽ --- ����ʽ�����ڰ�ȫ�������������ã�
˼·������ʽ
�ĵã�newһ������
			˽�л����캯��
			����һ����̬��Ĺ��а취�����䷵��

*/

//�ӳټ�����ʽ
class Single2   //����ؽ�����û�ж���ֻ�е�����getInstance����ʱ���Żᴴ������
{
	private int num;
	private static Single2 s = null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s == null)
		{
			s = new Single2();
		}
		return s;
	}
	
	public void setnum(int num)
	{
		this.num = num;
	}
	
	public int getnum()
	{
		return num;
	}
	
}

class SingleDemo3
{
	public static void main(String args[])
	{
		Single2 s = Single2.getInstance();
		s.setnum(20);
		System.out.println(s.getnum());
	}
}