package Program;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean flag=true;
		for (int i = 2; i <=num/2; i++) {
		if (num%2==0) {
			flag=false;
			break;
		}
		}
		if(flag==true) {
			System.out.println(num+" "+"is primeno");
		}else {
			System.out.println(num+" "+"is not a primeno");
		}
	}

}
