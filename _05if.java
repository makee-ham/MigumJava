package _05���if;

//// ���� 7
//import java.util.Scanner;
//class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int kor, eng, mat;
//		System.out.print("���� ���� ���� ������ �Է��ϼ��� : ");
//		kor = sc.nextInt();
//		eng = sc.nextInt();	
//		mat = sc.nextInt();
//		
//		if(((kor+eng+mat)/3 >= 60) && (kor>=40&&eng>=40&&mat>=40)) {
//			System.out.println("=>�����մϴ�! �հ��Դϴ�~");
//		}
//		else {
//			System.out.println("=>�ȵƱ��� �Ф� ���հ��Դϴ�~");
//		}
//	}
//}



//// ���� 9
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1, n2;
//		String op;
//		
//		System.out.print("ù��°�� : ");
//		n1 = sc.nextInt();
//		System.out.print("������(+ - * /) : ");
//		sc.nextLine();
//		op = sc.nextLine();
//		System.out.print("�ι�°�� : ");
//		n2 = sc.nextInt();
//		
//		
//		if(op.equals("+")) System.out.printf("%d %s %d = %d", n1, op, n2, n1+n2);
//		else if(op.equals("-")) System.out.printf("%d %s %d = %d", n1, op, n2, n1-n2);
//		else if(op.equals("*")) System.out.printf("%d %s %d = %d", n1, op, n2, n1*n2);
//		else if(op.equals("/")) System.out.printf("%d %s %d = %d", n1, op, n2, n1/n2);
//	}
//}



//// ���� 14
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s; char ch;
//		
//		System.out.print("�����ڸ� �Է��ϼ��� : ");
//		s = sc.nextLine();
//		ch = s.charAt(0);
//		
//		if('A'<=ch && 'Z'>=ch) System.out.println("�빮���Դϴ�");
//		else if('a'<=ch && 'z'>=ch) System.out.println("�ҹ����Դϴ�");
//	}
//}



//// ���� ���� 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է� �ϼ��� : ");
//		int n = sc.nextInt();
//		
//		if(n > 0) {
//			System.out.printf("=>%d�� ����Դϴ�.", n);
//		}
//		else if(n == 0) {
//			System.out.printf("=>%d�� 0�Դϴ�.", n);
//		}
//		else {
//			System.out.printf("=>%d�� �����Դϴ�.", n);
//		}
//	}
//}



//// ���� ���� 2
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̸� �Է� �ϼ��� : ");
//		int age = sc.nextInt();
//		
//		if(age<18) {
//			System.out.print("=>������� ���� �Դϴ�.");
//		}
//		else {
//			System.out.print("=>������� 1500���Դϴ�.");
//		}
//	}
//}



//// ���� ���� 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է��ϼ��� : ");
//		int n1 = sc.nextInt();
//		System.out.print("���� �Է��ϼ��� : ");
//		int n2 = sc.nextInt();
//		
//		if(n1 > n2) {
//			System.out.printf("=>ū ���� %d�Դϴ�.", n1);
//		}
//		else {
//			System.out.printf("=>ū ���� %d�Դϴ�.", n2);
//		}
//	}
//}



//// ���� ���� 4
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� : ");
//		int n = sc.nextInt();
//		
//		if(n%2 == 0) {
//			System.out.printf("=>%d�� ¦���Դϴ�", n);
//		}
//		else {
//			System.out.printf("=>%d�� Ȧ���Դϴ�", n);
//		}
//	}
//}



//// ���� ���� 5
//import java.util.Scanner;
//public class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("Ű�� �Է��ϼ���%5s", ": ");
//		int h = sc.nextInt();
//		System.out.print("�����Ը� �Է��ϼ��� : ");
//		int w = sc.nextInt();
//		
//		if((h-100)*0.9 < w) {
//			System.out.println("���̾�Ʈ�� �ʿ��ϴ�.");
//		}
//		else {
//			System.out.println("���̾�Ʈ�� �ʿ����.");
//		}
//	}
//}



//// ���� ���� 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���� ���� ������ �Է��ϼ��� : ");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		
//		if((kor+eng+mat)/3 >= 60) {
//			System.out.println("�հ�");
//		}
//		else {
//			System.out.println("���հ�");
//		}
//	}
//}



//// ���� ���� 8
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� : ");
//		int n = sc.nextInt();
//		
//		if(n%2==0 && n%3==0) {
//			System.out.printf("%d�� 2�� 3�� ������Դϴ�.", n);
//		}
//		else {
//			System.out.printf("%d�� 2�� 3�� ������� �ƴմϴ�.", n);
//		}
//	}
//}



//// ���� ���� 10
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Ը� �Է��ϼ��� : ");
//		double w = sc.nextDouble();
//		
//		if(w<63.5) {
//			System.out.println("����� Light�� �Դϴ�.");
//		}
//		else if(w >= 63.5 && w < 67) {
//			System.out.println("����� Welter�� �Դϴ�.");
//		}
//		else if(w >= 67 && w < 71) {
//			System.out.println("����� Light Welter�� �Դϴ�.");
//		}
//		else if(w >= 71 && w < 75) {
//			System.out.println("����� Middle�� �Դϴ�.");
//		}
//		else if(w >= 75 && w < 81) {
//			System.out.println("����� Light Heavy�� �Դϴ�.");
//		}
//		else {
//			System.out.println("����� Heavy�� �Դϴ�.");
//		}
//	}
//}



//// ���� ���� 11
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�⵵�� �Է��ϼ��� : ");
//		int year = sc.nextInt();
//		
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.printf("%d���� �����Դϴ�.", year);
//		}
//		else {
//			System.out.printf("%d���� ����Դϴ�.", year);
//		}
//	}
//}



