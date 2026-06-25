import java.util.*;

public class Main {
    static List<Integer> list;
    static void push_back(int value){
        list.add(value);
    }
    static void pop_back(){
        list.remove(list.size()-1);
    }
    static void get(int index){
        System.out.println(list.get(index - 1));
    }
    static void size(){
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enter = sc.nextInt();

        list = new ArrayList<>();

        for (int x=0; x<enter; x++){
            String enter2 = sc.next();

            if (enter2.equals("push_back")){
                int value = sc.nextInt();
                push_back(value);
            }
            else if (enter2.equals("pop_back")){
                pop_back();
            }
            else if (enter2.equals("size")){
                size();
            }
            else if (enter2.equals("get")){
                int index = sc.nextInt();
                get(index);
            }
        }
    }
}