package �~��;

public class Game_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Warrior �R�w�� = new Warrior("�R�w��",1500); 
					
		Warrior ���� = new Warrior("����",1500); 
		
		�R�w��.setLevel(1);
		
		����.setLevel(1);

		System.out.println(�R�w��.compareto(����));
		
		System.out.println(�R�w��==����);
		
		System.out.println(�R�w��.equals(����));//�Ҧ����OObject

		System.out.println(�R�w��.toString());
		

		//Game_character �]���׵��� = new Warrior();
		
//		Game_character �]���׵���; //�n������ 
//		
//		�]���׵��� = new  Warrior();//�եΤl����Ϥ�
//		
//		�]���׵���.move();
		System.out.println("-------------------------------");

		Archmage �̹D�� = new Archmage("�̹D��");		
		�̹D��.fireball(); 
		System.out.println(�̹D��.getNickname());
		System.out.println("�ŧO:"+�̹D��.getLevel());
		System.out.println("�̤j�ͩR:"+�̹D��.getMaxlife());
		System.out.println("�ثe�ͩR:"+�̹D��.getCurrentlife());
		System.out.println("�]�k����:"+�̹D��.getMagicattack());
		
		System.out.println("-------------------------------");
		
		System.out.println(�̹D��.toString());
		System.out.println(�̹D��);
		
		System.out.println("-------------------------------");

		Archmage ���Q�i�S = new Archmage();		

		System.out.println(���Q�i�S);


	}

}
