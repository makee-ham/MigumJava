package _04�⺻�Է�;


//// 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		String s = "1 4 7";
//		Scanner sc = new Scanner(s);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int n4 = n1+n2+n3;
//		System.out.println(n4);
//	}
//}



//// 2
//import java.util.Scanner;
//public class Ex_Prg {
//public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��1:");
//		int n1 = sc.nextInt();
//		System.out.print("��2:");
//		int n2 = sc.nextInt();
//		System.out.print("��3:");
//		int n3 = sc.nextInt();
//		System.out.printf("�Էµ� ���� %d %d %d�� �� %d \n", n1, n2, n3, n1+n2+n3);
//	}
//}



//// 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] ar) {
//		Scanner key = new Scanner(System.in);
//		System.out.print("�̸�?");
//		String str = key.nextLine();
//		System.out.print("�ȳ��ϼ���?" + str + "��~");
//		System.out.print("����� �ڹٸ� �����ϴ�����?");
//		boolean tf = key.nextBoolean();
//		if(tf==true)
//			System.out.print("���� �ڹٸ� �����Ͻô±���");
//		else
//			System.out.print("�̷�!! �ƴϾ�����Ф�");
//		
//		System.out.print("����� Ű�� �����Դ�?");
//		double ki = key.nextDouble();
//		double we = key.nextDouble();
//		double ch = ki-we;
//		if(ch<100)
//			System.out.print("���̾�Ʈ �ϼž߰ڳ׿�");
//		else
//			System.out.print("�����Ͻó׿�");
//	}
//}



//// 4 Ű���忡�� �ѹ��ڸ� �Է� �޴� ���_1
//import java.io.IOException;
//class Ex_Prg {
//	public static void main(String[] args) throws IOException{
//		System.out.print("�� ���ڸ� �Է��ϼ���: ");
//		char cc = (char)System.in.read();
//		System.out.println("�Է��� ���ڴ�: " + cc);
//		System.out.println("�Է��� ������ �ڵ尪: " + (int)cc);
//	}
//}



//// 4 Ű���忡�� �ѹ��ڸ� �Է� �޴� ���_2
//import java.util.Scanner;
//class Ex_Prg {
//	public static void main(String[] args){
//		Scanner cc = new Scanner(System.in);
//		String s;
//		System.out.print("�� ���ڸ� �Է��ϼ���: ");
//		s = cc.nextLine();
//		System.out.println(s);  // ���� ���ڿ��� ���� null ���� �ִ�!
//		char ch = s.charAt(0);  // �̷��� �ؾ� �� �� ���ڸ� �߸���!
//		System.out.println("�Է��� ���ڴ�: " + ch);
//		System.out.println("�Է��� ������ �ڵ尪: " + (int)ch);
//	}
//}



//// ���� 2
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner i = new Scanner(System.in);
//		System.out.print("3���� ���� �Է��ϼ��� : ");
//		int n1 = i.nextInt();
//		int n2 = i.nextInt();
//		int n3 = i.nextInt();
//		System.out.printf("�Է��Ѱ� : %d %d %d\n", n1, n2, n3);
//		System.out.printf("��   �� : %d\n", n1+n2+n3);
//		System.out.printf("��   �� : %.2f\n", (n1+n2+n3)/3f);
//	}
//}



//// ���� 7
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		String name;
//		int kor, eng, mat;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("�̸� �Է� : ");
//		name = sc.nextLine();
//		System.out.printf("���� �Է� : ");
//		kor = sc.nextInt();
//		System.out.printf("���� �Է� : ");
//	    eng = sc.nextInt();
//		System.out.printf("���� �Է� : ");
//		mat = sc.nextInt();
//		
//		System.out.printf("%21s", "** ����ǥ **\n\n");
//		System.out.println("�̸�   ����   ����   ����   ����   ���");
//		System.out.println("================================");
//		System.out.printf("%s   %d   %d   %d   %d   %.2f", name, kor, eng, mat, kor+eng+mat, (kor+eng+mat)/3f);
//	}
//}



//// ���� ���� 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int h, v;
//		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
//		h = sc.nextInt();
//		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
//		v = sc.nextInt();
//		System.out.println();
//		System.out.printf("\n=>���̴� %d �Դϴ�", h*v);
//	}
//}



//// ���� ���� 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double r, a, c;
//		System.out.print("���� �������� �Է��ϼ��� : ");
//		r = sc.nextDouble();
//		a = r*r*3.14;
//		c = 2*r*3.14;
//		System.out.printf("������ : %.2f", a);
//		System.out.printf("\n���ѷ� : %.2f", c);
//	}
//}



//// ���� ���� 4
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int fsec, hour, min, sec;
//		System.out.print("�ʸ� �Է��Ͻÿ� : ");
//		fsec = sc.nextInt();
//		hour = fsec/(60*60);
//		min = (fsec/60 - hour*60);
//		sec = (fsec - hour*60*60 - min*60);
//		System.out.printf("%d�ð� %d�� %d���Դϴ�.", hour, min, sec);
//	}
//}



//// ���� ���� 5
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name;
//		int cost, num;
//		System.out.print("��ǰ�� �Է� : ");
//		name = sc.nextLine();
//		System.out.print("��ǰ�� �Է� : ");
//		cost = sc.nextInt();
//		System.out.print("��ǰ�� �Է� : ");
//		num = sc.nextInt();
//		System.out.printf("%s %d���� ������ %d�Դϴ�", name, num, cost*num);
//	}
//}



//// ���� ���� 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double n1, n2;
//		System.out.print("ù ��° ���� �Է��ϼ��� : ");
//		n1 = sc.nextDouble();
//		System.out.print("�� ��° ���� �Է��ϼ��� : ");
//		n2 = sc.nextDouble();
//		System.out.println();
//		
//		System.out.printf("%.1f + %.1f = %.1f", n1, n2, n1+n2);
//		System.out.printf("\n%.1f - %.1f = %.1f", n1, n2, n1-n2);
//		System.out.printf("\n%.1f * %.1f = %.1f", n1, n2, n1*n2);
//		System.out.printf("\n%.1f / %.1f = %.1f", n1, n2, n1/n2);
//	}
//}



//// ���� ���� 8
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int _500, _100, _50, _10;
//		System.out.print("500�� : ");
//		_500 = sc.nextInt();
//		System.out.print("100�� : ");
//		_100 = sc.nextInt();
//		System.out.print("50�� : ");
//		_50 = sc.nextInt();
//		System.out.print("10�� : ");
//		_10 = sc.nextInt();
//		System.out.printf("\n=>������ �ݾ� : %d��", 500*_500+100*_100+50*_50+10*_10);
//	}
//}