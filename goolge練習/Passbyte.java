package goolge�m��;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Passbyte {

	static byte x[] = { 104, 101, 108, 108, 111 };

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		scurity();
	}

	public static void scurity() {

		Scanner input = new Scanner(System.in);

		hint();

		String str = new String(x);

		System.out.println(str);

		System.out.print("�п�J�K�X:");

		String a = input.next();

		while (true) {

			if (a.contentEquals(str)) {

				break;

			}

			else {

				for (int i = 0; i < a.length(); i++) {

					if (a.charAt(i) != str.charAt(i)) {

						System.out.println("��" + (i + 1) + "�r�ſ��~");
					}

				}

				System.out.print("�Э���J�K�X:");

				a = input.next();

				continue;
			}

		}

		System.out.println("�r�ť��T!");

		answer(a);
	}

	public static void answer(String a) {

		for (int i = 0; i < a.length(); i++) {

			System.out.println(a.charAt(i) + "-" + (int) a.charAt(i));
		}

	}

	public static void hint() {

		System.out.print("����:");

		for (int i = 0; i < x.length; i++) {

			System.out.print(x[i]);

			if ((i + 1) % x.length == 0) {

				System.out.println();

			}

			else {

				System.out.print(",");

			}
		}
	}
}
