package guessnum;

import java.util.Scanner;

public class Guessnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       
        int i=1;
    
        
		while(i<6) {
			
			System.out.print("�q��"+i+"��:"); 
			int price = input.nextInt();
			
			if(price==5000) {
				if(i==1) {
					
					System.out.print("���G!�q��"+i+"���N�q��:ī�G���!"); 
				
				}else if(i>=2 && 3>=i){
					
					System.out.print("��"+i+"���q��:���q!");
					

				}else {
					
					System.out.print("��"+i+"���q��:�Ūަվ�!");
				}	
				break;
			}
			else {
				if(i==5) {
				System.out.println("�o���q"+i+"�����S��!!!");
				break;
				}
				System.out.println("�S�q���q�~��q~~");
				     	
			}
					
		
            i++;
		}
		
	}

}
