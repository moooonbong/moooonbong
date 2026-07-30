import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            sum += blocks[i];
        }   

        int value = sum / n;
        int answer = 0;

        for (int x=0; x<n; x++){
            if (blocks[x] > value){
                answer += blocks[x] - value;
            }
        }

        System.out.println(answer);
    }
}