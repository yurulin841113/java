package �~��;

public class Warrior extends Game_character {

	// ���z����
	private int pysicalattack1;
	
	//�C�W�@�Ө���ID++ �R�A!!
	public static int ID=1;

	public Warrior() {

		// super();//�l���c�y�եΤ����O

		// System.out.println("�l���c�y");
		setNickname("�q�{�Ԥh"+ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setPysicalattack(99);
		ID++;

	}

	public Warrior(String nickname, int pysicalattack) {

		setNickname(nickname);

		setPysicalattack(pysicalattack);

	}

	@Override // ���g�r��

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

		str.append(getPysicalattack());

		return str.toString();
	}

	@Override // �����ӬO�_�۵�
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Warrior)) {

			return false;
		}

		Warrior newWarrior = (Warrior) obj;

		// ���
		if (getNickname().equals(newWarrior.getNickname()) && getPysicalattack() == newWarrior.getPysicalattack()) {

			return true;
		}

		return false;
	}

	@Override // ���g
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�Ԥh���ʾa�L!!");
	}

	// ���g����
//	public void move() {
//
//		System.out.println(getNickname()+":���ʾa�L!!");
//
//	}

	public int getPysicalattack() {

		return pysicalattack1;
	}

	public void setPysicalattack(int pysicalattack) {

		this.pysicalattack1 = pysicalattack;
	}

}
