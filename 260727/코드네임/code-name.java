import java.util.*;
public class Main {
    static class Agent{
        String code;
        int score;
        Agent(String code, int score){
            this.code = code;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        String minCode = " ";

        for (int x=0; x<5; x++){
            String codeName = sc.next();
            int score = sc.nextInt();

            Agent agent = new Agent(codeName, score);
            if(min > score){
                min = score;
                minCode = codeName;
            }
        }   
        System.out.println(minCode + " " + min);
    }
}