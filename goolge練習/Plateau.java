package goolge�m��;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
//�̪����׭p��
public class Plateau {

	static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keyin();

		longer();

	}

	public static void keyin() {

		Scanner input = new Scanner(System.in);

		System.out.print("��J���e:");

		int key = input.nextInt();

		a = new int[key];

		for (int i = 0; i < key; i++) {

			a[i] = input.nextInt();
		}

		for (int i = 0; i < key; i++) {

			System.out.print(a[i]);

			if ((i + 1) % key == 0) {
				break;
			}

			else {

				System.out.print(",");
			}
		}

	}

	public static void longer() {

		int count = 1;

		int max = 1;

		Arrays.sort(a);

		System.out.println();

		for (int i = 1; i < a.length - 1; i++) {

			if (a[i] == a[i + 1]) {

				count++;

				if (count > max) {

					max = count;
				}
				
			} else {

				count = 1;
			}

		}

		System.out.print(max);
	}

}
