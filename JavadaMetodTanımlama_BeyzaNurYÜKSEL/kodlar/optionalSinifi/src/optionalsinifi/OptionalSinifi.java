
package optionalsinifi;

import java.util.Optional;

//java optional sınıfı
public class OptionalSinifi {
  
    public static void main(String[] args) {
         Optional<String> kullanici= Optional.of("Beyza");
         Optional<String> kullanici2= Optional.empty();
       
         if(kulanici.isPresent()){
             System.out.println("değer bulunmakta");
             
         }else{
             System.out.println("değer bulunmuyor");
         
         }
         
         kullanici.ifPresent(g -> System.out.println("kullanıcı adı var."));
         kullanici2.ifPresent(g -> System.out.println("kullanıcı adı var."));
         
         
    }
    
}




