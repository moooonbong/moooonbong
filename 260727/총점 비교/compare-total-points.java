import java.util.*;

public class Main {
    static class Student implements Comparable<Student> { 
        String name; 
        int score1;
        int score2;
        int score3;
        int total;

        Student(String name, int score1, int score2, int score3){
            this.name = name;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
            this.total = score1 + score2 + score3;
        }


        public void show(){
            System.out.println(name + " " + score1 + " " + score2 + " " + score3);
        }

        @Override
        public int compareTo(Student student){
            return Integer.compare(this.total, student.total);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] student = new Student[n];

        for (int x=0; x<n; x++){
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            student[x] = new Student(name, score1, score2, score3);
        }

        Arrays.sort(student);

        for (int x=0; x<n; x++){
            student[x].show();
        }
    }
}