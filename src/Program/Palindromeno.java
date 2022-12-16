package Program;

import java.util.Scanner;

public class Palindromeno {
public static void main(String[] args) {
	Scanner sc= new Scanner(System. in);
	System.out.println("enter a no");
	int num= sc.nextInt();
	int copy=num;
	int sum=0;
	while (num!=0) {
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}if(copy==sum) {
		System.out.println(" is palindrome");
	}else {
		System.out.println(" not a palindrome");
	}
}
}
