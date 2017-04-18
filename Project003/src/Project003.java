import java.util.*;

public class Project003 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        if (n % 2 == 0) {
            System.out.format("%d is an even number.\n", n);
        } else {
            System.out.format("%d is an odd number.\n", n);
        }
                
    }
}
