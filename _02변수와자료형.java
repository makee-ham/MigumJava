package _02�������ڷ���;

//public class Ex_Prg {
//	public static void main(String[] args) {
//		int num1;
//		num1 = 10;
//		
//		int num2 = 20;
//		int num3 = num1 + num2;
//		System.out.println(num1 + "+" + num2 + "=" + num3);
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		double num1, num2, result;
//		num1=1.0000001;
//		num2=2.0000001;
//		result=num1+num2;
//		
//		System.out.println(result);
//	}
//}



// 'A'~'Z':65~90 'a'~'z':97-122 '0'~'9':48-57

//public class Ex_Prg{
//	public static void main(String[] args) {
//		char ch1=65;
//		char ch2='��';
//		char ch3=0x3091;
//		char ch4=0x3092;
//		
//		System.out.println(ch1);
//		System.out.println(ch2);
//		System.out.println(ch3);
//		System.out.println(ch4);
//	}
//}



//public class Ex_Prg{
//	public static void main(String[] args) {
//		boolean b1=true;
//		boolean b2=false;
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(3<4);
//		System.out.println(3>4);
//	}
//}


//
//import java.io.*;
//public class Ex_Prg{
//	public static void main(String[] ar) throws IOException {
//		byte[] bb = {'J', 'A', 'V', 'A'};
//		for(int i=0; i<4; i++)
//			System.out.print((char)bb[i]);
//		System.out.println();
//		System.out.write(bb); // �갡 �� �ݺ��� ��� ����. throws ���ñ� �־�� �� �� ����.
//	}
//}


//public class Ex_Prg{
//	public static void main(String[] ar) {
//		byte by = 12;
//		System.out.println(by);
//		short sh = 12;
//		System.out.println(sh);
//		char ch = 65;
//		System.out.println(ch);
//		int i = 12;
//		System.out.println(i);
//		long lo = 12L;
//		System.out.println(lo);
//		float fl = 12.0f;
//		System.out.println(fl);
//		double dou = 12.0;
//		System.out.println(dou);
//		
//	}
//}



//public class Ex_Prg{
//	public static void main(String[] ar) {
//		System.out.printf("%s\n", "�����");
//		System.out.printf("%10s\n\n", "�����");
//		String name = "�����dgfggsgs";
//		int age = 20;
//		System.out.println(name);
//		System.out.printf("%10s���� ���̴� %05d���Դϴ�.\n", name, age);
//	}
//}



//public class Ex_Prg{
//	public static void main(String[] args) {
//		final double KM_PER_MILE = 1.609344;
//		double km;
//		double mile = 60.0;
//		km = KM_PER_MILE * mile;
//		System.out.println("60������ " + km + "ų�ι����Դϴ�.");
//	}
//}



//// ���� 2
//public class Ex_Prg{
//	public static void main(String[] args) {
//		System.out.println("1" + "2");
//		System.out.println(true + "");
//		System.out.println("A" + "B");
//		System.out.println((char)('1' + 2));  // �ƽ�Ű�ڵ� �̿��ؼ� 3 �����!
//		System.out.println((char)(('1' + '2')-48));
//		System.out.println('J' + "ava");  // ���� �𸣰����� J�� �ƽ�Ű�� �ƴ� ���ڷ� �˾Ƽ� �ν��ع���.
////		System.out.println(true + null);
//	}
//}



//// ���� ���� 3
//public class Ex_Prg{
//	public static void main(String[] args) {
//		int amount = 5;
//		int cost = 10000;
//		int sum = amount * cost;
//		
//		System.out.printf("���� : %d", amount);
//		System.out.println();
//		System.out.printf("�ܰ� : %d", cost);
//		System.out.println();
//		System.out.printf("�ݾ� : %d", sum);
//	}
//}



//// ���� ���� 4
//public class Ex_Prg{
//	public static void main(String[] args) {
//	double a = 5.0;
//	double b = 2.0;
//	double k1, k2, k3, k4;
//	k1 = a+b;
//	k2 = a-b;
//	k3 = a*b;
//	k4 = a/b;
//	
//	System.out.printf("%.1f + %.1f = %.1f", a, b, k1);
//	System.out.println();
//	System.out.printf("%.1f - %.1f = %.1f", a, b, k2);
//	System.out.println();
//	System.out.printf("%.1f * %.1f = %.1f", a, b, k3);
//	System.out.println();
//	System.out.printf("%.1f / %.1f = %.1f", a, b, k4);
//	System.out.println();
//	}
//}



//// ���� ���� 5
//public class Ex_Prg{
//	public static void main(String[] args) {
//		String name = "ȫ�浿";
//		int age = 21;
//		String address = "�д籸 ���̵� 25-1����";
//		
//		System.out.printf("�̸� : %s", name);
//		System.out.println();
//		System.out.printf("���� : %d��", age);
//		System.out.println();
//		System.out.printf("�ּ� : %s", address);
//		System.out.println();
//	}
//}



//// ���� ���� 6
//public class Ex_Prg{
//	public static void main(String[] args) {
//		int A = 10;
//		int B = 20;
//		int C;
//		
//		System.out.println("<<��ȯ�ϱ� ��>>");
//		System.out.printf("  A = %d", A);
//		System.out.println();
//		System.out.printf("  B = %d", B);
//		System.out.println();
//		System.out.println();
//		
//		C = A;
//		A = B;
//		B = C;
//		
//		System.out.println("<<��ȯ ��>>");
//		System.out.printf("  A = %d", A);
//		System.out.println();
//		System.out.printf("  B = %d", B);
//		
//	}
//}



//// ���� ���� 7
//public class Ex_Prg{
//	public static void main(String[] args) {
//		int A = 10;
//		int B = 20;
//		int C = 30;
//		int temp;
//		
//		System.out.printf("��ȯ �� : A=%d B=%d C=%d", A, B, C);
//		System.out.println();
//		
//		temp = C;
//		C = B;
//		B = A;
//		A = temp;
//		
//		
//		System.out.printf("��ȯ �� : A=%d B=%d C=%d", A, B, C);
//	}
//}