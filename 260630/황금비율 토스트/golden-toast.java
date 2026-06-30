import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String word = sc.next();

        for (int x=0; x<n; x++){
            list.add(word.charAt(x));
        }

        ListIterator<Character> l = list.listIterator(list.size());

        for (int x=0; x<m; x++){
            String enter = sc.next();

            if (enter.equals("L")){
                if (l.hasPrevious()){
                    l.previous();
                }
            } else if (enter.equals("R")){
                if (l.hasNext()){
                    l.next();
                }
            } else if (enter.equals("P")){
                String ex = sc.next();
                l.add(ex.charAt(0));
            } else if (enter.equals("D")){
                if (l.hasNext())
                {
                    l.next();
                    l.remove();
                }
            }
        }

        while(l.hasPrevious())
            l.previous();

    
        while(l.hasNext())
            System.out.print(l.next());
       
    }
}