package _03수식과연산자;

//public class Ex_Prg {
//	public static void main(String[] args) {
//		
//		int year = 2012;
//		boolean isLeapYear;
//		
//		isLeapYear = (year % 4 == 0);
//		System.out.println(isLeapYear);
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		int x = 1;
//		int y = 1;
//		
//		int nextx = ++x; //x의 값이 사용되기 전에 증가된다. nextx는 2가 된다.
//		int nexty = y++; //y의 값이 사용된 후에 증가된다. nexty는 1이 된다.
//		System.out.println(nextx);
//		System.out.println(nexty);
//		
//		int n1 = 5;
//		System.out.println(+n1);
//		System.out.println(-n1);
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		int x = 3;
//		int y = 4;
//		System.out.print((x == y) + " ");
//		System.out.print((x != y) + " ");
//		System.out.print((x > y) + " ");
//		System.out.print((x < y) + " ");
//		System.out.print((x <= y) + " ");
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		int num1 = 10, num2 = 20;
//		
//		boolean result1 = (num1==10 && num2==20);
//		boolean result2 = (num1<=12 || num2>=30);
//		System.out.println("num1==10 그리고 num2==20: " + result1);
//		System.out.println("num1<=12 또는 num2>=30: " + result2);
//
//		if(!(num1==num2))
//			System.out.println("num1과 num2는 같지 않다."); // 한 문장 짜리여서 {} 없이도 됨.
//		else
//			System.out.println("num1과 num2는 같다.");
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		int x = 4;
//		int y = 6;
//		
//		System.out.printf("%d\n", (x & y));
//		System.out.printf("%d\n", (x | y));
//		System.out.printf("%d\n", (x ^ y));
//		System.out.printf("%d\n", (~x));  // 1의 보수 2의 보수... // modoocode.com
//		System.out.printf("%d\n", (x << 4));
//		System.out.printf("%d\n", (x >> 4));
//		System.out.printf("%d\n", (-1 >>> 1));
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		System.out.println("정수형 나눗셈: " + 7/3);
//		System.out.println("실수형 나눗셈: " + 7.0f/3.0f);
//		System.out.println("형 변환 나눗셈: " + (float)7/3);
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		double e = 3.1;
//		e += 2.1;
//		e *= 2;
//		
//		int n = 5;
//		n *= 2.2;
//		
//		System.out.println(e);
//		System.out.println(n);
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args){
//		int num1 = 0, num2 = 0;
//		boolean result;
//		
//		result = (num1 += 10) < 0 && (num2 += 10) > 0;
//		System.out.println("result=" + result);
//		System.out.println("num=" + num1 + ", num2=" + num2);
//		
//		result = (num1 += 10) > 0 || (num2 += 10) > 0;
//		System.out.println("result=" + result);
//		System.out.println("num=" + num1 + ", num2=" + num2);
//	}
//}



//class Ex_Prg {
//	public static void main(String[] args) {
//		int a=1;
//		System.out.println(a==1? "남자":"여자");
//	}
//}



// 문제 2
//class Ex_Prg {
//	public static void main(String[] args) {
//		int numOfApples = 123;  // 사과의 개수
//		int sizeOfBucket = 10;  // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		int numOfBucket = (numOfApples % sizeOfBucket == 0? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1);
//		System.out.println("필요한 바구니의 수: " + numOfBucket);
//	}
//}



//// 문제 8
//class Ex_Prg {
//	public static void main(String[] args) {
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b);  // java의 정수 계산은 기본이 int임
//		char ch = 'A';
//		ch = (char)(ch + 2);
//		float f = 3 / 2f;
//		long l = 3000L * 3000 * 3000;
//		float f2 = 0.1f;
//		double d = 0.1;
//		boolean result = (float)d==f2;
//		
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
//	}
//}



//// 숙제 문제 1
//class Ex_Prg {
//	public static void main(String[] args) {
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A'의 유니코드는 65
//		
//		System.out.println(1 + x << 33);
//		System.out.println(y >= 5 || x < 0 && x > 2);
//		System.out.println(y += 10 - x++);
//		System.out.println(x += 2);
//		System.out.println(!('A' <= c && c <= 'Z'));
//		System.out.println('C'-c);
//		System.out.println('5'-'0');
//		System.out.println((char)(c+1));
//		System.out.println(++c); //B
//		System.out.println(c++); //B->C
//		System.out.println(c); // C
//	}
//}



//// 숙제 문제 3
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 10;
//		System.out.println(num>0 ? "양수" : num==0 ? "0" : "음수");
//	}
//}



//// 숙제 문제 4
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 456;
//		System.out.println((num/100)*100);
//	}
//}



//// 숙제 문제 5
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 333;
//		System.out.println(num/10*10+1);
//	}
//}



//// 숙제 문제 6
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 24;
//		System.out.println((num/10+1)*10-num);
//	}
//}



////float f=10/3 // 이미 정수형으로 계산이 되어버려서 3.0이 되어버려
////float f=10/3f // 이렇게 하나라도 실수형으로 해줘야 해
//// 숙제 문제 7
//class Ex_Prg {
//	public static void main(String[] args) {
//		int fahrenheit = 100;
//		float celcius = 5f/9*(fahrenheit-32);
//		System.out.println("Fahrenheit: " + fahrenheit);
//		System.out.printf("Celcius: %.2f\n", celcius);
//	}
//}



//// 숙제 문제 9
//public class Ex_Prg {
//	public static void main(String[] args) {
//		char ch = 'z';
//		boolean b = (ch>=48 && ch<=57 || ch>=65 && ch<=90 || ch>=97 && ch<=122 ? true : false);
//		System.out.println(b);
//	}
//}



////// 숙제 문제 10
//class Ex_Prg {
//	public static void main(String[] args) {
//		char ch = 'A';
//		char lowerCase = (char)(ch>=65 && ch<=90 ? ch+32 : ch);
//		System.out.println("ch: "+ch);
//		System.out.println("ch to lowerCase: "+lowerCase);
//	}
//}