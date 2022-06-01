package week1.day1;

public class Fibonacci {
	
	int firstnum =0;
	int secnum =1;
	int thirdnum;

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Fibonacci sum = new Fibonacci ();

		System.out.println(sum.firstnum);
		System.out.println(sum.secnum);
	
		
		for (int i=1; i<=8;i++)
		{
			System.out.println(sum.thirdnum = sum.firstnum
					+ sum.secnum);
			
			sum.firstnum = sum.secnum;
			sum.secnum = sum.thirdnum;
		
		}
	}

}
