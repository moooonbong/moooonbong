import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int x=0; x<input; x++){
            if ((x+1) % 2 == 0){
                for (int y = input; y>=1; y--)
                {
                    System.out.print(y);
                }
            }
            else {
                for (int y = 1; y<=input; y++){
                    System.out.print(y);
                }
            }
            System.out.println();
        }
        
    }   
}