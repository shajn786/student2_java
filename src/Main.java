

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int rollno,adno,opt;
    static String name,college;
    static ArrayList<Student> list=new ArrayList<Student>();

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        while(true) {

            System.out.println("Employee App");
            System.out.println("1 : Add Student\n"
            );
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("enter the roll no");
                    rollno = sc.nextInt();
                    System.out.println("enter the name");
                    name = sc.next();
                    System.out.println("enter the admission number");
                    adno = sc.nextInt();
                    System.out.println("enter the college name");
                    college = sc.next();

                    list.add(new Student(rollno,adno,name,college));
                    System.out.println("SUCCESSFULLY ADDED");
                    break;

            }
        }
    }
}