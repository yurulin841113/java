package �m��;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input =new Scanner(System.in);
       double price;//�]�w��J��� �ֱa �έ�������ܼ�
       int count ; //�J���N�ӫ~�ƶq�ܼ�
       double Total,Total1,Total2,Total3 ;
       
       System.out.print("��J�������:");
       price=input.nextDouble();
       System.out.print("��J����ƶq:");
       count = input.nextInt();   
       Total1=Total = price*count;
       
       System.out.print("��J�ֱa����:");
       price=input.nextDouble();
       System.out.print("��J�ֱa�ƶq:");
       count = input.nextInt();      
       Total2= price*count;
       Total+= price*count;
       
       System.out.print("��J��������:");
       price=input.nextDouble();
       System.out.print("��J�����ƶq:");
       count = input.nextInt();      
       Total3= price*count;
       Total+= price*count;
       
       
       if(Total1>5000 && Total2>5000 && Total3>5000 || Total>35000) 
       {
    	   
          System.out.println("�`���B:"+Total*0.3);
          System.out.print("��3��");

       }     
       else 
       {
    	   
           System.out.println("�`���B:"+Total*0.8);
           System.out.print("��8��");

       }
       
       
       
//       if(Total>=50000)
//       { 
//       
//       
//         System.out.print("�`���B:"+Total*0.7f);
//
//       }
//       else
//       {
//           
//    	 System.out.print("�`���B:"+Total*0.9f);
//
//       }	   
//       
       
       
       
       
       
       
	}

}
