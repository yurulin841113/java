package �m��;

import �~��.Game_character;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "�q�{�Ԥh1";

		String b = "�q�{�Ԥh3";

		String temp = null;

		String[] heroarray = { a, b

		};
		
		System.out.println(a.compareTo(b));

		
		for (int i = 0; i < heroarray.length; i++) {

			for (int j = 0; j < heroarray.length - i - 1; j++) {

				if (a.compareTo(b) < 0) {

					temp = heroarray[j];

					heroarray[j] = heroarray[j + 1];

					heroarray[j + 1] = temp;

				}
			}

		}

		for (int i = 0; i < heroarray.length; i++) {

			System.out.println(heroarray[i]);
		}

	}

}
