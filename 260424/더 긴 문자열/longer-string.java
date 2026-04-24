import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();


        String[] word = a.split(" ");

        if (word[0].length() > word[1].length())
        {
            System.out.println(word[0] + " " + word[0].length());
        }
        else if (word[0].length() < word[1].length())
        {
            System.out.println(word[1] + " " + word[1].length());
        }
        else 
            System.out.println("same");

    }
}