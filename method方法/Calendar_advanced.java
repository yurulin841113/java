package method��k;

import java.util.Scanner;

public class Calendar_advanced {
    
	public static int year =-1;
	
	public static int month=-1;
		
	public static int[] daymonth= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	    
		totalcalendar();
	}
	
	//��J�~���
	static void inputself() {
				 
		Scanner input = new Scanner(System.in);
		
        System.out.print("�п�J�褸�~:");
        
        year=input.nextInt();
        
        System.out.print("�п�J���:");
                
        month=input.nextInt();        

        input.close();
        
        input=null;
		 				
	}
	
	//�P�_�|�~
	private static boolean isLeapYear(int year) {
			
		return year%4==0 && year%100!=0 || year%400==0;
			
	}
	
	
	//�P�_�O�_����M�|�~
	private static int getsumdayofyear() {
		
		if(year == Integer.MIN_VALUE) {
			
	        System.out.print("�~�����~�Э��s��J�~���");

	        inputself();
		}
		
		int sum=0;
		
		for(int i = 2018 ; i < year;i++) {
			
		     sum+= 365;
		     
		     if(isLeapYear(i)) {
		    	 
		    	 sum++;
		     }
		}
		
		return sum;
	}
	
	//����`�Ѽ�
	private static int getsumdayofmonth() {
		
		int sum=0;
				
		for(int i = 0; i < month-1 ; i++) {
			
			sum+=daymonth[i];
			
		}
		
		if(isLeapYear(year) && month>=3) {
				
			sum++;	
		}
		
		return sum;
	}
	
	
	//�P�_��X�P�����
	private static void Content(int week) {

		int tcount = week - 1;
		
		if(week == 0) {
			
			tcount = 6;
			
		}
		
		else {
			
			tcount = week - 1;
			
		}
		
		for(int i = 0;i < tcount; i++) {
			
			System.out.print("\t");
			
		}
		
        for(int i = 0;i < daymonth[month - 1]; i++) {
			
			System.out.print(i+1);
			
			if((week + i) % 7 == 0) {
				
				System.out.println();
				
			}
			
			else {
				
				System.out.print("\t");
				
			}
			
		}
		
	}
				
	//��X����P��
	private static void title() {
		
		String[] monthname = {
				"�@��","�G��","�T��","�|��","����"
				
				,"����","�C��","�K��","�E��","�Q��","�Q�@��","�Q�G��"
		};
		
		System.out.println(year+"\t"+monthname[month-1]);
		
		System.out.println("----------------------------");
		
		String[] week= {"�P���@","�P���G","�P���T","�P���|","�P����","�P����","�P����"};
		
		for(int i = 0; i < week.length;i++ ) {
			
			System.out.print(week[i]+"\t");

			
		}
		
		System.out.println();
		
	}
	
	
	
	public static void totalcalendar() {
		// TODO Auto-generated method stub	
		 inputself();	
		 		 
		 if(year%4!=0 || year%100==0 && year%400!=0) {
			 
			  System.out.println("���~");
			 
		 }
         
		 else if(year%4==0 && year%100!=0 || year%400==0) {
			 
			  System.out.println("�|�~");
		 } 
		 	 		
		 
		 int sum = getsumdayofyear();
		 
		 sum +=getsumdayofmonth();
		 
		 sum++;
		 
		 System.out.println(sum % 7);
		 
		 title();
		 
		 Content(sum%7);
		
		 		 
	}
	
	
	

}
