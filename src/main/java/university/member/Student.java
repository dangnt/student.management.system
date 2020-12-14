package university.member;

public class Student extends Member {
    private Lecturer lecturer;
    
    public Student() {}
    
    @Override
    public void printInfo(){
        System.out.println("...");
    }
    
    public void update(String s) {
      System.out.println(s); 
   }
}
