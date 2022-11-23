

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
           +"2 : View Student\n" +
                    "3 : Search student" );
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
                case 2:

                    System.out.println("Student List");
                    for(Student  e : list)
                    {
                        System.out.println("Roll No :"+e.rollno);
                        System.out.println("Name :"+e.name);
                        System.out.println("Adminssion Number :"+e.adno);
                        System.out.println("College Name :"+e.college);
                        System.out.println("------------------------------");
                    }
                    break;

                case 3:

                System.out.println("enter the admission number");
                int id = sc.nextInt();

                for(Student e : list)
                {
                    if(id == e.adno)
                    {
                        System.out.println("Roll No :"+e.rollno);
                        System.out.println("Name :"+e.name);
                        System.out.println("Adminssion Number :"+e.adno);
                        System.out.println("College Name :"+e.college);
                        System.out.println("------------------------------");

                    }
                }
                break;
            }
        }
    }
}