package dowhile;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    double result =0;
		
		String choice =null;
		
		do {
			
			System.out.println("�п�J��Ӽ�:");
			
			double a=input.nextDouble(),b=input.nextDouble();
				
			System.out.println("�п�J�B�⤸:");
			
			String math = input.next();	
			
			switch(math){
				case "+":
					result=a+b;
					
					break;
					
				case "-":
					result=a-b;
					
					break;
					
				case "*":
					result=a*b;
					
					 break;
				case "/":
					result=a/b;
				
			         break;
				case "%":
					result=a*b;
			
					break;
			} 
			String str=String.format("%.2f", result);
			System.out.println(a+math+b+"="+str);
				
			System.out.println("�O�_�~��:?(Y/N)"); 	
			choice =input.next();
			
			if("n".equalsIgnoreCase(choice)){
		    
		        System.out.println("�����p��!!!");
		        break;
			}
			
								
		}while("y".equalsIgnoreCase(choice));
		
		
		
		
		
		
		
//		
//	Scanner input = new Scanner(System.in);
//		
//		String choice ="y";
//		
//		String name = null;
//		do {					
//			
//		
//				
//			  	System.out.println("�w��j�L�i�J�Ш��W:");
//				name=input.nextLine();
//				
//				System.out.println("�Y��: (�X�J����)");
//				System.out.println("����W��:"+name);	
//			
//	     	    System.out.println("�O�_�~��:?(Y/N)");       	    
//				choice=input.nextLine();
//				
//				
//			   	if("y".equalsIgnoreCase(choice))	{
//			   		
//			   	 System.out.println("�w��i�J����!!");
//			   	 break;	
//			   	}	
//					
//				
//		     	while(!"n".equalsIgnoreCase(choice)){
//					
//				     System.out.println("���~�Э��s��J�O�_�~��:?(Y/N)");
//				     choice=input.nextLine();		
//				     
//                     if("y".equalsIgnoreCase(choice)){
//				    	 
//				    	 System.out.println("�w��i�J����!!");   
//				    	 break;
//				     }
//                     			    
//				
//				 }	
//					
//							
//		
//		}while(!"y".equalsIgnoreCase(choice) );
		
		
		
		
//		while(choice.equals("y"));
		
		
		
		
		
		
		
		
		
		
//        int a=1,b=10;
//        do {
//        	b-=a;
//        	a++;
//        	
//        }while(b--<0);
//        System.out.print(b);
	}

}
