import java.util.*;

public class Main {
    static class Student implements Comparable<Student>{
        String name;
        int kor;
        int eng;
        int math;

        Student(String name, int kor, int eng, int math){
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public void show(){
            System.out.println(name + " " + kor + " " + eng + " " + math); 
        }

        @Override
        public int compareTo(Student student){
            if (this.kor == student.kor){
                if (this.eng == student.eng){
                    return Integer.compare(student.math, this.math);
                }
                else {
                    return Integer.compare(student.eng, this.eng);
                }
            }

            return Integer.compare(student.kor, this.kor);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] student = new Student[n];

        for (int x=0; x<n; x++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            student[x] = new Student(name, kor, eng, math);
        }

        Arrays.sort(student);

        for (int x=0; x<n; x++){
            student[x].show();
        }
    }
}