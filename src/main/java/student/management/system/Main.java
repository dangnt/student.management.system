package student.management.system;

import java.util.Scanner;
import java.util.ArrayList;
import member.creator.*;
import university.member.*;

public class Main {

    public static void main(String [] args){
        ArrayList<Member> StudentList = new ArrayList<>();
        ArrayList<Member> LecturerList = new ArrayList<>();

        MemberCreator factory;
                
        Scanner MyInput = new Scanner(System.in);
        System.out.println("Add a new member: (L)ecturer / (S)tudent)? ");
        String MemberType = MyInput.nextLine();
                
        if(MemberType.equalsIgnoreCase("l")){
            factory = new LecturerCreator();
            LecturerList.add(factory.CreateMember());
        }
        else if (MemberType.equalsIgnoreCase("s")){
            factory = new StudentCreator();
            StudentList.add(factory.CreateMember());
        }
    }
}
