package method��k;

public class Practice_1 {
	
	
	public static void main(String[] args) {
		
		 int num1=9,num2=10;
		 
		 swap(num1,num2);
		 
		 System.out.println("---------------");
		 
		 System.out.println(num1);
			
		 System.out.println(num2);
	
	}
	
	static void swap(int num1,int num2) {
		
		int tmp=num2;
		
		num2 = num1;
		
		num1 = tmp;
		
	    System.out.println(num1);
			
		System.out.println(num2);	
	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//        int sum=getsum(80,90);
//     
//	    System.out.print(sum);
//	}
//	
//	
//	public static int getsum(int num1,int num2) {
//		// TODO Auto-generated method stub
//		
//		int result = num1+num2;
//    
//		return result;
//    	
//    
//	
//	}
//		
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		print(5,"�ڮa��bĬ�{");
//		
//		print(10,"�ڥ��C�s, �k�ժ�");
//		
//		print(15,"���O�ڳ��w���[, �O�ܦh�H���w�Q�ڥ�");
//
//		
//	
//	    System.out.println(Math.sqrt(4)) ;
//	    
//	    System.out.println(Math.ceil(4.5)) ;
//	    System.out.println(Math.ceil(-4.5)) ;
//	    
//	    System.out.println(Math.floor(4.5)) ;
//	    System.out.println(Math.floor(-4.5)) ;
//	    
//	    System.out.println(Math.min(3, 5)) ;
//
//	}
//
//	public static void print(int time ,String word) {
//		// TODO Auto-generated method stub
//
//		for(int i = 0;i < time;i++) {
//			
//               System.out.println(word);
//			
//		}
//		
//		
//		
//	}

}
