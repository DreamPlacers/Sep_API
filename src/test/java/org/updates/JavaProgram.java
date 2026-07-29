package org.updates;

public class JavaProgram {

    public static void main(String[] args) {

        for (int i = 17; i >=14; i--) {
            for (int j = 20; j >18; j--) {
                System.out.println(j+1);
                for (int k = 1; k < 2; k++) {
                    System.out.println(k);

                }

            }

        }
        
        
        
        
        
       for (int n=0; n<1000; n++) {
    	   int i=0,j=0,a=0;
    	   a=n;
    	   while(a>0) {
    		  i=a%10;
    		  j=j+(i*i*i);
    		  a=a/10;
    	   }
    	   if(n==j) {
    		   System.out.println(j);
    		   System.out.println("its is a Armstrong Number");
    	   }
       }
        
        
        
        
        
        
        
        
        
        
    }

}
