package _06switch;

//// 1
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int n=2;
//		switch(n) {
//		case 1: case 2:case 3:
//				 System.out.println("Fantastic Java"); break;
//		case 4: 
//		case 5: System.out.println("������");break;
//		default: System.out.println("The best programming language"); //break;
//		}
//		System.out.println("Do you like coffee?");
//	}
//}



//// ���� 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ǹ�ȣ�� �Է��ϼ��� : ");
//		int n = sc.nextInt();
//		
//		switch(n) {
//		case 2: System.out.println("*** �����մϴ�!!! 1� ��÷�Ǽ̽��ϴ�."); break;
//		case 5: System.out.println("*** �����մϴ�!!! 2� ��÷�Ǽ̽��ϴ�."); break;
//		case 7: System.out.println("*** �����մϴ�!!! 3� ��÷�Ǽ̽��ϴ�."); break;
//		default: System.out.println("*** �ȵƱ���Ф� ���Դϴ�~");
//		}
//	}
//}



//// ���� 2
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ù ��° ���� �Է��ϼ���        : ");
//		int n1 = sc.nextInt();
//		System.out.print("������( + - * / )�� �Է��ϼ��� : ");
//		sc.nextLine();
//		String c = sc.nextLine();
//		System.out.print("�� ��° ���� �Է��ϼ���        : ");
//		int n2 = sc.nextInt();
//		
//		switch(c) {
//		case "+": {System.out.printf("=>%d %s %d = %d", n1, c, n2, n1+n2);
//			break;}
//		case "-": System.out.printf("=>%d %s %d = %d", n1, c, n2, n1-n2); break;
//		case "*": System.out.printf("=>%d %s %d = %d", n1, c, n2, n1*n2); break;
//		case "/": System.out.printf("=>%d %s %d = %d", n1, c, n2, n1/n2); break;
//		default: System.out.println("=>�����ڰ� �߸� �ԷµǾ����ϴ�.");
//		}
//	}
//}



//// ���� 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//	 	Scanner sc = new Scanner(System.in);
//		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
//		//char z = Integer.toString(age).charAt(0);
//		
//		switch(age/10) {  // ��... �̷��� ��Ƽ���� ���� �ڸ��� ����...
//		case 1: System.out.println("=> ����� 10��"); break;
//		case 2: System.out.println("=> ����� 20��"); break;
//		case 3: System.out.println("=> ����� 30��"); break;
//		default: System.out.println("=> ����� ��Ÿ");
//		}
//	}
//}



//// ���� ���� 4
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���� ���� ������ �Է��ϼ��� : ");
//		int k = sc.nextInt();
//		int e = sc.nextInt();
//		int m = sc.nextInt();
//		int t = (k+e+m)/3;
//		
//		switch(t/10) {
//		case 9: System.out.println("=> A����"); break;
//		case 8: System.out.println("=> B����"); break;
//		case 7: System.out.println("=> C����"); break;
//		case 6: System.out.println("=> D����"); break;
//		default: System.out.println("=> F����");
//		}
//	}
//}



//// ���� ���� 5
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int com = (int)(Math.random() * 3 + 1);  // 1, 2, 3 �� ���� �ϳ��� com�� ����. * �� �� + ù ��
//		System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ��� : ");
//		int user = sc.nextInt();
//		
//		System.out.printf("����� %d �Դϴ�.", user);
//		System.out.printf("\n��ǻ�ʹ� %d �Դϴ�.", com);
//		
//		switch(user-com) {
//		case -1: case 2: System.out.println("\n�����ϴ�."); break;
//		case 0: System.out.println("\n�����ϴ�."); break;
//		default: System.out.println("\n�̰���ϴ�.");
//		}
//	}
//}



//// ���� ���� 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� �ֹε�Ϲ�ȣ�� �Է��ϼ��� : ");
//		String sn = sc.nextLine();
//		char g = sn.charAt(7);
//		
//		switch(g) {
//		case '1': System.out.println("����� 2000�� ������ ����� �����Դϴ�."); break;
//		case '3': System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�."); break;
//		case '2': System.out.println("����� 2000�� ������ ����� �����Դϴ�."); break;
//		case '4': System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�."); break;
//		}
//	}
//}