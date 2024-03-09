import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		while(true) {
			System.out.println("Please Enter the operator");
			char c =sc.next().trim().charAt(0);
			
			if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%') {
				System.out.println("Enter two numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				if(c=='+') {
					ans=a+b;
				}
				if(c=='-') {
					ans=a-b;
				}
				if(c=='*') {
					ans=a*b;
				}
				if(c=='/') {
					if(b!=0) {
					ans=a/b;
					}
					else {
						System.out.println("Undefined");
						continue;
					}
				}
				if(c=='%') {
					ans=a%b;
				}
			}
			else if(c=='x' || c=='X') {
				break;
			}
			else {
				System.out.println("Enter the valid operator");
				continue;
			}
			System.out.println(ans);
		}
		
		
		
	}
}

