import java.util.*;

public class Main {
    static class Pos implements Comparable<Pos>{
        int index;
        int x;
        int y;
        int dis;

        Pos(int index, int x, int y){
            this.index = index;
            this.x = x;
            this.y = y;
            this.dis = Math.abs(x - 0) + Math.abs(y - 0);
        }

        public void show(){
            System.out.println(this.index);
        }

        @Override
        public int compareTo(Pos pos){
            if (this.dis == pos.dis){
                return Integer.compare(this.index, pos.index);
            }
            return Integer.compare(this.dis, pos.dis);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pos[] pos = new Pos[n];

        for (int x=0; x<n; x++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            pos[x] = new Pos(x+1, x1, y1);
        }

        Arrays.sort(pos);

        for (Pos next : pos){
            next.show();
        }

    }
}