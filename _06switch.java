package _06switch;

//// 1
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int n=2;
//		switch(n) {
//		case 1: case 2:case 3:
//				 System.out.println("Fantastic Java"); break;
//		case 4: 
//		case 5: System.out.println("러우쟈뮈");break;
//		default: System.out.println("The best programming language"); //break;
//		}
//		System.out.println("Do you like coffee?");
//	}
//}



//// 문제 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("복권번호를 입력하세요 : ");
//		int n = sc.nextInt();
//		
//		switch(n) {
//		case 2: System.out.println("*** 축하합니다!!! 1등에 당첨되셨습니다."); break;
//		case 5: System.out.println("*** 축하합니다!!! 2등에 당첨되셨습니다."); break;
//		case 7: System.out.println("*** 축하합니다!!! 3등에 당첨되셨습니다."); break;
//		default: System.out.println("*** 안됐군요ㅠㅠ 꽝입니다~");
//		}
//	}
//}



//// 문제 2
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 수를 입력하세요        : ");
//		int n1 = sc.nextInt();
//		System.out.print("연산자( + - * / )를 입력하세요 : ");
//		sc.nextLine();
//		String c = sc.nextLine();
//		System.out.print("두 번째 수를 입력하세요        : ");
//		int n2 = sc.nextInt();
//		
//		switch(c) {
//		case "+": {System.out.printf("=>%d %s %d = %d", n1, c, n2, n1+n2);
//			break;}
//		case "-": System.out.printf("=>%d %s %d = %d", n1, c, n2, n1-n2); break;
//		case "*": System.out.printf("=>%d %s %d = %d", n1, c, n2, n1*n2); break;
//		case "/": System.out.printf("=>%d %s %d = %d", n1, c, n2, n1/n2); break;
//		default: System.out.println("=>연산자가 잘못 입력되었습니다.");
//		}
//	}
//}



//// 문제 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//	 	Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		//char z = Integer.toString(age).charAt(0);
//		
//		switch(age/10) {  // 아... 이러면 인티저라 십의 자리만 남네...
//		case 1: System.out.println("=> 당신은 10대"); break;
//		case 2: System.out.println("=> 당신은 20대"); break;
//		case 3: System.out.println("=> 당신은 30대"); break;
//		default: System.out.println("=> 당신은 기타");
//		}
//	}
//}



//// 숙제 문제 4
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 영어 수학 점수를 입력하세요 : ");
//		int k = sc.nextInt();
//		int e = sc.nextInt();
//		int m = sc.nextInt();
//		int t = (k+e+m)/3;
//		
//		switch(t/10) {
//		case 9: System.out.println("=> A학점"); break;
//		case 8: System.out.println("=> B학점"); break;
//		case 7: System.out.println("=> C학점"); break;
//		case 6: System.out.println("=> D학점"); break;
//		default: System.out.println("=> F학점");
//		}
//	}
//}



//// 숙제 문제 5
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int com = (int)(Math.random() * 3 + 1);  // 1, 2, 3 중 난수 하나가 com에 저장. * 끝 수 + 첫 수
//		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 : ");
//		int user = sc.nextInt();
//		
//		System.out.printf("당신은 %d 입니다.", user);
//		System.out.printf("\n컴퓨터는 %d 입니다.", com);
//		
//		switch(user-com) {
//		case -1: case 2: System.out.println("\n졌습니다."); break;
//		case 0: System.out.println("\n비겼습니다."); break;
//		default: System.out.println("\n이겼습니다.");
//		}
//	}
//}



//// 숙제 문제 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 주민등록번호를 입력하세요 : ");
//		String sn = sc.nextLine();
//		char g = sn.charAt(7);
//		
//		switch(g) {
//		case '1': System.out.println("당신은 2000년 이전에 출생한 남자입니다."); break;
//		case '3': System.out.println("당신은 2000년 이후에 출생한 남자입니다."); break;
//		case '2': System.out.println("당신은 2000년 이전에 출생한 여자입니다."); break;
//		case '4': System.out.println("당신은 2000년 이후에 출생한 여자입니다."); break;
//		}
//	}
//}