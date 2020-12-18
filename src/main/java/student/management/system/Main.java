package student.management.system;

import java.util.Scanner;
import java.util.ArrayList;
import member.creator.*;
import university.member.*;

public class Main {

    public static void main(String [] args){
        ArrayList<Student> StudentList = new ArrayList<>();
        ArrayList<Lecturer> LecturerList = new ArrayList<>();
        
        Scanner MyInput = new Scanner(System.in);
        
        while (true) { 
            System.out.println("Add a new member: (L)ecturer / (S)tudent) (or (E)xit)? ");
            String MemberType = MyInput.nextLine();

            if(MemberType.equalsIgnoreCase("l")){
                LecturerCreator factory = new LecturerCreator();
                Lecturer lecturer = factory.CreateMember();
                lecturer.addAllFollowers(StudentList);
                lecturer.notifyAllFollowers();
                LecturerList.add(lecturer);
            }
            else if (MemberType.equalsIgnoreCase("s")){
                StudentCreator factory = new StudentCreator();
                Student student = factory.CreateMember();
                student.following(LecturerList);
                StudentList.add(student);
            }
            else if (MemberType.equalsIgnoreCase("e")){
                break;
            }
        }
    }
}
