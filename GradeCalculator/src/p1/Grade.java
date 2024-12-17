package p1;
import java.util.*;

class Gradecalc {
    int marks;
    String subjectname;
    double avg = 0;
    int total = 0;
    Gradecalc(int marks, String subjectname) {
        this.marks = marks;
        this.subjectname = subjectname;
    }
    public int getmarks() {
        return marks;
    }

    public String getsubjectname() {
        return subjectname;
    }
    public void calcmarks(int marks) {
        total += marks;
    }
    public void calcavg(int subjects) {
        avg = (double) total / subjects;
        System.out.println("Average percentage = " + avg);
    }
    public String gradecalc() {
        if (avg >= 95 || avg <= 100) {
            return "O";
        } 
        else if (avg >= 90 || avg < 95) {
            return "A+";
        } 
        else if (avg >= 85 || avg < 90) {
            return "A";
        } 
        else if (avg >= 80 || avg < 85) {
            return "B+";
        } 
        else if (avg >= 75 || avg < 80) {
            return "B";
        } 
        else if (avg >= 70 || avg < 75) {
            return "C+";
        } 
        else if (avg >= 65 || avg < 70) {
            return "C";
        } 
        else if (avg >= 60 || avg < 65) {
            return "D";
        } 
        else if (avg >= 50 || avg < 60) {
            return "E";
        } 
        else {
            return "F";
        }
    }
    public void displayResults() {
        System.out.println("Subject: " + subjectname + " | Marks: " + marks);
    }
}
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        Gradecalc g[] = new Gradecalc[subjects];
        for (int i = 0; i < subjects; i++) {
            sc.nextLine();
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            String subjectName = sc.nextLine();
            System.out.print("Enter marks for " + subjectName + ": ");
            int marks = sc.nextInt();
            g[i] = new Gradecalc(marks, subjectName);
            g[i].calcmarks(marks);
        }
        System.out.println("---------RESULTS----------");
        for (int i = 0; i < subjects; i++) {
            g[i].displayResults();
        }
        g[0].calcavg(subjects);
        String grade = g[0].gradecalc();
        System.out.println("Final Grade: " + grade);
    }
}

