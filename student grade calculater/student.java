import java.util.*;
import java.io.*;
public class student{
    Scanner st = new Scanner(System.in);
    double avg,total=0;
    int sub;
    public void getmarks(){
        System.out.println("Enter the Total Number of Subjects :");
        sub = st.nextInt();
        int[] marks = new int[sub];
        System.out.println("***MARKS OF THE SUBJECTS***");
        for(int i=0;i<sub;i++){
            System.out.println("Mark of Subject "+(i+1)+":");
            marks[i] = st.nextInt();
            System.out.println();
            total+=marks[i];
       }
    }
    public void totmarks(){
        System.out.println("***TOTAL MARKS OBTAINED IN ALL SUBJECTS*** ");
        System.out.println();
        System.out.println("TOTAL :"+total);
        System.out.println();
    }
    public void average(){
        avg = total/sub;
        System.out.println("***AVERAGE OF THE MARKS SCORED IN TOTAL***");
        System.out.println();
        System.out.println("Average = "+avg);
        System.out.println();
    }
    public void calcgrade(){
        String grade;
        System.out.println("***GRADE YOU HAVE SECURED IN THE EXAMINATION***");
        if(avg>=95){
            grade="O";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else if(avg>=80){
            grade ="A+";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else if(avg>=70){
            grade ="A";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else if(avg>=65){
            grade ="B+";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else if(avg>=55){
            grade ="B";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else if(avg>=50){
            grade ="C";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else if(avg>=45){
            grade ="D";
            System.out.println("You have secured"+ " " +grade+ " Grade in the Exam");
        }
        else{
            System.out.println();
            System.out.println("Your are Failed in the Exam");
        }
    }
}