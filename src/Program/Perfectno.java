package Program;

import java.util.Scanner;

public class Perfectno {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a no");
	int num=sc.nextInt();
	int copy=num;
	int sum =0;
	while(num!=0) {
		int rem=num%10;
		sum= sum+(rem*rem*rem);
		num=num/10;
	}if(copy==sum) {
		System.out.println("is perfect num");
	}else {
		System.out.println("not a perfect no");
	}
}
}
