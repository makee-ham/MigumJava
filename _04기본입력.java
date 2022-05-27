package _04기본입력;


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
//		System.out.print("수1:");
//		int n1 = sc.nextInt();
//		System.out.print("수2:");
//		int n2 = sc.nextInt();
//		System.out.print("수3:");
//		int n3 = sc.nextInt();
//		System.out.printf("입력된 정수 %d %d %d의 합 %d \n", n1, n2, n3, n1+n2+n3);
//	}
//}



//// 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] ar) {
//		Scanner key = new Scanner(System.in);
//		System.out.print("이름?");
//		String str = key.nextLine();
//		System.out.print("안녕하세요?" + str + "님~");
//		System.out.print("당신은 자바를 좋아하는지요?");
//		boolean tf = key.nextBoolean();
//		if(tf==true)
//			System.out.print("역시 자바를 좋아하시는군요");
//		else
//			System.out.print("이런!! 아니었군요ㅠㅠ");
//		
//		System.out.print("당신의 키와 몸무게는?");
//		double ki = key.nextDouble();
//		double we = key.nextDouble();
//		double ch = ki-we;
//		if(ch<100)
//			System.out.print("다이어트 하셔야겠네요");
//		else
//			System.out.print("날씬하시네요");
//	}
//}



//// 4 키보드에서 한문자를 입력 받는 방법_1
//import java.io.IOException;
//class Ex_Prg {
//	public static void main(String[] args) throws IOException{
//		System.out.print("한 문자를 입력하세요: ");
//		char cc = (char)System.in.read();
//		System.out.println("입력한 문자는: " + cc);
//		System.out.println("입력한 문자의 코드값: " + (int)cc);
//	}
//}



//// 4 키보드에서 한문자를 입력 받는 방법_2
//import java.util.Scanner;
//class Ex_Prg {
//	public static void main(String[] args){
//		Scanner cc = new Scanner(System.in);
//		String s;
//		System.out.print("한 문자를 입력하세요: ");
//		s = cc.nextLine();
//		System.out.println(s);  // 여기 문자열은 끝에 null 값이 있다!
//		char ch = s.charAt(0);  // 이렇게 해야 딱 한 문자만 잘린다!
//		System.out.println("입력한 문자는: " + ch);
//		System.out.println("입력한 문자의 코드값: " + (int)ch);
//	}
//}



//// 문제 2
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner i = new Scanner(System.in);
//		System.out.print("3개의 수를 입력하세요 : ");
//		int n1 = i.nextInt();
//		int n2 = i.nextInt();
//		int n3 = i.nextInt();
//		System.out.printf("입력한값 : %d %d %d\n", n1, n2, n3);
//		System.out.printf("합   계 : %d\n", n1+n2+n3);
//		System.out.printf("평   균 : %.2f\n", (n1+n2+n3)/3f);
//	}
//}



//// 문제 7
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		String name;
//		int kor, eng, mat;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("이름 입력 : ");
//		name = sc.nextLine();
//		System.out.printf("국어 입력 : ");
//		kor = sc.nextInt();
//		System.out.printf("영어 입력 : ");
//	    eng = sc.nextInt();
//		System.out.printf("수학 입력 : ");
//		mat = sc.nextInt();
//		
//		System.out.printf("%21s", "** 성적표 **\n\n");
//		System.out.println("이름   국어   영어   수학   총점   평균");
//		System.out.println("================================");
//		System.out.printf("%s   %d   %d   %d   %d   %.2f", name, kor, eng, mat, kor+eng+mat, (kor+eng+mat)/3f);
//	}
//}



//// 숙제 문제 1
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int h, v;
//		System.out.print("가로의 길이를 입력하시오 : ");
//		h = sc.nextInt();
//		System.out.print("세로의 길이를 입력하시오 : ");
//		v = sc.nextInt();
//		System.out.println();
//		System.out.printf("\n=>넓이는 %d 입니다", h*v);
//	}
//}



//// 숙제 문제 3
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double r, a, c;
//		System.out.print("원의 반지름을 입력하세요 : ");
//		r = sc.nextDouble();
//		a = r*r*3.14;
//		c = 2*r*3.14;
//		System.out.printf("원넓이 : %.2f", a);
//		System.out.printf("\n원둘레 : %.2f", c);
//	}
//}



//// 숙제 문제 4
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int fsec, hour, min, sec;
//		System.out.print("초를 입력하시오 : ");
//		fsec = sc.nextInt();
//		hour = fsec/(60*60);
//		min = (fsec/60 - hour*60);
//		sec = (fsec - hour*60*60 - min*60);
//		System.out.printf("%d시간 %d분 %d초입니다.", hour, min, sec);
//	}
//}



//// 숙제 문제 5
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name;
//		int cost, num;
//		System.out.print("상품명 입력 : ");
//		name = sc.nextLine();
//		System.out.print("상품명 입력 : ");
//		cost = sc.nextInt();
//		System.out.print("상품명 입력 : ");
//		num = sc.nextInt();
//		System.out.printf("%s %d대의 가격은 %d입니다", name, num, cost*num);
//	}
//}



//// 숙제 문제 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double n1, n2;
//		System.out.print("첫 번째 수를 입력하세요 : ");
//		n1 = sc.nextDouble();
//		System.out.print("두 번째 수를 입력하세요 : ");
//		n2 = sc.nextDouble();
//		System.out.println();
//		
//		System.out.printf("%.1f + %.1f = %.1f", n1, n2, n1+n2);
//		System.out.printf("\n%.1f - %.1f = %.1f", n1, n2, n1-n2);
//		System.out.printf("\n%.1f * %.1f = %.1f", n1, n2, n1*n2);
//		System.out.printf("\n%.1f / %.1f = %.1f", n1, n2, n1/n2);
//	}
//}



//// 숙제 문제 8
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int _500, _100, _50, _10;
//		System.out.print("500원 : ");
//		_500 = sc.nextInt();
//		System.out.print("100원 : ");
//		_100 = sc.nextInt();
//		System.out.print("50원 : ");
//		_50 = sc.nextInt();
//		System.out.print("10원 : ");
//		_10 = sc.nextInt();
//		System.out.printf("\n=>동전의 금액 : %d원", 500*_500+100*_100+50*_50+10*_10);
//	}
//}