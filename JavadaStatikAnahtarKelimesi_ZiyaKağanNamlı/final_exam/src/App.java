
public class App {
    public static void main(String[] args) throws Exception {
       Student s1 = new Student("ayşe");
       Student s2 = new Student("mehmet");
       Student s3 = new Student("ali");
       Student s4 = new Student("veli");

    
       Managers.registerStudent(s1);
       Managers.registerStudent(s2);
       Managers.registerStudent(s3);
       Managers.registerStudent(s4);
       Managers.schoolMembers();
       Managers.removeStudent(s2);
       Managers.schoolMembers();
       Student s5 = new Student("ziya");
       Managers.registerStudent(s5);
       Managers.schoolMembers();






        





      



    }
}
