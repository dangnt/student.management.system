package member.creator;

import university.member.*;

public class StudentCreator extends MemberCreator {
    
    @Override
    public Student CreateMember(){
        return new Student();
    }
}
