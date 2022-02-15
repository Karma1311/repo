/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Wow {
    public static void main(String[] args){
        String paraula;
        char lletra1;
        Scanner key= new Scanner(System.in);
        paraula= key.nextLine();
        for(int i=0; i<paraula.length();i++){
            lletra1= (paraula.charAt(i));
          if(lletra1==lletra1){
              System.out.println("NO");
          }
          else if(lletra1!= lletra1){
              System.out.println("SI");
          }
        
    }
    
}
}
