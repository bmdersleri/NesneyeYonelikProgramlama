/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DizilerdeBinarySearchYöntemiAramaYapmak;

/**
 *
 * @author Sena Özkara
 */
public class DizilerdeBinarySearchYöntemiAramaYapmak {

    /**
     * @param args the command line arguments
     */
    
    
    private static int[] generateUnorderedArray() {

       //create array
        int[] unOrderedArray  =  {5, 3, 13, 10, 15, 8};

        //return array
        return unOrderedArray;
}
    
    
    private static int[] generateOrderedArray() {
        
       //create an int array
        int[] orderedArray  = {3, 5, 8, 10, 13, 15};

        //return ordered array
        return orderedArray;
}
    
    //Lineer Search:
        private static boolean linearSearch(int[] unOrderedArray, int searchKey) {

    //search for key
    for (int i = 0; i < unOrderedArray.length-1; i++) {
       if( unOrderedArray[i] == searchKey )
           return true;
    }
    
    return false;
}
        
        
        //Binary Search :
        public static int binarySearch(int[] orderedArray, int key) {

        int low = 0;
        int high = orderedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = orderedArray[mid];
                
             if(midVal == key) {
                return key; // key found
             }

            if (midVal < key)
                low = mid + 1;
                
           if (midVal > key)
                high = mid - 1;
     
        }
   
        return 0;
     }
    public static void main(String[] args) 
    {
  
     

    }
 
    }
    

