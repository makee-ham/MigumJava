package _05제어문if;

//// 문제 7
//import java.util.Scanner;
//class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int kor, eng, mat;
//		System.out.print("국어 영어 수학 점수를 입력하세요 : ");
//		kor = sc.nextInt();
//		eng = sc.nextInt();	
//		mat = sc.nextInt();
//		
//		if(((kor+eng+mat)/3 >= 60) && (kor>=40&&eng>=40&&mat>=40)) {
//			System.out.println("=>축하합니다! 합격입니다~");
//		}
//		else {
//			System.out.println("=>안됐군요 ㅠㅠ 불합격입니다~");
//		}
//	}
//}



//// 문제 9
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1, n2;
//		String op;
//		
//		System.out.print("첫번째수 : ");
//		n1 = sc.nextInt();
//		System.out.print("연산자(+ - * /) : ");
//		sc.nextLine();
//		op = sc.nextLine();
//		System.out.print("두번째수 : ");
//		n2 = sc.nextInt();
//		
//		
//		if(op.equals("+")) System.out.printf("%d %s %d = %d", n1, op, n2, n1+n2);
//		else if(op.equals("-")) System.out.printf("%d %s %d = %d", n1, op, n2, n1-n2);
//		else if(op.equals("*")) System.out.printf("%d %s %d = %d", n1, op, n2, n1*n2);
//		else if(op.equals("/")) System.out.printf("%d %s %d = %d", n1, op, n2, n1/n2);
//	}
//}



//// 문제 14
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s; char ch;
//		
//		System.out.print("영문자를 입력하세요 : ");
//		s = sc.nextLine();
//		ch = s.charAt(0);
//		
//		if('A'<=ch && 'Z'>=ch) System.out.println("대문자입니다");
//		else if('a'<=ch && 'z'>=ch) System.out.println("소문자입니다");
//	}
//}



//// 숙제 문제 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력 하세요 : ");
//		int n = sc.nextInt();
//		
//		if(n > 0) {
//			System.out.printf("=>%d은 양수입니다.", n);
//		}
//		else if(n == 0) {
//			System.out.printf("=>%d은 0입니다.", n);
//		}
//		else {
//			System.out.printf("=>%d은 음수입니다.", n);
//		}
//	}
//}



//// 숙제 문제 2
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력 하세요 : ");
//		int age = sc.nextInt();
//		
//		if(age<18) {
//			System.out.print("=>관람료는 무료 입니다.");
//		}
//		else {
//			System.out.print("=>관람료는 1500원입니다.");
//		}
//	}
//}



//// 숙제 문제 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		
//		if(n1 > n2) {
//			System.out.printf("=>큰 수는 %d입니다.", n1);
//		}
//		else {
//			System.out.printf("=>큰 수는 %d입니다.", n2);
//		}
//	}
//}



//// 숙제 문제 4
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int n = sc.nextInt();
//		
//		if(n%2 == 0) {
//			System.out.printf("=>%d는 짝수입니다", n);
//		}
//		else {
//			System.out.printf("=>%d는 홀수입니다", n);
//		}
//	}
//}



//// 숙제 문제 5
//import java.util.Scanner;
//public class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("키를 입력하세요%5s", ": ");
//		int h = sc.nextInt();
//		System.out.print("몸무게를 입력하세요 : ");
//		int w = sc.nextInt();
//		
//		if((h-100)*0.9 < w) {
//			System.out.println("다이어트가 필요하다.");
//		}
//		else {
//			System.out.println("다이어트가 필요없다.");
//		}
//	}
//}



//// 숙제 문제 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 영어 수학 점수를 입력하세요 : ");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		
//		if((kor+eng+mat)/3 >= 60) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
//	}
//}



//// 숙제 문제 8
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int n = sc.nextInt();
//		
//		if(n%2==0 && n%3==0) {
//			System.out.printf("%d는 2와 3의 공배수입니다.", n);
//		}
//		else {
//			System.out.printf("%d는 2와 3의 공배수가 아닙니다.", n);
//		}
//	}
//}



//// 숙제 문제 10
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몸무게를 입력하세요 : ");
//		double w = sc.nextDouble();
//		
//		if(w<63.5) {
//			System.out.println("당신은 Light급 입니다.");
//		}
//		else if(w >= 63.5 && w < 67) {
//			System.out.println("당신은 Welter급 입니다.");
//		}
//		else if(w >= 67 && w < 71) {
//			System.out.println("당신은 Light Welter급 입니다.");
//		}
//		else if(w >= 71 && w < 75) {
//			System.out.println("당신은 Middle급 입니다.");
//		}
//		else if(w >= 75 && w < 81) {
//			System.out.println("당신은 Light Heavy급 입니다.");
//		}
//		else {
//			System.out.println("당신은 Heavy급 입니다.");
//		}
//	}
//}



//// 숙제 문제 11
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력하세요 : ");
//		int year = sc.nextInt();
//		
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.printf("%d년은 윤년입니다.", year);
//		}
//		else {
//			System.out.printf("%d년은 평년입니다.", year);
//		}
//	}
//}



