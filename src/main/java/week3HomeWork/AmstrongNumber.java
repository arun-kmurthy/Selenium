package week3HomeWork;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,quo,sum;
		//looping through every number from 100 to 1000 
		for (int i=100;i<=1000;i++)
		{
			rem=i;
			quo=0;
			sum=0;
			//Looping through each integer of the number and 3 expo sum of all the integers
			// using while loop
			while(rem>0){
				quo=rem%10;
				rem=rem/10;
				sum=(quo*quo*quo)+sum;
			}
			//Printing the number when the 3 expo sum of the integer is equal to current loop 
			//number 
			if (sum==i)
				System.out.print(i+", ");
		}
	}

}




