package transaction;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Scanner input =new Scanner(System.in);
		System.out.print("�п�J�q�X�~:");

		int year =input.nextInt();	
		
		System.out.print("�п�J�h�ֿ�:");

        double money= input.nextDouble();
        double result=0;
        double i=0;
        
        while(money<=2000) 
        {
        	
        	year++;
            money = money*1.25;
            
    		System.out.println(year+"�~��:"+(int)money+"��");
    		

            String str =String.format("%d�~��:%.2f��", year,money);
    		System.out.println(str);


        	
        	
        }
	}

}
