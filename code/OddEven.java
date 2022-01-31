import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (num % 2 == 0){
			System.out.println("Your given number is an Even number.");
		} else {
				System.out.println("Your number is an Odd number. ");
		}	
	}
}