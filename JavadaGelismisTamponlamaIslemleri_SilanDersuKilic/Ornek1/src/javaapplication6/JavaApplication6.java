/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.nio.*;
import java.util.*;
/**
 *
 * @author silan
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte[] bbb = { 10, 20, 30 };
  
        // print the byte array length
        System.out.println("Array length : "
                           + bbb.length);
  
        // print the byte array element
        System.out.println("\nArray element : "
                           + Arrays.toString(bbb));
  
        // wrap the byte array into byteBuffer
        // using wrap() method
        ByteBuffer byteBuffer = ByteBuffer.wrap(bbb);
  
        // Rewind the ByteBuffer
        byteBuffer.rewind();
  
        // print the byte buffer
        System.out.println("\nbyteBuffer : "
                           + Arrays.toString(byteBuffer.array()));
  
        // print the ByteBuffer capacity
        System.out.println("\nbyteBuffer capacity : "
                           + byteBuffer.capacity());
  
        // print the ByteBuffer position
        System.out.println("\nbyteBuffer position:  "
                           + byteBuffer.position());
    }
    
}
