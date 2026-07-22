import java.util.*;

class Main{
    static char[] a;
    static int runLength(){
        StringBuilder sb = new StringBuilder();
        
        char prev = ' ';
        int count = 0;
        
        for (int x=0; x<a.length; x++){
            if (x == 0){
                sb.append(a[x]);
                prev = a[x];
                count++;
                continue;
            }
            char current = a[x];
            if (current != prev){
                sb.append(count);
                sb.append(current);
                count=0;
            }
            prev = current;
            count++;
        }

        if (count != 0)
            sb.append(count);

        return sb.length();
    }
    static void shake(){
        char temp = a[a.length-1];

        for (int x=a.length-1; x>=1; x--){
            a[x] = a[x-1];
        }
        a[0] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String origin = sc.next();
        a = new char[origin.length()];

        for (int x=0; x<origin.length(); x++){
            a[x] = origin.charAt(x);
        }

        int min = Integer.MAX_VALUE;
        for (int x=0; x<origin.length(); x++){
            min = Math.min(runLength(), min);

            shake();
        }

        System.out.println(min);
    }
}