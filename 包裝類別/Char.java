package �]�����O;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isDigit = true;

		System.out.println("�P�_�¼Ʀr?:");

		String value = new Scanner(System.in).next();

		for (int i = 0; i < value.length(); i++) {

			if (!Character.isDigit(value.charAt(i))) {

				isDigit = false;
				break;
			}
		}

		if (!isDigit) {

			System.out.print("���O�@�ӯ¼Ʀr");

		} else {

			System.out.print("�O�@�ӯ¼Ʀr!!");
		}

	}

}
