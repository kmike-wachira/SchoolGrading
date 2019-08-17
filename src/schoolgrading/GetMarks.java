/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolgrading;

/**
 *
 * @author kmike
 */
import java.util.Scanner;

public class GetMarks {

/*
Grade    point  Score  comment
        A   12  81-84  Excellent 
        A   11  74-80  Very good 
        B+  10  67-73  Good 
        B   9  60-66   Good 
        B-  8  53-59   Good  
        C+  7  46-52   Fairly good 
        C   6  39-45   Fairly good 
        C-  5  32-38   Fairly good 
        D+  4  25-31   Improve 
        D   3  18-24   Improve 
        D-  2  11-17   Weak improve 
        E   1  0-10    Weak improve 
    
    
     //Subject codes
            SUBJECT  CODE 
            English    101 
            Kiswahili  102 
            Maths      121 
            Biology    231 
            Physics    232 
            Chemistry  233 
            History    311 
            Geography  312 
            Cre        313 
            home science  441 
            Agriculture  443 
            Computer   451 
            Business education  565 
    */
//    Variable declaration
    Scanner sc = new Scanner(System.in);
    int score, points, english, kiswahili, maths;
    String comment, Grade;
    int[] subjectmarks = {english, kiswahili, maths};
    String[] subjectTitle = {"English", "Kiswahili", "Maths"};

//    inserting method
    void insertMarks() {
        for (int i = 0; i < subjectmarks.length; i++) {
            System.out.println("Enter " + subjectTitle[i] + " marks");
            subjectmarks[i] = sc.nextInt();
        }
        for (int i = 0; i < subjectmarks.length; i++) {
            System.out.println(subjectTitle[i] + "  " + subjectmarks[i]);
            score=subjectmarks[i];
            grading();
        }
    }
//    grading method

    void grading() {
        if(score>=0 && score<=10){
           points=1;
           Grade="E";
           comment=" Weak improve ";
        }else if(score>=11 && score<=17){
           points=2;
           Grade="D-";
           comment=" Weak improve ";
        }else if(score>=18 && score<=24){
           points=3;
           Grade="D";
           comment=" Improve ";
        }else if(score>=25 && score<=31){
           points=4;
           Grade="D+";
           comment=" Improve ";
        }else if(score>=32 && score<=38){
           points=5;
           Grade="C-";
           comment=" Fairly good ";
        }else if(score>=39 && score<=45){
           points=2;
           Grade="C";
           comment=" Fairly good ";
        }else if(score>=46 && score<=52){
           points=2;
           Grade="C+";
           comment=" Fairly good ";
        }else if(score>=53 && score<=59){
           points=2;
           Grade="B-";
           comment=" Good ";
        }else if(score>=60 && score<=66){
           points=2;
           Grade="B";
           comment=" Good ";
        }else if(score>=67 && score<=73){
           points=2;
           Grade="B+";
           comment=" Good ";
        }else if(score>=74 && score<=80){
           points=2;
           Grade="A-";
           comment="Very Good";
        }else if(score>=81 && score<=100){
           points=2;
           Grade="A";
           comment=" Excellent ";
        }else{
            System.out.println("Invalid score");
        }
         System.out.println(score + Grade + comment + points);
    }
    
//    student details
    String names , dateOfBirth ,gender,regularity, dateOfAdm, classOfAdm;
    int admNo,parentsPhone;
}
