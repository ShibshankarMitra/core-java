package Logical;

public class Armstrong2 {
	
	int power(int num, int pow)
	{
		return (int) Math.pow(num, pow);
	}

	int order(int num) {
		int order=0;
		while(num!=0) {
			num=num/10;
			order++;
		}
		return order;
	}
	
	boolean checkArmstrong(int number) {
		
		int temp= number;
		int order= order(number);
		int sum=0;
		
		while(temp!=0) {
			sum=sum+power(temp%10,order);
			temp= temp/10;
		}
		
		return(sum==number);
		
		
		
	}
	
	public static void main(String[] args) {
		Armstrong2 arm= new Armstrong2();
		for(int i=1;i<=500;i++) {
			if(arm.checkArmstrong(i))
				System.out.println(i);
		}

	}

}
