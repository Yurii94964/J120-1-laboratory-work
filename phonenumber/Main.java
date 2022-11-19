/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumber;

import java.util.HashSet;


/**
 *
 * @author Юрий
 */
public class Main {
    public static void main(String[] args) {
        
        PhoneNumber phone1 = new PhoneNumber("921","0234567");
        PhoneNumber phone2 = new PhoneNumber("981","0234566");
        PhoneNumber phone3 = new PhoneNumber("7890","654321");
        
        
        HashSet <PhoneNumber> phoneNumber = new HashSet<>(); // Это класс реализует интерфейс Set. Он создает коллекцию, которая использует хеш-таблицу для хранения.
        phoneNumber.add(phone1);
        phoneNumber.add(phone2);
        phoneNumber.add(phone3);
        
        for(PhoneNumber number : phoneNumber){
            /*PhoneNumber тип итерационной переменной.  For-each — это разновидность 
            цикла for, которая используется, когда нужно обработать все элементы массива или коллекции. “For each” с английского так и переводится — “для каждого”.*/ 
            System.out.println(number);
            
        }
       
    }
    
}
