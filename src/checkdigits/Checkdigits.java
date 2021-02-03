/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkdigits;

/**
 *
 * @author tim
 */
import java.util.Scanner;
public class Checkdigits {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your barcode?");
        String code = input.next();
        int Event=0;
        int Oddt = 0;
        
        for(int i=0;i<code.length();i++){
            if (i%2==0){
              Event=Event+ Integer.parseInt(code.charAt(i)+"");
            }
            else{
                Oddt=Oddt+Integer.parseInt(code.charAt(i)+"");
                
            }
        }
        
        System.out.println(Event +" "+Oddt);
        
    }
    
}

    
