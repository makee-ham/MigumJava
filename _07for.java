package _07for;

//// 문제 7
//public class Ex_Prg {
//	public static void main(String[] args) {
//		System.out.print("6!=");
//		int result = 1;
//		for(int i=6; i>0; i--) {
//			System.out.printf("%d*", i);
//			result *= i;
//		}
//		System.out.printf("=%d", result);
//	}
//}



//// 문제 8(2)
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for(char a = 'A', z = 'Z'; a<='Z'&& z>='A'; a++, z--) {
//			System.out.printf("%s%s", a, z);
//		}
//	}
//}



//// 숙제 문제 2
//public class Ex_Prg {
//	public static void main(String[] args) {
//		// (1)
//		for(int i=1; i<=10; i++) {
//			if(i % 2 == 0) {
//				System.out.printf("%d ", i);
//			}
//		}
//      // (2)
//		System.out.println();
//		for(int i=9; i>=1; i--) {
//			System.out.printf("%d ", i);
//		}
//      // (3)
//		System.out.println();
//		for(int i=3; i<=15; i+=3) {
//			System.out.printf("%d ", i);
//		}
//	}
//}



//// 숙제 문제 4
//class Ex_Prg {
//	public static void main(String[] args) {
//		for(int i=1; i<=9; i++) {
//			System.out.printf("3 * %d = %d\n", i, 3*i);
//		}
//	}
//}



//// 숙제 문제 5
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단을 출력 할까요 : ");
//		int n = sc.nextInt();
//		for(int i=1; i<=9; i++) {
//			System.out.printf("%d * %d = %d\n", n, i, n*i);
//		}
//	}
//}



//// 숙제 문제 6
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.printf("%d+", i);
//			sum += i;
//		}
//		System.out.printf("=%d", sum);
//	}
//}



////숙제 문제 8-1, 8-3
//public class Ex_Prg {
//	public static void main(String[] args) {
//		// (1)
//		for(char c='z'; c>='a'; c--) {
//			System.out.printf("%c", c);
//		}
//		
//		// (3)
//		System.out.println();
//		for(char a='a', z='Z'; a<='z' && z>='A'; a++, z--) {
//			System.out.printf("%c%c", a, z);
//		}
//	}
//}



//// 숙제 문제 9
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("입력할 숫자의 개수는? : ");
//		int n = sc.nextInt();
//		for(int i=1; i<=n; i++) {
//			sum += i;
//		}
//		System.out.printf("합=%d", sum);
//	}
//}



//// 숙제 문제 10
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("막대#의 높이 : ");
//		int r = sc.nextInt();
//		for(int i=1; i<=r; i++) {
//			System.out.print("#");
//		}
//	}
//}



//// 숙제 문제 11
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int count = 0;
//		for(; i<=n; i++) {
//			if(i%3==0) {
//				count++;
//			}
//		}
//		System.out.printf("1부터 %d 사이에 존재하는 3의 배수는 %d개입니다.", n, count);
//	}
//}



//// 숙제 문제 12
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수 : ");
//		int n = sc.nextInt();
//		System.out.printf("%d의 약수는", n);
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				System.out.printf(" %d", i);
//			}
//		}
//		System.out.print("입니다.");
//	}
//}



//// 숙제 문제 13
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수1 : ");
//		int n1 = sc.nextInt();
//		System.out.print("수2 : ");
//		int n2 = sc.nextInt();
//		int a, b=1;
//		
//		if(n1>n2) {
//			a = n2;
//		}
//		else {
//			a = n1;
//		}
//		
//		for(int i=1; i<=a; i++) {
//			if(n1%i==0 && n2%i==0) {
//				b = i;
//			}
//		}
//		System.out.printf("%d과 %d의 최대공약수는 %d입니다.", n1, n2, b);
//	}
//}



//// 숙제 문제 14
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수1 : ");
//		int n1 = sc.nextInt();
//		System.out.print("수2 : ");
//		int n2 = sc.nextInt();
//		int lcm=0;
//		
//		if(n1<n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		
//		for(int i=2; ; i++) {
//			if((n1*i)%n1==0 && (n2*i)%n2==0) {
//				lcm = n1*i;
//				break;
//			}
//		}
//		System.out.printf("%d와 %d의 최소공배수는 %d입니다.", n1, n2, lcm);
//	}
//}



//// 숙제 문제 15
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int s = 100;
//		int n = 0;
//		for(int i=1; s>0; i++) {
//			s -= i;
//			n = i;
//		}
//		System.out.printf("s의 값은 %d, n의 값은 %d", s, n);
//	}
//}



//// 숙제 문제 16
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int n = sc.nextInt();
//		int a = 0;
//		
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				a++;
//			}
//		}
//		if(a==2) {
//			System.out.printf("%d는 소수", n);
//		}
//		else {
//			System.out.printf("%d는 소수가 아님", n);
//		}
//		
//	}
//}



//// 숙제 문제 17
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1, n=2; i<=10; i++, n+=6) {
//			System.out.printf("%d+", n);
//			sum += n;
//		}
//		System.out.printf("\n합=%d", sum);
//	}
//}



//// 숙제 문제 18
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1, n=2; i<=10; i++, n*=3) {
//			System.out.printf("%d ", n);
//			sum += n;
//		}
//		System.out.printf("\n합=%d", sum);
//	}
//}



//// 숙제 문제 19
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수열의 개수 : ");
//		int n = sc.nextInt();
//		int a = 0, b = 0, c = 1;
//		int sum = 0;
//		
//		for(int i=1; i<=n; i++) {
//			System.out.printf("%d+", c);
//			sum += c;
//			a = b;
//			b = c;
//			c = a+b;
//		}
//		System.out.printf("\n합=%d", sum);
//	}
//}



//// 숙제 문제 20
//public class Ex_Prg {
//	public static void main(String[] args) {
//		// 1
//		int sum1 = 0, n = 1;
//		for(int i=1; i<=7; i++) {
//			System.out.printf(" %d +", n);
//			sum1 += n;
//			n += i;
//		}
//		System.out.printf("\n 합 = %d", sum1);
//		
//		// 2
//		System.out.println();
//		int sum2 = 0;
//		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {
//				System.out.printf(" + %d", i);
//				sum2 += i;
//			}
//			else {
//				System.out.printf(" - %d", i);
//				sum2 -= i;				
//			}
//		}
//		System.out.printf("\n 합 = %d", sum2);
//			
//		// 3
//		System.out.println();
//		int sum3 = 0;
//		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {
//				System.out.printf(" + %d", i*5);
//				sum3 += i*5;
//			}
//			else {
//				System.out.printf(" - %d", i*5);
//				sum3 -= i*5;				
//			}
//		}
//		System.out.printf("\n 합 = %d", sum3);
//		
//		// 4
//		System.out.println();
//		int sum4 = 0, n2 = 1;
//		for(int i=1; i<=7; i++) {
//			if(i%2 != 0) {
//				System.out.printf(" + %d", n2);
//				sum4 += n2;
//				n2 += i;
//			}
//			else {
//				System.out.printf(" - %d", n2);
//				sum4 -= n2;
//				n2 += i;
//			}
//		}
//		System.out.printf("\n 합 = %d", sum4);
//	}
//}



//// 숙제 문제 21
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1; i<=50; i++) {
//			if(i%5==0 && i%2!=0) {
//				System.out.printf("%d ", i);
//				sum += i;
//			}
//		}
//		System.out.printf("\n합 = %d", sum);
//	}
//}



//// 숙제 문제 22
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 수 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두 번째 수 : ");
//		int n2 = sc.nextInt();
//		int sum1 = 0, sum2 = 0;
//		
//		if(n1>=n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		
//		System.out.print("사이의 수 : ");
//		
//		for(int i=n1+1; i<n2; i++) {
//			System.out.printf("%d ", i);
//			sum1 += i;
//			if(i%2!=0) {
//				sum2 += i;
//			}
//		}
//		System.out.printf("\n합 = %d", sum1);
//		System.out.printf("\n홀수의 합 = %d", sum2);
//	}
//}



//// 문제 27
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = 0, c = 10;
//		
//		for(int i=1; i<=10; i++) {
//			System.out.printf("%d번째 수 : ", i);
//			int t = sc.nextInt();
//			if(t<=10) {
//				if((10-t)<c) {
//					n = t;
//					c = 10-t;
//				}
//			}
//			else {
//				if((t-10)<c) {
//					n = t;
//					c = t-10;
//				}
//			}
//		}
//		System.out.printf("=> 10에 가장 가까운 수 : %d", n);
//	}
//}



//// 문제 29
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double l = 0, s = 1000, sum = 0, c = 0;
//		for(int i=1; ; i++) {
//			c = i;
//			System.out.print("몸무게를 입력하시오(0:종료) : ");
//			double w = sc.nextDouble();
//			if(w == 0) {
//				break;
//			}
//			sum += w;
//			if(w>l) {
//				l = w;
//			}
//			if(w<s) {
//				s = w;
//			}
//		}
//		System.out.println();
//		System.out.printf("최대값 : %.2f", l);
//		System.out.printf("\n최소값 : %.2f", s);
//		System.out.println();
//		System.out.println();
//		System.out.printf("합 = %.2f", sum);
//		System.out.printf("\n합 = %.2f", sum/(c-1));
//	}
//}



//// 문제 30
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = (int)(Math.random()*100)+1;
//		for( ; ; ) {
//			System.out.print("정답을 넣으세요 : ");
//			int guess = sc.nextInt();
//			if(guess < 0) {
//				break;
//			}
//			if(guess < answer) {
//				System.out.printf("%d보다는 큰 수를 넣으세요~\n", guess);
//			}
//			else if(guess > answer) {
//				System.out.printf("%d보다는 작은 수를 넣으세요~\n", guess);
//			}
//			else {
//				System.out.println("정답입니다!!!");
//				break;
//			}
//		}
//	}
//}



//// 문제 31
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int n = sc.nextInt();
////		int save = n;
//        int j;
//		
//		for(;;)
//		{
//			for(j=2; j<n; j++)  // 4, 6 등은 앞에서 이미 걸러진다
//			{
//				if(n%j==0) {
//					System.out.print(j+"*");
//					n /= j;
//					break;  // 이로써 j는 다시 2가 된다. 처음의 무한반복 for로 돌아가기 때문.
//				}
//			}
//			// n이 소수로 남은 경우, 끝내야 한다.
//			if(j==n) {
//				System.out.println(n);
//				break;  // 무한반복 탈출, 종료.
//			}
//		}
//		
//// 나의 소수를 구한 뒤 그거로 나누고자 했던 뻘짓
////		for(int i=2; ; i++) {
////			if(save>n) {
////				if(save/(i-1) == n) {
////					i -= 1;
////				}
////			}
////			int temp = 0, t = 1;
////			for(; t<=i; t++) {
////				if(i%t==0) {
////					temp += 1;
////				}
////			}
////			if(temp == 2) {
////				if(n % i == 0) {
////					System.out.printf(" %d *", i);
////					n /= i;
////				}
////			}
////			else {
////				continue;
////			}
////		}
//	}
//}



//// 숙제 문제 23
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int n = sc.nextInt();
//		String s = Integer.toString(n);
//		int d = s.length();
//		int sum = 0;
//		System.out.print("각 자리 : ");
//		for(int i=0; i<=(d-1); i++) {
//			System.out.printf("%c ", s.charAt(i));
//			sum += Character.getNumericValue(s.charAt(i));
//		}
//		System.out.printf("\n합 = %d", sum);
//	}
//}



//// 숙제 문제 24
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int n = sc.nextInt();
//		String s = Integer.toString(n);
//		int d = s.length();
//		System.out.print("output => ");
//		for(int i=(d-1); i>=0; i--) {
//			System.out.print(s.charAt(i));
//		}
//	}
//}



//// 숙제 문제 25
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0, count = 0;
//		for(int i=1; ; i++) {
//			System.out.print("정수를 입력하세요 : ");
//			int temp = sc.nextInt();
//			if(temp==999) {
//				break;
//			}
//			sum += temp;
//			count += 1;
//		}
//		System.out.printf("합 = %d", sum);
//		System.out.printf("\n평균 = %d", sum/count);
//	}
//}



//// 숙제 문제 26
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력될 수의 개수는 : ");
//		int n = sc.nextInt();
//		
//		int la = 0, sm = 100000000;
//		
//		for(int i=1; i<=n; i++) {
//			System.out.printf("%d번째 수 : ", i);
//			int temp = sc.nextInt();
//			if(temp>la) {
//				la = temp;
//			}
//			if (temp<sm) {
//				sm = temp;
//			}
//		}
//		System.out.println();
//		System.out.printf("최대값 = %d", la);
//		System.out.printf("\n최소값 = %d", sm);
//	}
//}



//// 숙제 문제 28
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int oddSum=0, evenSum=0, threeSum=0, tfN=0, tfSum=0;
//		for(int i=1; i<=30; i++) {
//			if(i%2!=0) {
//				oddSum += i;
//			}
//			else {
//				evenSum += i;
//			}
//			if(i%3==0) {
//				threeSum += i;
//			}
//			if(i%3==0 && i%4==0) {
//				tfN += 1;
//				tfSum += i;
//			}
//		}
//		System.out.printf("홀수의 합 = %d", oddSum);
//		System.out.printf("\n짝수의 합 = %d", evenSum);
//		System.out.printf("\n3의 배수의 합 = %d", threeSum);
//		System.out.printf("\n3과 4의 공배수의 개수 = %d", tfN);
//		System.out.printf("  합 = %d", tfSum);
//	}
//}



//// 숙제 문제 33
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//	}
//}