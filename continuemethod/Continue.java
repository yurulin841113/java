package continuemethod;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("�п�J�Ʀr:");

		int num = input.nextInt();
		
		int result=0;
		
		for(int i=0 ;i<=num;i++) {
			
			if(i%2==1) {
				
				continue;
				
			}
			
			else {
				
				
				
				if(i==num) {
					
					System.out.print(i+"=");
					
					break;
				}
				
				System.out.print(i+"+");
				
			}
			
			result+=i;
			
		}
		System.out.print(result);
		
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		double money = Double.MAX_VALUE;
//	
//		int result = 0;
//        for(int i = 1;i < 6;i++) {
//        	
//        	System.out.println("�п�J��"+i+"�쪱�a���B:");
//        	money = input.nextDouble();
//        	if(money>500) {	
//        		
//        	
//        		continue;
//        	
//        	}	
//        	result++;
//        	
//        	
////        	if(money<500) {
////        		result++;
////        	}
//        }
//    	System.out.println("���O�`���B�p��500:"+result);

	}

}
