package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");
        
		System.out.print("�дX�Ӿǥ�:");
		
		int num=input.nextInt();
		
        double array[]=new double [num];
        
        double result=0;
        
        double avg=0;
        
   	    System.out.println("�п�J"+num+"�Ӿǥͪ����Z");    
        
        for(int i =0 ;i<array.length;i++){
        	   
    	      System.out.print("�o�O"+(i+1)+"�Ӿǥͪ����Z:"); 
    	      
        	  array[i]=input.nextDouble();             
        	  
        	  result += array[i];
        	  
        	  avg = result/num;
        
        }    
        
        System.out.print("[");    
        for(int i =0 ;i<array.length;i++){
        	
           if(i==num-1) {
        	   
        	   System.out.print(array[i]);    
           }
           else {	  
           System.out.print(array[i]+",");    
           }
           
          
     }  
        System.out.println("]");    
        
   	  System.out.print("�`�����Z"+result+"\n"+"����:"+df.format(avg));    
        
        
	}

}
