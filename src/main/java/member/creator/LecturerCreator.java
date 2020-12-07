package member.creator;

import university.member.*;

public class LecturerCreator extends MemberCreator {
    @Override
    public Lecturer CreateMember(){
        return new Lecturer();
    }    
}
