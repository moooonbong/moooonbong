import java.util.*;

public class Main {
    static class Arr implements Comparable<Arr>{
        int index;
        int value;

        Arr(int index, int value){
            this.index = index;
            this.value = value;
        }

        public void show(){
            System.out.println(index + " " + value);
        }

        @Override
        public int compareTo(Arr arr){
            if (this.value == arr.value)
                return Integer.compare(this.index, arr.index);

            return Integer.compare(this.value, arr.value);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Arr[] arr = new Arr[n];

        for (int x=0; x<n; x++){
            int value = sc.nextInt();

            arr[x] = new Arr(x+1, value);
        }

        Arrays.sort(arr);
        int[] path = new int[n];

        for (int x=0; x<n; x++){
            path[arr[x].index-1] = x + 1;
        }

        for (int x=0; x<n; x++){
            System.out.print(path[x] + " ");
        }
    }
}