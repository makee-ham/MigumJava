package _03���İ�������;

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
//		int nextx = ++x; //x�� ���� ���Ǳ� ���� �����ȴ�. nextx�� 2�� �ȴ�.
//		int nexty = y++; //y�� ���� ���� �Ŀ� �����ȴ�. nexty�� 1�� �ȴ�.
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
//		System.out.println("num1==10 �׸��� num2==20: " + result1);
//		System.out.println("num1<=12 �Ǵ� num2>=30: " + result2);
//
//		if(!(num1==num2))
//			System.out.println("num1�� num2�� ���� �ʴ�."); // �� ���� ¥������ {} ���̵� ��.
//		else
//			System.out.println("num1�� num2�� ����.");
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
//		System.out.printf("%d\n", (~x));  // 1�� ���� 2�� ����... // modoocode.com
//		System.out.printf("%d\n", (x << 4));
//		System.out.printf("%d\n", (x >> 4));
//		System.out.printf("%d\n", (-1 >>> 1));
//	}
//}



//public class Ex_Prg {
//	public static void main(String[] args) {
//		System.out.println("������ ������: " + 7/3);
//		System.out.println("�Ǽ��� ������: " + 7.0f/3.0f);
//		System.out.println("�� ��ȯ ������: " + (float)7/3);
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
//		System.out.println(a==1? "����":"����");
//	}
//}



// ���� 2
//class Ex_Prg {
//	public static void main(String[] args) {
//		int numOfApples = 123;  // ����� ����
//		int sizeOfBucket = 10;  // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
//		int numOfBucket = (numOfApples % sizeOfBucket == 0? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1);
//		System.out.println("�ʿ��� �ٱ����� ��: " + numOfBucket);
//	}
//}



//// ���� 8
//class Ex_Prg {
//	public static void main(String[] args) {
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b);  // java�� ���� ����� �⺻�� int��
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



//// ���� ���� 1
//class Ex_Prg {
//	public static void main(String[] args) {
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A'�� �����ڵ�� 65
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



//// ���� ���� 3
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 10;
//		System.out.println(num>0 ? "���" : num==0 ? "0" : "����");
//	}
//}



//// ���� ���� 4
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 456;
//		System.out.println((num/100)*100);
//	}
//}



//// ���� ���� 5
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 333;
//		System.out.println(num/10*10+1);
//	}
//}



//// ���� ���� 6
//class Ex_Prg {
//	public static void main(String[] args) {
//		int num = 24;
//		System.out.println((num/10+1)*10-num);
//	}
//}



////float f=10/3 // �̹� ���������� ����� �Ǿ������ 3.0�� �Ǿ����
////float f=10/3f // �̷��� �ϳ��� �Ǽ������� ����� ��
//// ���� ���� 7
//class Ex_Prg {
//	public static void main(String[] args) {
//		int fahrenheit = 100;
//		float celcius = 5f/9*(fahrenheit-32);
//		System.out.println("Fahrenheit: " + fahrenheit);
//		System.out.printf("Celcius: %.2f\n", celcius);
//	}
//}



//// ���� ���� 9
//public class Ex_Prg {
//	public static void main(String[] args) {
//		char ch = 'z';
//		boolean b = (ch>=48 && ch<=57 || ch>=65 && ch<=90 || ch>=97 && ch<=122 ? true : false);
//		System.out.println(b);
//	}
//}



////// ���� ���� 10
//class Ex_Prg {
//	public static void main(String[] args) {
//		char ch = 'A';
//		char lowerCase = (char)(ch>=65 && ch<=90 ? ch+32 : ch);
//		System.out.println("ch: "+ch);
//		System.out.println("ch to lowerCase: "+lowerCase);
//	}
//}