package university.member;

import java.util.ArrayList;

public class Student extends Member {
    private ArrayList<Lecturer> followings = new ArrayList<>();
    
    public Student(){}
    
    public void following(ArrayList<Lecturer> lecturers) {
        for (Lecturer lecturer: lecturers){
            followings.add(lecturer);
            lecturer.addFollower(this);
        }
    }
    
    @Override
    public void printInfo(){
        System.out.println("...");
    }
    
    public void update(String s) {
      System.out.println(s); 
   }
}
