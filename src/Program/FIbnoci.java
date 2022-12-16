package Program;

import java.util.Scanner;

public class FIbnoci {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter a two number");
int n=sc.nextInt();
int fib1=0;
int fib2=1;
int fib3;
for (int i =1; i <=n-2; i++) {
	fib3=fib1+fib2;
	fib1=fib2;
	fib2=fib3;
	System.out.println(fib3);
}
 
}
}
