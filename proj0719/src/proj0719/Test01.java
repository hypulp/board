package proj0719;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n % 3 == 0) {
				System.out.println(n / 3);
			} else if (n % 3 != 0) {
			}
			if (n == -1) {
				sc.close();
				break;
			}
		}
	}
}