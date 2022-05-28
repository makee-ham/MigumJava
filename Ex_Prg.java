package _08다중for;

//// 문제 34
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0;
//		//  1 + 1+2 + 1+2+3 + ... + 1+~+10
//		for (int i = 0; i < 10; i++) {
//			for (int j = 1; j < i + 2; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
//	}
//}



//// 문제 35
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int sum = 0, p = 1;
//		for (int i = 0; ; i++) {
//			int j = i + 1;
//			int n = j * p;
//			sum += n;
//			// 몇까지 더해야 총합이 100 이상이 될까?
//			if (sum >= 100) {
//				System.out.println(j);
//				break;
//			}
//			p *= -1;
//		}
//	}
//}



//// 문제 1
//public class Ex_Prg {
//	public static void main(String[] args) {
//		// (1)
//		for (int i = 0; i < 3; i++) {
//			int j = i + 1;
//			System.out.printf("%d: %d%d%d%d", j, j, j, j, j);
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (2)
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d: ", i + 1);
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%d", j + 1);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (3)
//		for (int i = 0; i < 3; i++) {
//			System.out.printf("%d: ", i + 1);
//			for (int j = 1; j < i + 2; j++) {
//				System.out.printf("%d", j);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (4)
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 2
//public class Ex_Prg {
//	public static void main(String[] args) {
//		// (1)
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (2)
//		for (int i = 0; i < 3; i++) {
//			for (int j = 3 - i; j > 0; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (3)
//		for (int i = 0; i < 3; i++) {
//			for (int j = 2 - i; j > 0; j--) {
//				System.out.print("  ");
//			}
//			for (int k = 1; k < i + 2; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (4)
//		for (int i = 0; i < 3; i++) {
//			for (int j = 2 - i; j > 0; j--) {
//				System.out.print("  ");
//			}
//			for (int k = 1; k < (i + 1) * 2; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (5)
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("  ");
//			}
//			for (int k = 1; k < (3 - i) * 2; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (6)
//		int n6 = 1;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 1; j < i + 2; j++) {
//				System.out.printf("%d ", n6);
//				n6 += 1;
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (7)
//		for (int i = 0; i < 3; i++) {
//			int n7 = 1;
//			for (int j = 1; j < i + 2; j++) {	
//				System.out.printf("%d ", n7);
//				n7 += 1;
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// (8)
//		int n8 = 9;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("  ");
//			}
//			for (int k = 1; k < (3 - i) * 2; k++) {
//				System.out.printf("%d ", n8);
//				n8 -= 1;
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 3
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d*%d=%d ", i, j, i * j);
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 4
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.printf("%d*%d=%d ", j, i, i * j);
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 5
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%d   ", i + 1);
//			for (int j = 2; j - 2 < j; j++) {
//			System.out.printf("%d   ", j);
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 6
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			if (i == 0) {
//				System.out.print("    ");
//				continue;
//			}
//			System.out.printf("%d   ", i);
//		}
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			if (i == 0) {
//				System.out.print("    ");
//				continue;
//			}
//			System.out.print("****");
//		}
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d*  ", i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d   ", i * j);
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 7
//public class Ex_Prg {
//	public static void main(String[] args) {
//		for (int i = 0; i < 26; i++) {
//			for (char j = (char) ('A' + i); j <= 'Z'; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 8
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1, n2;
//		
//		while (true) {
//			System.out.print("시작값 : ");
//			n1 = sc.nextInt();
//			System.out.print("끝값  : ");
//			n2 = sc.nextInt();
//			if (n1 > n2) {
//				System.out.print("다시 입력하세요\n");
//			}
//			else {
//				break;
//			}
//		}
//		
//		System.out.println();
//		
//		for (int j = n1; j <= n2; ) {
//			for (int i = 0; i < 3; i++, j++) {
//				System.out.printf("%d  ", j);
//			}
//			System.out.println();
//		}
//	}
//}



//// 문제 9
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int count2 = 0;
//		for (int i = 2; i <= 200; i++) {
//			int count1 = 0;
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					count1 += 1;
//				}
//			}
//			if (count1 == 2) {
//				System.out.printf("%d  ", i);					
//				count2 += 1;
//			}
//			if (count2 == 5) {
//				count2 = 0;
//				System.out.println();
//			}
//		}
//	}
//}



//// 문제 10
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int rowCount = 0, columnCount = 0, pageNum = 1, sum = 0;
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (i == j) {
//					continue;
//				}
//				for (int k = 1; k <= 9; k++) {
//					if (j == k) {
//						continue;
//					}
//					System.out.printf("%d%d%d   ", i, j, k);
//					sum += 1;
//					rowCount += 1;
//					if (rowCount == 5) {
//						System.out.println();
//						rowCount = 0;
//						columnCount += 1;
//					}
//					if (columnCount == 20) {
//						System.out.println();
//						System.out.println(pageNum);
//						System.out.println();
//						pageNum += 1;
//						columnCount = 0;
//					}
//				}
//			}
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println(pageNum);
//		System.out.println();
//		System.out.printf("총 %d개", sum);
//	}
//}



//// C 6
//import java.util.Scanner;
//public class Ex_Prg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		if (n1 > n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		
//		for (int i = 1; ; i++) {
//			if ((n1 * i) % n2 == 0) {
//				System.out.printf("%d와 %d의 최소공배수는 %d입니다.", n1, n2, n1 * i);
//				break;
//			}
//		}
//	}
//}