//// ���� ���� 12
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
//		
//		if(10<=age && 19>=age) {
//			System.out.println("10��");
//		}
//		else if(20<=age && 29>=age) {
//			System.out.println("20��");
//		}
//		else if(30<=age && 39>=age) {
//			System.out.println("30��");
//		}
//		else {
//			System.out.println("��Ÿ");
//		}
//	}
//}



//// ���� ���� 13
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��뷮�� �Է��ϼ��� : ");
//		int w = sc.nextInt();
//		if(w <= 50) {
//			System.out.printf("= > ������ : %d ��", w*34);
//		}
//		else if(w > 50 && w <= 100) {
//			System.out.printf("= > ������ : %d ��", 50*34 + (w-50)*81);
//		}
//		else {
//			System.out.printf("= > ������ : %d ��", 50*34 + 50*81 + (w-100)*122);
//		}
//	}
//}



//// ���� ���� 15
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����ڸ� �Է��ϼ��� : ");
//		String s = sc.nextLine();
//		char c = s.charAt(0);
//		
//		if(c>='A' && c<='Z') {
//			System.out.printf("=>%s", (char)(c+32));
//		}
//		else {
//			System.out.printf("=>%s", (char)(c-32));
//		}
//	}
//}



//// ���� ���� 16
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		String s = sc.nextLine();
//		char c = s.charAt(0);
//		
//		if('0'<= c && '9'>=c) {
//			System.out.println("=> ���� �Դϴ�.");
//		}
//		else if('A'<=c && 'Z'>=c || 'a'<=c && 'z'>=c) {
//			System.out.println("=> ������ �Դϴ�.");
//		}
//		else {
//			System.out.println("=> Ư������ �Դϴ�.");
//		}
//	}
//}



//// ���� ���� 17
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a, b, c, temp;
//		System.out.print("3���� �� : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		if(a < b) {
//			temp=a; a=b; b=temp;
//		}
//		if(a < c) {
//			temp=a; a=c; c=temp;
//		}
//		if(b < c) {
//			temp=b; b=c; c=temp;
//		}
//		System.out.printf("=> ū ������� ��� : %d %d %d", a, b, c);
//	}
//}



//// ���� ���� 18
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		String ddi;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ ������ �Է��Ͻÿ� : ");
//		int tYear = sc.nextInt();
//		System.out.print("�¾ ������ �Է��Ͻÿ� : ");
//		int bYear = sc.nextInt();
//		
//		if(tYear%12==4) {
//			ddi = "��";
//		}
//		else if(tYear%12==5) {
//			ddi = "��";
//		}
//		else if(tYear%12==6) {
//			ddi = "ȣ����";
//		}
//		else if(tYear%12==7) {
//			ddi = "�䳢";
//		}
//		else if(tYear%12==8) {
//			ddi = "��";
//		}
//		else if(tYear%12==9) {
//			ddi = "��";
//		}
//		else if(tYear%12==10) {
//			ddi = "��";
//		}
//		else if(tYear%12==11) {
//			ddi = "��";
//		}
//		else if(tYear%12==0) {
//			ddi = "������";
//		}
//		else if(tYear%12==1) {
//			ddi = "��";
//		}
//		else if(tYear%12==2) {
//			ddi = "��";
//		}
//		else {
//			ddi = "����";
//		}
//		System.out.printf("%d���̰� %s���Դϴ�.", tYear-bYear, ddi);
//	}
//}



//// ���� ���� 19
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("� ������ ������ ���ұ��?(R-�簢��, T-�ﰢ��, C-��) : ");
//		String temp = sc.nextLine();
//		//char figure = temp.charAt(0);
//		
//		if(temp.equals("R")) {
//			System.out.print(" ���� : ");
//			int r = sc.nextInt();
//			System.out.print(" ���� : ");
//			int c = sc.nextInt();
//			System.out.printf(" ==> �簢���� ������ %d�Դϴ�", r*c);
//		}
//		else if(temp.equals("T")) {
//			System.out.print(" �غ� : ");
//			int l = sc.nextInt();
//			System.out.print(" ���� : ");
//			int h = sc.nextInt();
//			System.out.printf(" ==> �ﰢ���� ������ %d�Դϴ�", l*h/2);
//		}
//		else {
//			System.out.print(" ������ : ");
//			double r = sc.nextDouble();
//			System.out.printf(" ==> ���� ���̴� %.2f�Դϴ�", r*r*3.14);
//		}
//	}
//}



//// ���� ���� 20
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a, h, w;
//		double k;
//		
//		System.out.print("���̸� �Է��ϼ��� : ");
//		a = sc.nextInt();
//		System.out.print("Ű�� �Է��ϼ��� : ");
//		h = sc.nextInt();
//		System.out.print("ü���� �Է��ϼ��� : ");
//		w = sc.nextInt();
//
//		k = w/((h*0.01)*(h*0.01));
//		
//		if(a>=20 && a<=29) {
//			if(k <= 17.9) {
//				System.out.println("=>����� ��ü���Դϴ�");
//			}
//			else if(k>=18 && k<=23) {
//				System.out.println("=>����� ǥ��ü���Դϴ�");
//			}
//			else if(k>=24 && k<=30) {
//				System.out.println("=>����� ��ü���Դϴ�");
//			}
//			else {
//				System.out.println("=>����� ���Դϴ�");
//			}
//		}
//		else {
//			if(k <= 18.4) {
//				System.out.println("=>����� ��ü���Դϴ�");
//			}
//			else if(k>=18.5 && k<=24) {
//				System.out.println("=>����� ǥ��ü���Դϴ�");
//			}
//			else if(k>=25 && k<=30) {
//				System.out.println("=>����� ��ü���Դϴ�");
//			}
//			else {
//				System.out.println("=>����� ���Դϴ�");
//			}
//		}
//	}
//}