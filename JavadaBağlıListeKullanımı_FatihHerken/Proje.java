import java.util.LinkedList;
import java.util.Queue;
 class Main {
     public static void main(String[] args){
         
         Queue<String> languages = new LinkedList<>();
         
         languages.add("Python");
         languages.add("Java");
         languages.add("C");
         System.out.println("LinkedList: " + languages);
         
         String str1 = languages.peek();
         System.out.println("Accessed Element: " + str1);
         
         String str2 = languages.poll();
         System.out.println("Remove Element: " + str2);
         System.out.println("LinkedList after poll(): " + languages);
         
         languages.offer("Swift");
         System.out.println("LinkedList after offer(): " + languages);
                 
         
        
     }
 }

