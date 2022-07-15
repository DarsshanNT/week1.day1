package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * logic to print fibbinocci
		 * 0 1 1 2 3 5 8 13 21 34 55
		 * 
		 * create a 3 varible -- first num , sec num , sum
		 * print 1 ,2 num
		 * loop 0 to 11
		 * add first, sec num assign to some
		 * assign sec num to the first num
		 * assign sum to sec num
		 * print sum
		 * 
		 */
		int firstnum=0, secnum=1,sum=0;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 0; i < 9; i++) {
			sum=firstnum + secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
			
			
			
		}

	}

}
