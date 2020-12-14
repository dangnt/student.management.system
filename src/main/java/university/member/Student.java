package university.member;

public class Student extends Member {
    public Student() {}
    
    public void printInfo(){
        System.out.println("...");
    }
    
    public void update(Member m) {
      System.out.println("Welcome new lecturer!"); 
      m.printInfo();
   }
}
