package goolge�m��;

import java.util.Scanner;

public class Point {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�п�J�r��:");

		String key = input.next();

		System.out.println(key.substring(1, 3));
		
		System.out.println(key.substring(3));
		
		judge2(key);

	}

	public static String judge() {

		System.out.println("�п�J�Ʀr:");

		double x = input.nextDouble();

		String s = String.valueOf(x);

		System.out.println("�p���I�b��" + (s.indexOf(".") + 1) + "��");

		return s;

	}

	public static boolean judge2(String str) {

		boolean judge2 = true;

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isDigit(str.charAt(i))) {

				if (str.charAt(i) == '.') {

					if (i == 0 || i == str.length() - 1) {// �Ĥ@��M�̫�@��D�k

						System.out.println("xx");

						return false;

					}

				} else {

					System.out.println("gg");

					return false;
				}

			}

		}
		// �u�঳�@�Ӥp���I
		if (!(str.indexOf(".") == str.lastIndexOf(".")) || !(str.contains("."))) {

			System.out.println("gggg");

			return false;
		}

		System.out.println("�p���I�b��" + (str.indexOf(".") + 1) + "��");

		return judge2;
	}
}
