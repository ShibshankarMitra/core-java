package Logical;

public class Armstrong {
    /* Function to calculate x raised to the
       power y */
    int power(int x, long y)
    {
        double pow = Math.pow(x, y);
        return (int) pow;
    }
 
    /* Function to calculate order of the number */
    int order(int x)
    {
        int o=0;
        while(x!=0) {
        	o++;
        	x=x/10;
        }
        
        return o;
    }
 
    // Function to check whether the given number is
    // Armstrong number or not
    boolean isArmstrong(int x)
    {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
 
        // If satisfies Armstrong condition
        return (sum == x);
    }
 
    // Driver Program for verifying a number
//    public static void main(String[] args)
//    {
//        Armstrong ob = new Armstrong();
//        int x = 153;
//        System.out.println(ob.isArmstrong(x));
//        x = 1253;
//        System.out.println(ob.isArmstrong(x));
//    }
    
    //Driver program for finding nth Armstrong number
    
    public static void main(String[] args)
    {
    	int n=11;
    	int count=0;
    	for(int i=1;i<Integer.MAX_VALUE;i++) {
    		Armstrong ob= new Armstrong();
    		
    		if(ob.isArmstrong(i))
    			count=count+1;
    		if(count==n) {
    			System.out.println(i);
    		break;
    		}

    	}
    	System.out.println(count);
    }
    
    
}