import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter the String ::");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String org_str = str;
		int len = str.length();
		String rev = "";
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(org_str.equals(rev)) {
			System.out.println(org_str +" is a palindrome string");
		}
		else {
			System.out.println(org_str +" is not a palindrome string");
		}
	}

}
