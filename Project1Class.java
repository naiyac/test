import java.util.Scanner;
import java.math.BigDecimal;

public class Project1Class {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        //asks user for assignment grades

        System.out.print("Enter your grade on Assignment #1: ");
        double assignmentOneGrade = sc.nextDouble();


        System.out.println("Enter your grade on Assignment #2: ");
        double assignmentTwoGrade = sc.nextDouble();


        System.out.println("Enter your grade on Assignment #3: ");
        double assignmentThreeGrade = sc.nextDouble();


        System.out.println("Enter your grade on Assignment #4: ");
        double assignmentFourGrade = sc.nextDouble();


        System.out.println("Enter your grade on Assignment #5: ");
        double assignmentFiveGrade = sc.nextDouble();


        System.out.println("Enter your grade on Assignment #6: ");
        double assignmentSixGrade = sc.nextDouble();

        //asks user for project grades

        System.out.println("Enter your grade on Project #1: ");
        double projectOneGrade = sc.nextDouble();


        System.out.println("Enter your grade on Project #2: ");
        double projectTwoGrade = sc.nextDouble();


        System.out.println("Enter your grade on Project #3: ");
        double projectThreeGrade = sc.nextDouble();

        //asks user for quiz grades

        System.out.println("Enter your grade on Quiz #1: ");
        double quizOneGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #2: ");
        double quizTwoGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #3: ");
        double quizThreeGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #4: ");
        double quizFourGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #5: ");
        double quizFiveGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #6: ");
        double quizSixGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #7: ");
        double quizSevenGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #8: ");
        double quizEightGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #9: ");
        double quizNineGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #10: ");
        double quizTenGrade = sc.nextDouble();


        System.out.println("Enter your grade on Quiz #11: ");
        double quizElevenGrade = sc.nextDouble();


        //asks user for Exam grades

        System.out.println("Enter your grade on the Midterm Exam:  ");
        double midtermExamGrade = sc.nextDouble();


        System.out.println("Enter your grade on the Final Exam: ");
        double finalExamGrade = sc.nextDouble();

        //asks user for participation grade

        System.out.println("Enter your participation grade: ");
        double participGrade = sc.nextDouble();

        //calculates assignment average
        double assignmentAvg = (assignmentOneGrade+assignmentTwoGrade+assignmentThreeGrade+assignmentFourGrade+assignmentFiveGrade+assignmentSixGrade)/6;
        //calculates project average
        double projectAvg = (projectOneGrade+projectTwoGrade+projectThreeGrade)/3;
        //calculates test and quiz average
        double testQuizAvg = (quizOneGrade+quizTwoGrade+quizThreeGrade+quizFourGrade+quizFiveGrade+quizSixGrade+quizSevenGrade+quizEightGrade+quizNineGrade+quizTenGrade+quizElevenGrade+midtermExamGrade+finalExamGrade)/13;

        //calculates final grade
        double finalGradeAvg = (assignmentAvg*.30+projectAvg*.40+testQuizAvg*.20+participGrade*.10);

        //rounds to two decimal places
        double roundOff = Math.round(finalGradeAvg * 100.0) / 100.0;

        System.out.println("Your final grade in COSC 251 is: "+ roundOff+".");



    }

}
