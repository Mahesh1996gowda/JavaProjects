package Program;

import java.util.Scanner;

public class Strongno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			int fact=1;
		for (int i = rem; i>=1; i--) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
			
	}if(copy==sum) {
		System.out.println("is strong");
	}else {
		System.out.println("not a strong no");
	}

	}
}
