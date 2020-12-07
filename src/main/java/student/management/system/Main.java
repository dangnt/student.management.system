package student.management.system;

import java.util.Scanner;
import member.creator.*;
import university.member.*;

public class Main {

    public static void main(String [] args){
        Member member;
        MemberCreator memberFactory = new MemberCreator();
                
        Scanner MyInput = new Scanner(System.in);
        System.out.println("Add a new member (Lecturer/Student)? ");
        String MemberType = MyInput.nextLine();
                
        if(MemberType.equalsIgnoreCase("lecturer")){
            memberFactory = new LecturerCreator();
        }
        else if (MemberType.equalsIgnoreCase("student")){
            memberFactory = new StudentCreator();
        }
        
        member = memberFactory.CreateMember();
        
        // Add member to an array
    }
}
