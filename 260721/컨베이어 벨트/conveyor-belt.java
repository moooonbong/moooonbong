import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n*2];

        for (int x=0; x<n*2; x++){
            arr[x] = sc.nextInt();
        }

        for (int x=0; x<t; x++){
            int temp = arr[arr.length-1];
            for (int y=arr.length-1; y>=1; y--){
                arr[y] = arr[y-1];
            }
            arr[0] = temp;
        }

        for (int x=0; x<n*2; x++){
            System.out.print(arr[x]+" ");
            if ((x+1)%n == 0){
                System.out.println();
            }
        }
    }
}