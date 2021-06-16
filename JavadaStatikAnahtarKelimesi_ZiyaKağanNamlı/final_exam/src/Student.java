public class Student {
    public static int count;
    public String name;
    Student(String SendedName){
        name=SendedName;
        count++;
    }
    static void printCount(){
        System.out.println(count);
    }
}
