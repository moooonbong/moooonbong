import java.util.*;
import java.io.*;

public class Main {
    static List<Integer> list;
    static void push_front(int a){
        if (list.isEmpty())
            list.add(a);
        else 
            list.add(0, a);
    }
    static void push_back(int a){
        list.add(a);
    }
    static void pop_front(){
        System.out.println(list.get(0));
        list.remove(0);
    }
    static void pop_back(){
        System.out.println(list.get(list.size()-1));
        list.remove(list.size()-1);
    }
    static void size(){
        System.out.println(list.size());
    }
    static void empty(){
        System.out.println(list.isEmpty() ? 1 : 0);
    }
    static void front(){
        if (list.isEmpty())
            System.out.println("list is empty");
        else 
            System.out.println(list.get(0));
    }
    static void back(){
        if (list.isEmpty())
            System.out.println("list is empty");
        else 
            System.out.println(list.get(list.size()-1));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();

        for (int x=0; x<a; x++){
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("push_back")){
                int value = Integer.parseInt(st.nextToken());
                push_back(value);
            } else if (order.equals("push_front")){
                int value = Integer.parseInt(st.nextToken());
                push_front(value);
            } else if (order.equals("pop_back")){
                pop_back();
            } else if (order.equals("pop_front")){
                pop_front();
            } else if (order.equals("size")){
                size();
            } else if (order.equals("empty")){
                empty();
            } else if (order.equals("front")){
                front();
            } else if (order.equals("back")){
                back();
            }
        }
    }
}