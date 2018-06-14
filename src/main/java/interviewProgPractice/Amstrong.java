package interviewProgPractice;

public class Amstrong {

	public static void main(String[] args) {
		// Amstrong number between 100 - 1000
		for (int i=100;i<=1000;i++) {
			int quo=i,rem=0,sum=0;
			while(quo>0) {
				rem=quo%10;
				quo=quo/10;
				sum=sum+(rem*rem*rem);
			}
			if (sum==i) {
				System.out.println(i+" is an amstrong number");
			}
		}

	}

}