//// 숙제 문제 12
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		if(10<=age && 19>=age) {
//			System.out.println("10대");
//		}
//		else if(20<=age && 29>=age) {
//			System.out.println("20대");
//		}
//		else if(30<=age && 39>=age) {
//			System.out.println("30대");
//		}
//		else {
//			System.out.println("기타");
//		}
//	}
//}



//// 숙제 문제 13
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용량을 입력하세요 : ");
//		int w = sc.nextInt();
//		if(w <= 50) {
//			System.out.printf("= > 전기요금 : %d 원", w*34);
//		}
//		else if(w > 50 && w <= 100) {
//			System.out.printf("= > 전기요금 : %d 원", 50*34 + (w-50)*81);
//		}
//		else {
//			System.out.printf("= > 전기요금 : %d 원", 50*34 + 50*81 + (w-100)*122);
//		}
//	}
//}



//// 숙제 문제 15
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("영문자를 입력하세요 : ");
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



//// 숙제 문제 16
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자를 입력하세요 : ");
//		String s = sc.nextLine();
//		char c = s.charAt(0);
//		
//		if('0'<= c && '9'>=c) {
//			System.out.println("=> 숫자 입니다.");
//		}
//		else if('A'<=c && 'Z'>=c || 'a'<=c && 'z'>=c) {
//			System.out.println("=> 영문자 입니다.");
//		}
//		else {
//			System.out.println("=> 특수문자 입니다.");
//		}
//	}
//}



//// 숙제 문제 17
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a, b, c, temp;
//		System.out.print("3개의 수 : ");
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
//		System.out.printf("=> 큰 순서대로 출력 : %d %d %d", a, b, c);
//	}
//}



//// 숙제 문제 18
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		String ddi;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("올해의 연도를 입력하시오 : ");
//		int tYear = sc.nextInt();
//		System.out.print("태어난 연도를 입력하시오 : ");
//		int bYear = sc.nextInt();
//		
//		if(tYear%12==4) {
//			ddi = "쥐";
//		}
//		else if(tYear%12==5) {
//			ddi = "소";
//		}
//		else if(tYear%12==6) {
//			ddi = "호랑이";
//		}
//		else if(tYear%12==7) {
//			ddi = "토끼";
//		}
//		else if(tYear%12==8) {
//			ddi = "용";
//		}
//		else if(tYear%12==9) {
//			ddi = "뱀";
//		}
//		else if(tYear%12==10) {
//			ddi = "말";
//		}
//		else if(tYear%12==11) {
//			ddi = "양";
//		}
//		else if(tYear%12==0) {
//			ddi = "원숭이";
//		}
//		else if(tYear%12==1) {
//			ddi = "닭";
//		}
//		else if(tYear%12==2) {
//			ddi = "개";
//		}
//		else {
//			ddi = "돼지";
//		}
//		System.out.printf("%d살이고 %s띠입니다.", tYear-bYear, ddi);
//	}
//}



//// 숙제 문제 19
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("어떤 도형의 면적을 구할까요?(R-사각형, T-삼각형, C-원) : ");
//		String temp = sc.nextLine();
//		//char figure = temp.charAt(0);
//		
//		if(temp.equals("R")) {
//			System.out.print(" 가로 : ");
//			int r = sc.nextInt();
//			System.out.print(" 세로 : ");
//			int c = sc.nextInt();
//			System.out.printf(" ==> 사각형의 면적은 %d입니다", r*c);
//		}
//		else if(temp.equals("T")) {
//			System.out.print(" 밑변 : ");
//			int l = sc.nextInt();
//			System.out.print(" 높이 : ");
//			int h = sc.nextInt();
//			System.out.printf(" ==> 삼각형의 면적은 %d입니다", l*h/2);
//		}
//		else {
//			System.out.print(" 반지름 : ");
//			double r = sc.nextDouble();
//			System.out.printf(" ==> 원의 넓이는 %.2f입니다", r*r*3.14);
//		}
//	}
//}



//// 숙제 문제 20
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a, h, w;
//		double k;
//		
//		System.out.print("나이를 입력하세요 : ");
//		a = sc.nextInt();
//		System.out.print("키를 입력하세요 : ");
//		h = sc.nextInt();
//		System.out.print("체중을 입력하세요 : ");
//		w = sc.nextInt();
//
//		k = w/((h*0.01)*(h*0.01));
//		
//		if(a>=20 && a<=29) {
//			if(k <= 17.9) {
//				System.out.println("=>당신은 저체중입니다");
//			}
//			else if(k>=18 && k<=23) {
//				System.out.println("=>당신은 표준체중입니다");
//			}
//			else if(k>=24 && k<=30) {
//				System.out.println("=>당신은 과체중입니다");
//			}
//			else {
//				System.out.println("=>당신은 비만입니다");
//			}
//		}
//		else {
//			if(k <= 18.4) {
//				System.out.println("=>당신은 저체중입니다");
//			}
//			else if(k>=18.5 && k<=24) {
//				System.out.println("=>당신은 표준체중입니다");
//			}
//			else if(k>=25 && k<=30) {
//				System.out.println("=>당신은 과체중입니다");
//			}
//			else {
//				System.out.println("=>당신은 비만입니다");
//			}
//		}
//	}
//}