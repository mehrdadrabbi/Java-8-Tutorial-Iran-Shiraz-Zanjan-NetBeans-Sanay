import java.util.*;

public class Project005 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        String type = (n % 2 == 0) ? "even" : "odd";
        
        System.out.format("The number %d is an %s number.\n", n, type);
    }
}
