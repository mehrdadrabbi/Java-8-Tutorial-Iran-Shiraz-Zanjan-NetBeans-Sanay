import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args){
		int a=10;
		int b=10;
		System.out.println("HelloWorld!");
		System.out.println("Welcome to java");	
		int n = 12345;
        System.out.println(a+b);
        double pi=3.00014;
        System.out.println(pi+a+b+pi*2);
        System.out.println(System.currentTimeMillis());
        System.out.print("Please Enter an integer:");
        Scanner input=new Scanner(System.in); 
        a=input.nextInt();
        if (a%2==0)
        {
        	System.out.print("You Enterd Even Number!");
        }
        else
        {
        	System.out.print("You Enterd Odd Number!");
        }
        /* Condittional Operator */
        String type=(a%2==0) ? "even":"odd";
        System.out.print(type);
        
	}
}
