package switchcase;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
     Scanner input =new Scanner(System.in);
        
     System.out.print("�п�J�~��:");
     int year =input.nextInt();
     
     int day = 0;        
     
     System.out.print("�п�J���:");  
     int month=input.nextInt();
     
    
    	
     if(month>12) {  	     
    	 
    	 while(month>12) 
    	 {   
    	   System.out.print("�ЦA��J�@�����:");  
           month=input.nextInt();    
           
           if(month<13) {
        	   switch(month){
         	  
               case 1:
               case 3:  
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:         
               day=31;
               break;
                              
               case 4:                 
               case 6:                       
               case 9:                    
               case 11:
               day=30;
               break;
            
               case 2:  
               if(year%4!=0 || year%100==0 && year%400!=0) {   
        	         day=28;
        	    }
               else{
            	     day=29;
               }
               break;             
               
         } 
   	  	 
        	 if(year%4!=0 || year%100==0 && year%400!=0)
          	 {
                System.out.println("���~"+year+"�~"+month+"��\n��"+day+"��");  
          	 }
          	 else {
                System.out.println("�|�~"+year+"�~"+month+"��\n��"+day+"��");  

          	 }  
        	   
           }
         }
             
     }
     else 
     {  
    	  switch(month){
    	  
                case 1:
                case 3:  
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:         
                day=31;
                break;
                               
                case 4:                 
                case 6:                       
                case 9:                    
                case 11:
                day=30;
                break;
             
                case 2:  
                if(year%4!=0 || year%100==0 && year%400!=0) {   
         	         day=28;
         	    }
                else{
             	     day=29;
                }
                break;                                   
          } 
    	 if(year%4!=0 || year%100==0 && year%400!=0)
    	 {
          System.out.println("���~"+year+"�~"+month+"��\n��"+day+"��");  
    	 }
    	 else {
          System.out.println("�|�~"+year+"�~"+month+"��\n��"+day+"��");  

    	 }
     } 
   
    
  }              
                   
}


                 



