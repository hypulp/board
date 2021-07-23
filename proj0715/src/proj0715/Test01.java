package proj0715;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int kor1 = sc.nextInt();
		int eng1 = sc.nextInt();

		String name2 = sc.next();
		int kor2 = sc.nextInt();
		int eng2 = sc.nextInt();
		sc.close();

		int sum1 = kor1 + kor2;
		int sum2 = eng1 + eng2;

		if (name1.length() <= 20 && name2.length() <= 20) {
			System.out.printf("%s %d %d%n", name1, kor1, eng1);
			System.out.printf("%s %d %d%n", name2, kor2, eng2);
			System.out.printf("avg %d %d", sum1 / 2, sum2 / 2);
		}
	}
}