package _07for;

//// ���� 7
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



//// ���� 8(2)
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for(char a = 'A', z = 'Z'; a<='Z'&& z>='A'; a++, z--) {
//			System.out.printf("%s%s", a, z);
//		}
//	}
//}



//// ���� ���� 2
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



//// ���� ���� 4
//class Ex_Prg {
//	public static void main(String[] args) {
//		for(int i=1; i<=9; i++) {
//			System.out.printf("3 * %d = %d\n", i, 3*i);
//		}
//	}
//}



//// ���� ���� 5
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ���� ��� �ұ�� : ");
//		int n = sc.nextInt();
//		for(int i=1; i<=9; i++) {
//			System.out.printf("%d * %d = %d\n", n, i, n*i);
//		}
//	}
//}



//// ���� ���� 6
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



////���� ���� 8-1, 8-3
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



//// ���� ���� 9
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("�Է��� ������ ������? : ");
//		int n = sc.nextInt();
//		for(int i=1; i<=n; i++) {
//			sum += i;
//		}
//		System.out.printf("��=%d", sum);
//	}
//}



//// ���� ���� 10
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����#�� ���� : ");
//		int r = sc.nextInt();
//		for(int i=1; i<=r; i++) {
//			System.out.print("#");
//		}
//	}
//}



//// ���� ���� 11
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int count = 0;
//		for(; i<=n; i++) {
//			if(i%3==0) {
//				count++;
//			}
//		}
//		System.out.printf("1���� %d ���̿� �����ϴ� 3�� ����� %d���Դϴ�.", n, count);
//	}
//}



//// ���� ���� 12
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� : ");
//		int n = sc.nextInt();
//		System.out.printf("%d�� �����", n);
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				System.out.printf(" %d", i);
//			}
//		}
//		System.out.print("�Դϴ�.");
//	}
//}



//// ���� ���� 13
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��1 : ");
//		int n1 = sc.nextInt();
//		System.out.print("��2 : ");
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
//		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.", n1, n2, b);
//	}
//}



//// ���� ���� 14
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��1 : ");
//		int n1 = sc.nextInt();
//		System.out.print("��2 : ");
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
//		System.out.printf("%d�� %d�� �ּҰ������ %d�Դϴ�.", n1, n2, lcm);
//	}
//}



//// ���� ���� 15
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int s = 100;
//		int n = 0;
//		for(int i=1; s>0; i++) {
//			s -= i;
//			n = i;
//		}
//		System.out.printf("s�� ���� %d, n�� ���� %d", s, n);
//	}
//}



//// ���� ���� 16
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է��ϼ��� : ");
//		int n = sc.nextInt();
//		int a = 0;
//		
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				a++;
//			}
//		}
//		if(a==2) {
//			System.out.printf("%d�� �Ҽ�", n);
//		}
//		else {
//			System.out.printf("%d�� �Ҽ��� �ƴ�", n);
//		}
//		
//	}
//}



//// ���� ���� 17
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1, n=2; i<=10; i++, n+=6) {
//			System.out.printf("%d+", n);
//			sum += n;
//		}
//		System.out.printf("\n��=%d", sum);
//	}
//}



//// ���� ���� 18
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1, n=2; i<=10; i++, n*=3) {
//			System.out.printf("%d ", n);
//			sum += n;
//		}
//		System.out.printf("\n��=%d", sum);
//	}
//}



//// ���� ���� 19
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ ���� : ");
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
//		System.out.printf("\n��=%d", sum);
//	}
//}



//// ���� ���� 20
//public class Ex_Prg {
//	public static void main(String[] args) {
//		// 1
//		int sum1 = 0, n = 1;
//		for(int i=1; i<=7; i++) {
//			System.out.printf(" %d +", n);
//			sum1 += n;
//			n += i;
//		}
//		System.out.printf("\n �� = %d", sum1);
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
//		System.out.printf("\n �� = %d", sum2);
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
//		System.out.printf("\n �� = %d", sum3);
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
//		System.out.printf("\n �� = %d", sum4);
//	}
//}



//// ���� ���� 21
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=1; i<=50; i++) {
//			if(i%5==0 && i%2!=0) {
//				System.out.printf("%d ", i);
//				sum += i;
//			}
//		}
//		System.out.printf("\n�� = %d", sum);
//	}
//}



//// ���� ���� 22
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ù ��° �� : ");
//		int n1 = sc.nextInt();
//		System.out.print("�� ��° �� : ");
//		int n2 = sc.nextInt();
//		int sum1 = 0, sum2 = 0;
//		
//		if(n1>=n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		
//		System.out.print("������ �� : ");
//		
//		for(int i=n1+1; i<n2; i++) {
//			System.out.printf("%d ", i);
//			sum1 += i;
//			if(i%2!=0) {
//				sum2 += i;
//			}
//		}
//		System.out.printf("\n�� = %d", sum1);
//		System.out.printf("\nȦ���� �� = %d", sum2);
//	}
//}



//// ���� 27
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = 0, c = 10;
//		
//		for(int i=1; i<=10; i++) {
//			System.out.printf("%d��° �� : ", i);
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
//		System.out.printf("=> 10�� ���� ����� �� : %d", n);
//	}
//}



//// ���� 29
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double l = 0, s = 1000, sum = 0, c = 0;
//		for(int i=1; ; i++) {
//			c = i;
//			System.out.print("�����Ը� �Է��Ͻÿ�(0:����) : ");
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
//		System.out.printf("�ִ밪 : %.2f", l);
//		System.out.printf("\n�ּҰ� : %.2f", s);
//		System.out.println();
//		System.out.println();
//		System.out.printf("�� = %.2f", sum);
//		System.out.printf("\n�� = %.2f", sum/(c-1));
//	}
//}



//// ���� 30
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int answer = (int)(Math.random()*100)+1;
//		for( ; ; ) {
//			System.out.print("������ �������� : ");
//			int guess = sc.nextInt();
//			if(guess < 0) {
//				break;
//			}
//			if(guess < answer) {
//				System.out.printf("%d���ٴ� ū ���� ��������~\n", guess);
//			}
//			else if(guess > answer) {
//				System.out.printf("%d���ٴ� ���� ���� ��������~\n", guess);
//			}
//			else {
//				System.out.println("�����Դϴ�!!!");
//				break;
//			}
//		}
//	}
//}



//// ���� 31
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է��ϼ��� : ");
//		int n = sc.nextInt();
////		int save = n;
//        int j;
//		
//		for(;;)
//		{
//			for(j=2; j<n; j++)  // 4, 6 ���� �տ��� �̹� �ɷ�����
//			{
//				if(n%j==0) {
//					System.out.print(j+"*");
//					n /= j;
//					break;  // �̷ν� j�� �ٽ� 2�� �ȴ�. ó���� ���ѹݺ� for�� ���ư��� ����.
//				}
//			}
//			// n�� �Ҽ��� ���� ���, ������ �Ѵ�.
//			if(j==n) {
//				System.out.println(n);
//				break;  // ���ѹݺ� Ż��, ����.
//			}
//		}
//		
//// ���� �Ҽ��� ���� �� �װŷ� �������� �ߴ� ����
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



//// ���� ���� 23
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Է� : ");
//		int n = sc.nextInt();
//		String s = Integer.toString(n);
//		int d = s.length();
//		int sum = 0;
//		System.out.print("�� �ڸ� : ");
//		for(int i=0; i<=(d-1); i++) {
//			System.out.printf("%c ", s.charAt(i));
//			sum += Character.getNumericValue(s.charAt(i));
//		}
//		System.out.printf("\n�� = %d", sum);
//	}
//}



//// ���� ���� 24
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Է� : ");
//		int n = sc.nextInt();
//		String s = Integer.toString(n);
//		int d = s.length();
//		System.out.print("output => ");
//		for(int i=(d-1); i>=0; i--) {
//			System.out.print(s.charAt(i));
//		}
//	}
//}



//// ���� ���� 25
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0, count = 0;
//		for(int i=1; ; i++) {
//			System.out.print("������ �Է��ϼ��� : ");
//			int temp = sc.nextInt();
//			if(temp==999) {
//				break;
//			}
//			sum += temp;
//			count += 1;
//		}
//		System.out.printf("�� = %d", sum);
//		System.out.printf("\n��� = %d", sum/count);
//	}
//}



//// ���� ���� 26
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�Էµ� ���� ������ : ");
//		int n = sc.nextInt();
//		
//		int la = 0, sm = 100000000;
//		
//		for(int i=1; i<=n; i++) {
//			System.out.printf("%d��° �� : ", i);
//			int temp = sc.nextInt();
//			if(temp>la) {
//				la = temp;
//			}
//			if (temp<sm) {
//				sm = temp;
//			}
//		}
//		System.out.println();
//		System.out.printf("�ִ밪 = %d", la);
//		System.out.printf("\n�ּҰ� = %d", sm);
//	}
//}



//// ���� ���� 28
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
//		System.out.printf("Ȧ���� �� = %d", oddSum);
//		System.out.printf("\n¦���� �� = %d", evenSum);
//		System.out.printf("\n3�� ����� �� = %d", threeSum);
//		System.out.printf("\n3�� 4�� ������� ���� = %d", tfN);
//		System.out.printf("  �� = %d", tfSum);
//	}
//}



//// ���� ���� 33
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