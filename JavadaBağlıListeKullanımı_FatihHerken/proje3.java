import java.util.LinkedList;

 class Main {
     public static void main(String[] args) {
         
         LinkedList<String>animals = new LinkedList<>();
         animals.add("Cow");
         animals.add("Cat");
         animals.add("Dog");
         System.out.println("LinkedList: " + animals);
         
         System.out.println("Accessing Linked List elements: ");
         for(String animal: animals) {
             System.out.print(animal);
             System.out.print(", ");
         }
         

        
     }
 }