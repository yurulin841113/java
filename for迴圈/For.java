package for�j��;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		int result=0;
		
		while(true) {
			
			System.out.print("�п�J�ӤH�^�m:");	
			int devotion = input.nextInt();
			
			if(devotion<0) {
				System.out.println("��e�^�m�׭t��,�h�X�t��!");
		        break;
			}
		
		
			   	result+=devotion;
			     
		}
		   System.out.println("�ثe�ӤH�^�m:"+result);	
		
		
		
		
		
		
		
		
		
		
//		int count =0;
//		long starttime =System.currentTimeMillis();
//		while(true) {
//			if(count++ == Integer.MAX_VALUE) {
//				break;
//			}
//			
//			
//		}
//		long endtime =System.currentTimeMillis();	
//		System.out.println("�w����"+count);
//		System.out.println("�`���ɶ�"+(endtime-starttime));
//	

//		int result=0;
//		for(int i=0;i<=10;i++) {
//			
//			for(int j =0;j<=10;j++) {
//				
//			  result=i*j;
//	  
//			  System.out.print(i+"*"+j+"="+result+","+"\t");
//			
//			  
//			  if(j==10){
//		    	  
//		    	   System.out.print("\n");
//		    	   break;
//		      }
//			  
//		    
//			}
//			  
//		}		
		

		
		
		
//		Scanner input = new Scanner(System.in);
//        int dayofmonth =0;
//        do {
//        	System.out.print("�п�J�~��:");
// 	        int year =input.nextInt();
// 	        
//        	System.out.print("�п�J���:");
//     		dayofmonth=input.nextInt();
//     		     	    
//     		 while(1>=dayofmonth || dayofmonth>12) {
//    	    	 
//    	    	 System.out.print("�Э���J���:");
//    	 		 dayofmonth=input.nextInt();
//    	 	     
//    	     } 
//   
//       
//	        switch(dayofmonth)	{
//	
//	          case  1:
//	          case  3:
//	          case  5:
//	          case  7:
//	          case  8:
//	          case 10:
//	          case 12:	   
//	        	  
//	          System.out.println("�P���@\t�P���G\t�P���T\t�P���|\t�P����\t�P����\t�P����");
//	          System.out.print("\t");	  
//		      for(int i = 1;i<= 31;i++) {
//			
//		       System.out.print(i);
//		
//		      if((i+1)%7==0) {
//			 
//			    System.out.print("\n");
//		      }	
//		      else {
//			 
//		        System.out.print("\t");
//		 
//		      }
//		 
//		      }
//		          break;  
//	          case 4:                 
//              case 6:                       
//              case 9:                    
//              case 11:
//              System.out.println("�P���@\t�P���G\t�P���T\t�P���|\t�P����\t�P����\t�P����");
//              System.out.print("\t");
//              for(int i = 1;i<= 30;i++) {
//   			
//		       System.out.print(i);
//		
//		      if((i+1)%7==0) {
//			 
//			    System.out.print("\n");
//		      }	
//		      else {
//			 
//		        System.out.print("\t");
//		 
//		      }
//		 
//		     }  
//    	        break; 
//    	        
//             case 2:  
//           	 System.out.println("�P���@\t�P���G\t�P���T\t�P���|\t�P����\t�P����\t�P����");
//         	 System.out.print("\t");
//      	     if(year%4!=0 || year%100==0 && year%400!=0){   
//    	      
//      	     for(int i = 1;i<= 28;i++) {
//      			
//		       System.out.print(i);
//		
//		      if((i+1)%7==0) {
//			 
//			    System.out.print("\n");
//		      }	
//		      else {
//			 
//		        System.out.print("\t");
//		 
//		      }
//		 
//		    }
//         }
//      	     
//      	    else {
//      		for(int i = 1;i<= 29;i++) {
//      			
// 		       System.out.print(i);
// 		
// 		      if((i+1)%7==0) {
// 			 
// 			    System.out.print("\n");
// 		      }	
// 		      else {
// 			 
// 		        System.out.print("\t");
// 		 
// 		      }
// 		 
// 		    }
//      	 }
//           break;             
//	    }
//	        
//	      
//	        
//	             
//	         
//	  }while(1>dayofmonth || dayofmonth>12);
//       
//	   
//   }		
//		
		
		
		
		
		
		
//        Scanner input = new Scanner(System.in);
//        
//        while(true) {    
// 	    System.out.print("�п�J�Ʀr:");
//
//        int range=input.nextInt();
//        
//		int result =0;
//		
//	
//		
//		
//		for(int i=1 ;i<=range;i++) {
//			
//		  	        		   		  	           
//           System.out.print("��"+i+"�쪱�a�����O:"); 
//        	   
//          
//		   int player=input.nextInt();
//          
//           
//           result+=player; 
//           
//           
//     
//       
//
//                  
//        }  
//		       System.out.println("�`�@"+range+"�쥭��:"+result/range);  
//	  }
//		
	}
}
	
	


