package method��k;

public class ParamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		param("�Ѽƴ���",1000);
		
//		System.out.prinf(,);
		
	}

	public static void param(String str, int ...num) {
		
		System.out.println("�Ĥ@�ӰѼ�:" + str);
		
		System.out.println("�Ѽƪ���:"+num.length);
		
		for(int i =0;i < num.length;i++) {
			
			System.out.println("�Ĥ@�ӰѼ�:" + num[i]);
			
		}
	}
	
}
