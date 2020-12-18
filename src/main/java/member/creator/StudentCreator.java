package member.creator;

import university.member.*;

public class StudentCreator extends MemberCreator {
    @Override
    public Student CreateMember(){
        System.out.println("Create a new student.");
        return new Student();
    }
}
