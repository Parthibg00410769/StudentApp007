package ie.atu;

import java.util.Scanner;

public class StudentApp007 {
    public static void main(String[] args) {
        ///First Instance
        System.out.println("Please enter your student name: ");
        Scanner stringScanner   = new Scanner(System.in);
        String Studentname = stringScanner.nextLine();
        Studentdetails stuDetails = new Studentdetails();
        stuDetails.setName(Studentname);
        //
        System.out.println("Please enter your student email : ");
        String Studentemail = stringScanner.nextLine();
        stuDetails.setEmail(Studentemail);

        //
        System.out.println("Please enter your course information: ");
        String Studentcourse = stringScanner.nextLine();
        stuDetails.setCourse(Studentcourse);

        ///Second Instance

        System.out.println("Please enter your student2 name: ");
        String Student2name = stringScanner.nextLine();
        System.out.println("Please enter your student2 email: ");
        String Student2email = stringScanner.nextLine();
        System.out.println("Please enter your course2 information: ");
        String Student2course = stringScanner.nextLine();

        Studentdetails stu2Details = new Studentdetails(Student2name);
        stu2Details.setEmail(Student2email);
        stu2Details.setCourse(Student2course);


        ///Third Instance

        System.out.println("Please enter your student3 name: ");
        String Student3name = stringScanner.nextLine();
        System.out.println("Please enter your student3 email: ");
        String Student3email = stringScanner.nextLine();
        System.out.println("Please enter your course3 information: ");
        String Student3course = stringScanner.nextLine();
        Studentdetails stu3Details = new Studentdetails(Student3name, Student3email, Student3course);


        //////Printing the details////////
        System.out.println(stuDetails.getName());
        System.out.println(stuDetails.getEmail());
        System.out.println(stuDetails.getCourse());

        System.out.println(stu2Details.getName());
        System.out.println(stu2Details.getEmail());
        System.out.println(stu2Details.getCourse());

        System.out.println(stu3Details.getName());
        System.out.println(stu3Details.getEmail());
        System.out.println(stu3Details.getCourse());





    }
}
