import java.util.*;

public class Main {
    static class Day {
        String date;
        String day;
        String weather;

        Day(String date, String day, String weather){
            this.date = date;
            this.day = day;
            this.weather = weather;
        }

        public boolean check(){
            if (this.weather.equals("Rain"))
                return true;
            
            return false;
        }

        public void show(){
            System.out.println(this.date + " " + this.day + " " + this.weather);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Day> queue = new PriorityQueue<>((a, b) -> a.date.compareTo(b.date));

        for (int x=0; x<n; x++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            Day day1 = new Day(date, day, weather);

            queue.add(day1);
        }

        while(!queue.isEmpty()){
            Day day2 = queue.poll();

            if (day2.check()){
                day2.show();
                break;
            }
        }
    }
}