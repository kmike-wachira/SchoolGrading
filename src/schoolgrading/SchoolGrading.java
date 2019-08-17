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

public class SchoolGrading {

    Scanner sc = new Scanner(System.in);
    int age;
    String name;

    public void add() {
        System.out.println("Enter age name followed by age");
        name = sc.next();
        age = sc.nextInt();
        System.out.println("My name is " + name + " and am: " + age + " years old");
    }

    public static void main(String[] args) {
//       GetMarks getmarks=new GetMarks();
//       getmarks.insertMarks();

    AddGrades addGrades=new AddGrades();
      addGrades.setVisible(true);
    }                                            

    

}
