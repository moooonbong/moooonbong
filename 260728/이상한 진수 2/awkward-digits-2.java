import java.util.*;

public class Main {
    static int cal(char[] value){
        int sum = 0;

        for (int x=0; x<value.length; x++){
            if (value[x] == '1'){
                sum += Math.pow(2, x);
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        
        char[] value = new char[a.length()];
        int index = 0;

        for (int x = a.length()-1; x>=0; x--){
            value[index] = a.charAt(x);
            index++;
        }

        int max = Integer.MIN_VALUE;

        for (int x=0; x<value.length; x++){
            boolean flag = false;
            char bit = ' ';
            if(value[x] == '0'){
                value[x] = '1';
                bit = '1';
            }else if (value[x] == '1'){
                value[x] = '0';
                bit = '0';
            }
            max = Math.max(max, cal(value));
            
            if (bit == '1'){
                value[x] = '0';
            }
            else {
                value[x] = '1';
            }
        }

        System.out.println(max);

    }
}