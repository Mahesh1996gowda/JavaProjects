package Program;

public class Oneto10primeno {
	public static void main(String[] args) {
		for (int i =1; i <=10; i++) {
			int num=i;
			boolean flag=true;
			for (int j =2; j < num/2; j++) {
				if(num%j==0)
					flag=false;
				break;
			}
		}if(flag==true) {
	System.out.println(num +"is a prime no");
		}else {
			System.out.println(num +"not a prime no");
		}
	}

}
