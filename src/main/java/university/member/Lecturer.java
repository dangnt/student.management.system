package university.member;

import java.util.ArrayList;

public class Lecturer extends Member {
    private ArrayList<Student> StudentList = new ArrayList<>();
    
    @Override
    public void printInfo(){
        System.out.println("...");
    }
    
    public void addObserver(Student s){
      StudentList.add(s);		
   }
    
    public void notifyStudents(){
      for (Student s : StudentList) {
         s.update("...");
      }
    }
}
