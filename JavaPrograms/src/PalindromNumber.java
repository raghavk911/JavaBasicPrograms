import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("rev---"+rev);
		
		if(org_num == rev) {
			System.out.println(org_num+" is a palindrome number");
		}
		else {
			System.out.println(org_num+" is not a palindrome number");
		}
	}
}
