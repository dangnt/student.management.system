package member.creator;

import university.member.*;

public class LecturerCreator extends MemberCreator {
    @Override
    public Lecturer CreateMember(){
        System.out.println("Create a new lecturer.");
        return new Lecturer();
    }    
}
