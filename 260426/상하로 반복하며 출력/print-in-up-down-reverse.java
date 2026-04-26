import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[][] arr = new int[input][input];
        for (int x=0; x<input; x++){
            int value = 0;
            if (x % 2 == 0){
                value = 1;
            }
            else {
                value = input;
            }
            for (int y = 0; y<input; y++){
                if (x % 2 == 0){
                    arr[y][x] = value++;
                }
                else 
                    arr[y][x] = value--;
            }
        }

        for (int x=0; x<input; x++){
            for (int y=0; y<input; y++){
                System.out.print(arr[x][y]);
            }
            System.out.println();
        }
    }
}