package ThinkTest01;

class customer{
    private int age=10;
	private static int age1=11;
	
	public void m1(){
		System.out.println(age);
		System.out.println(age1);
	}
	
	public static void m2(){
		//System.out.println(age);
		System.out.println(age1);
	}
	
	//��̬�ڲ���ķ����������Ƿ�̬�����ܷ��ʸ÷Ǿ�̬����
	/*
	static class A{
		public static void m3(){
			//System.out.println(age);
			System.out.println(age1);
		}
		
		public void m4(){
			//System.out.println(age);
			System.out.println("String");
		}
	}
	*/
	
	class A{
		
		public void m4(){
			//System.out.println(age);
			System.out.println("String");
		}
	}
}


public class ThinkTest001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer custom = new customer();
		custom.m1();
		customer.m2();
		
		customer.A a = custom.new A();
		a.m4();
	}

}
