package �]�����O;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double num1 =3.14;
             		
        Double dnum1 =  new Double(num1);
                    
        Double dnum2 =  new Double("3.14");
               
        Double dnum3 = num1;//�۰ʸ˽c
        
        Double dnum4 =Double.valueOf(num1);
        
        java.lang.String n= dnum3.toHexString(num1);
        
        //�۰ʶ}�c
        num1=dnum1;
        
        num1=dnum2.doubleValue();
        
        System.out.println(num1+"\t"+dnum1+"\t"+dnum2+"\t"+dnum3+"\t"+dnum4+"\t"+n);
       
       
        
        
	}

}
