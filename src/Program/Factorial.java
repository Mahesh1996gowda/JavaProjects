package Program;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number");
	int fact=1;
	int num=sc.nextInt();
for (int i = num; i>=1; i--) {
	fact=fact*i;
}
System.out.println(fact);
	}

}
