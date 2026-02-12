import java.util.Scanner;

public class FactorialOfNumbers {
//Finding nCr following steps
	public static int factorials(int x) {
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 'n' : ");
		int n=sc.nextInt();
		System.out.print("Enter 'r' : ");
		int r=sc.nextInt();
		 if(r>n) {
			 System.out.println("Invalid input ! r Cannot be greater than n. ");
			 return;
		 }
		
		int nCr=factorials(n)/(factorials(r)*factorials(n-r));
		int nPr=factorials(n)/factorials(n-r);
		
		System.out.println("Value of nCr is : "+nCr);
		System.out.println("Value of nPr is : "+nPr);
	}

}
