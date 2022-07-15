package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		boolean bprime =true;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
			System.out.println("not prime");
			bprime =false;
			break;
			}
			if (bprime==true) {
			System.out.println("prime");
			}
			
		}
	}

}
