package switchcase;

import java.util.Scanner;

public class Gamemenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner(System.in);
         
		System.out.println("1.�n���C��");
		System.out.println("2.�h�X�C��");
        System.out.print("�п�ܿ�J?:");
        int choice = input.nextInt();
         
		if(choice == 1) {
	      	
		 System.out.println("1.�ǭ��J�K");
         System.out.println("2.�|�إ|��");
         System.out.println("3.�|�|�Ѥ�");
         System.out.println("4.�ۧڪY��");
         System.out.println("5.�[��a��");
         System.out.println("6.�즹�@�C");
         System.out.println("�п�ܿ�J?:");
         
          while(true) {
             choice = input.nextInt();
         
             switch(choice) {
         
             case 1:
            
        	 break;
        	 
             case 2:
             
        	 break;
        	 
             case 3:
        	 System.out.println("���Ʀ��� >�|�|�Ѥ�");
             System.out.println("1.��ܩҦ��n�ͰT��");
             System.out.println("2.�K�[�n��");            
        	 break;
        	 
             case 4:
             
        	 break;
        	 
             case 5:
             
        	 break;
        	 
             case 6:
             
        	 break;
        	 
             default:
             System.err.println("��J���~!!");
        	 break;
           } 
          
         }
         
		}
		
		else if(choice==2){
			
			 System.exit(0);		
		}
		
		else {
			 System.err.println("��J���~!!! �C���h�X");

			
		}
	}

}
