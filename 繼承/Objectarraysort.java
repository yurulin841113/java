package �~��;

public class Objectarraysort {

	public static void sort(Game_character[] heroarray) {

		Game_character temp = null;

		for (int i = 0; i < heroarray.length; i++) {
			for (int j = 0; j < heroarray.length-i-1; j++) {

				if (heroarray[j].comparetobyname(heroarray[j + 1]) < 0) {
					temp = heroarray[j];
					heroarray[j] = heroarray[j + 1];
					heroarray[j + 1] = temp;

				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior �F�� = new Warrior();
		Warrior ���� = new Warrior();
		Warrior ��J = new Warrior();
		Warrior ���� = new Warrior();
		Warrior �J�L = new Warrior();

		Archmage �k1 = new Archmage();
		Archmage �k2 = new Archmage();
		Archmage �k3 = new Archmage();
		Archmage �k4 = new Archmage();
		Archmage �k5 = new Archmage();

		Game_character[] heroarray = { �F��, ����, ��J, ����, �J�L, �k1, �k2, �k3, �k4, �k5

		};
		
		System.out.println("�Ƨǫe:");

		System.out.println("�W�r\t����\tMaxlife\tlife\tAttack");

		for (Game_character hero : heroarray) {

			System.out.println(hero);
		}
		
		System.out.println("------------------------------");
		
		sort(heroarray);
		
		System.out.println("�Ƨǫ�:");

		System.out.println("�W�r\t����\tMaxlife\tlife\tAttack");

		for (Game_character hero : heroarray) {

			System.out.println(hero);
		}

	}

}
