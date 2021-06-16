import java.util.ArrayList;
import java.util.List;
public class Managers {
    public static List<Student> schoolList = new ArrayList<Student>();
    static int removedCounter=0;
    //Nested Static class yapısını aşağıda görebilirsiniz.
    public static class schoolManager{

        static int nullCheck(){
            for(int i=0; i<schoolList.size(); i++){
                if (schoolList.get(i).name=="RemovedStudent") {
                    return i;   
                }
            }
            return 0;
        }
    }
    public static void schoolMembers(){
        System.out.println("Okulda kayıtlı öğrenci sayısı:" +schoolList.size());
        System.out.println("Okuldaki Öğrenciler");
        for (int i = 0; i < schoolList.size(); i++) {
            System.out.println(schoolList.get(i).name);
        }
    }
    public static void registerStudent(Student sendedStudent){
        if(schoolManager.nullCheck()==0){
            schoolList.add(sendedStudent);
        }
        else{
            schoolList.set(schoolManager.nullCheck(), sendedStudent);
        }
    }
    public static void removeStudent(Student remove){
        System.out.println(remove.name+"isimli öğrencinin kaydı silindi");
        remove.name="RemovedStudent";
        Student.count--;
        System.out.println("  okuldaki toplam öğrenci sayısı : "+schoolList.size() );
    }
}
