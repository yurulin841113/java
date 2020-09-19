package �~��;

public class Archmage extends Game_character {

	private int magicattack;
	
	//�C�W�@�Ө���ID++ �R�A!!
	public static int ID=1;
	
	public Archmage() {
		
		setNickname("�q�{�k�v"+ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setMagicattack(50);
		ID++;
	}
	
	public Archmage(String name) {
		
		this();//�եΥ����q�{��k
		setNickname(name);
		
	}
	
	@Override //���g�r���k
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer(getLevel());
		
		str.append(getNickname());
	
		str.append("\t");
		
		str.append(getLevel());
		
		str.append("\t");

		str.append(getMaxlife());
		
		str.append("\t");

		str.append(getCurrentlife());
		
		str.append("\t");

		str.append(getMagicattack());

		return str.toString();
	}
		
	public void fireball() {

		System.out.println("�k�v" + getNickname() + "���ǳƥ���y!");

	}

	public int getMagicattack() {
		return magicattack;
	}

	public void setMagicattack(int magicattack) {
		this.magicattack = magicattack;
	}

}
