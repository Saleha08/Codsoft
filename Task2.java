import java.util.*;
 class gradeCalculator{
    public static String calculateGrade(double avgPercentage){
        if(avgPercentage>90 && avgPercentage<=100){
            return "A+";
        } else if (avgPercentage>80 && avgPercentage<=90) {
            return "A";
        } else if(avgPercentage>70 && avgPercentage<=80){
            return "B+";
        } else if (avgPercentage>60 && avgPercentage<=70) {
            return "B";
        } else if (avgPercentage>50 && avgPercentage<=60) {
            return "C+";
        } else if (avgPercentage>40 && avgPercentage<=50) {
            return "C";
        }
        else {
            return "Fail";
        }
    }
}
public class Task2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //Input:Total number of Subjects
        System.out.println("Enter the number of subjects:");
        int totalSubject= sc.nextInt();

        //Input:Take marks obtained(out of 100) in each subject.
        int[] marks= new int[totalSubject];
        System.out.println(" Enter the correct marks obtained(out of 100) by student:");

        for(int i=0;i<totalSubject;i++){
            System.out.println("Marks obtained in subject "+(i+1)+":");
            marks[i]= sc.nextInt();
        }
        //Calculate total marks obtained by the student
        int totalMarks=0;
        for (int i:marks){
            totalMarks+=i;
        }
        //Calculate the average percentage
        double avgPercentage = (double) totalMarks/totalSubject;

        //Assign grade based on average percentage acchieved.
        gradeCalculator g =new gradeCalculator();
        String grade=g.calculateGrade(avgPercentage);

        //Display the result
        System.out.println("Total Subjects are: "+totalSubject);
        System.out.println("Total marks obtained is: "+totalMarks);
        System.out.println("Average percentage scored is: "+avgPercentage);
        System.out.println("Grade obtained: "+grade);
        System.out.println("!!!Thank You!!!");



    }
}
