import java.util.*;

public class Main {
    static List<Integer> keyList;
    static List<Integer> valueList;
    static void add(int key, int value){
        if (keyList.contains(key)){
            int index = keyList.indexOf(key);
            valueList.set(index, value);
        }
        else {
            keyList.add(key);
            valueList.add(value);
        }
    }
    static void find(int key){
        if (keyList.contains(key)){
            int index = keyList.indexOf(key);
            System.out.println(valueList.get(index));
        }
        else {
            System.out.println("None");
        }
    }
    static void remove(int key){
        if (keyList.contains(key)){
            int index = keyList.indexOf(key);

            valueList.remove(index);
            keyList.remove(index);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        keyList = new ArrayList<>();
        valueList = new ArrayList<>();

        for (int x=0; x<n; x++){
            String order = sc.next();
            int key = sc.nextInt();

            if (order.equals("add")){
                int value = sc.nextInt();
                add(key, value);
            }
            else if (order.equals("find")){
                find(key);
            }
            else if (order.equals("remove")){
                remove(key);
            }
        }
    }
}