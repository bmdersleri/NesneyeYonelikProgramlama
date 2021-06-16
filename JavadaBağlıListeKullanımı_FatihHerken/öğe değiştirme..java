import java.util.LinkedList;
 class Main {
     public static void main(String[] args){
         
         LinkedList<String> languages = new LinkedList<>();
         
         languages.add("Python");
         languages.add("Java");
         languages.add("JavaScript");
         languages.add("Java");
         System.out.println("LinkedList: " + languages);
         
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);
     }
 }