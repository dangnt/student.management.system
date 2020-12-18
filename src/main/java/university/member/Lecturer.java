package university.member;

import java.util.ArrayList;

public class Lecturer extends Member {
    private ArrayList<Student> followers = new ArrayList<>();
    
    public Lecturer(){}
    
    @Override
    public void printInfo(){
        System.out.println("...");
    }
    
    public void addFollower(Student student){
      followers.add(student);		
    }
    
    public void addAllFollowers(ArrayList<Student> students) {
        for (Student student: students){
            followers.add(student);
        }
    }
    
    public void notifyAllFollowers(){
      for (Student student : followers) {
         student.update("...");
      }
    }
}
