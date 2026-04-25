import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int input = sc.nextInt();

            if (input == 25){
                System.out.println("Good");
                break;
            }
            
            if (input < 25)
                System.out.println("Higher");
            else 
                System.out.println("Lower");
        }
    }
}