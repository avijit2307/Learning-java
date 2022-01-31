import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to check: ");
		int n = sc.nextInt();
		for( int i = 2; i > n; i++)
			if (n % i != 0){
			System.out.println(n + " is a prime number.");
			}
			else{
				System.out.println(n + " is a composite number");
				}
				
		 

	}
}