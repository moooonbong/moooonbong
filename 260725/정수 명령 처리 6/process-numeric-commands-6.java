import java.util.*;
import java.io.*;

public class Main {
    static List<Integer> list;
    static void push(int value){
        list.add(value);
        Collections.sort(list);
    }
    static void pop(){
        System.out.println(list.get(list.size()-1));
        list.remove(list.size()-1);
    }
    static void size(){
        System.out.println(list.size());
    }
    static void empty(){
        System.out.println(list.isEmpty() ? 1 : 0);
    }
    static void top(){
        System.out.println(list.get(list.size()-1));
    }
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();

        for (int x=0; x<n; x++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")){
                int value = Integer.parseInt(st.nextToken());

                push(value);
            }
            else if (order.equals("size")){
                size();
            }
            else if (order.equals("empty")){
                empty();
            }
            else if (order.equals("pop")){
                pop();
            }
            else if (order.equals("top")){
                top();
            }
        }
    }
}