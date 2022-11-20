/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisted;

/**
 *
 * @author Юрий
 */
public class Main {
    public static void main(String[] args) {
       
        LinkedListed <Point> listPoint = new LinkedListed<>();
        
        listPoint.addFirst(new Point(5, 50)); // добавление значения в начало списка
        listPoint.addFirst(new Point(65, 60));
        listPoint.addFirst(new Point(58, 89));
        listPoint.addFirst(new Point(5, 75));
        
       
        listPoint.addLast(new Point(5, 50)); //добавление  значения в  конец списка
        listPoint.addLast(new Point(65, 60));
        listPoint.addLast(new Point(58, 89));
        listPoint.addLast(new Point(5, 75));
        
         
         System.out.println("Переборка  при помощи оператора «for-each» от головы до узла с заданным значением.");
         for(Point point : listPoint){  // содержимое списка от головного узла до узла с заданным значением; если список  заданного значения не содержит, то должно быть перебрано всё содержимое списка;
             if(point.x == 65 && point.y == 60){                 
                 System.out.println(point);
             break;
             }
             System.out.println(point);
           
         }
         
         System.out.println("");
         
         System.out.println("Переборка  при помощи оператора «for-each» от узла с заданным значением до конца списка.");
         
         int isList = 0;
         for(Point point : listPoint){ //содержимое списка от узла с заданным значением до конца списка; если список заданного значения не содержит, то ничего происходить не должно.

             if(point.x == 65 && point.y == 60){
                 isList = 1;
             }
             if(isList == 1)
                 System.out.println(point);
         }
        
        System.out.println("");
        
        System.out.println("Переборка значений с использованием цикла forEach");
        
         for(Point point : listPoint ){
            System.out.println(point);
            
         }
         
          System.out.println("");
          
       listPoint.extractValueFirst(); //извлечение значения из начала списка без его удаления из списка
       listPoint.extractValueTail(); //извлечение значения из конца списка без его удаления из списка
       listPoint.extractValueFirstFromDelete(); //извлечение значения из начала списка с удалением из списка
       listPoint.extractValueTailFromDelete1(); //извлечение значения из конца списка с удалением из списка
        
       System.out.println("");
       
       System.out.println("Использование цикла forEach после удаления значений");
        
         for(Point point : listPoint ){
            System.out.println(point);
       
    }
         
         
         }
}

   
    


