package ThinkTest01;

import java.util.Scanner;

public class ThinkTest012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b){
			int temp = a;
			a = b;
			b = temp;
		}
		int i = a,j = b;
		while(b!=0){
			int temp = a % b;
			a = b;
			b = temp;
		}
		int c = i*j /a;
		System.out.println("���Լ����:"+a);
		System.out.println("��С��������:"+c);

	}

}
