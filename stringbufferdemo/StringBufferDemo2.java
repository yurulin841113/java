package stringbufferdemo;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("hello world!");
		StringBuffer str2 = new StringBuffer("hello world!");
		StringBuffer str3 = new StringBuffer("hello world!");
		StringBuffer str4 = new StringBuffer("hello world!");
		StringBuffer str5 = new StringBuffer("hello world!");
						
		System.out.println(str1);

		// ����
		System.out.println(str2.reverse());

		// ���J
//		System.out.println(str3.insert(3, "abc"));		
		System.out.println(str3.insert(3, 4L));// �p��

		// �R��
//		System.out.println(str4.deleteCharAt(3));

		System.out.println(str4.delete(2, 4));

		// ���N
		System.out.println(str4.replace(2, 4, "�x�W"));

		// �j�p
		System.out.println("�w�s:" + str1.capacity());
						
		// �M��
		str1.setLength(0);
		
		//�]�w�Ŷ��j�p
		str1.trimToSize();

		

	}

}
