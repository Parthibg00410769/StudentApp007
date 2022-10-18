package ie.atu;

import java.util.Scanner;

public class StudentApp007 {
    public static void main(String[] args) {
        ///##First Instance
        System.out.println("Please enter your student name: ");
        Scanner stringScanner   = new Scanner(System.in);
        String Studentname = stringScanner.next();
        Studentdetails stuDetails = new Studentdetails();
        System.out.println(Studentname);
        stuDetails.setName(stuDetails.getName());
        //
        System.out.println("Please enter your student email: ");
        String Studentemail = stringScanner.next();
        stuDetails.setEmail(Studentemail);
        System.out.println(stuDetails.getEmail());

        //
        System.out.println("Please enter your course information: ");
        String Studentcourse = stringScanner.next();
        stuDetails.setCourse(Studentcourse);
        System.out.println(stuDetails.getCourse());

        ///##Second Instance
        Studentdetails stu2Details = new Studentdetails();
        System.out.println("Please enter your student2 name: ");
        String Student2name = stringScanner.next();
        stu2Details.setName(Student2name);
        System.out.println(stu2Details.getName());

        //
        System.out.println("Please enter your student2 email: ");
        String Student2email = stringScanner.next();
        stu2Details.setEmail(Student2email);
        System.out.println(stu2Details.getEmail());

        //
        System.out.println("Please enter your course2 information: ");
        String Student2course = stringScanner.next();
        stu2Details.setCourse(Student2course);
        System.out.println(stu2Details.getCourse());

        ///Instance 3
        Studentdetails stu3Details = new Studentdetails();
        System.out.println("Please enter your student3 name: ");
        String Student3name = stringScanner.next();
        stu3Details.setName(Student3name);
        System.out.println(stu3Details.getName());

        //
        System.out.println("Please enter your student3 email: ");
        String Student3email = stringScanner.next();
        stu3Details.setEmail(Student3email);
        System.out.println(stu3Details.getEmail());

        //
        System.out.println("Please enter your course3 information: ");
        String Student3course = stringScanner.next();
        stu3Details.setCourse(Student3course);
        System.out.println(stu3Details.getCourse());





    }
}
