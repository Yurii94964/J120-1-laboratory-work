/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisted;

import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Юрий
 */
public class LinkedListed <T> implements Iterable<T>{
    
    private Node head;
    
    public  LinkedListed(){
        head = null;
    }
    private boolean isEmpty(){
        return head == null;
        
    }
     public void addFirst(T value){ // добавление значения в начало списка
       Node newList = new Node();
       newList.value = value;
       newList.next = head;
       head = newList;
       }
      public Integer get(T value){// определение, содержит ли список заданное значение, или нет;
        if(head == null){
            return -1;
        }
        if(head.value == value){
            return 0;
        }
        Node currentNode = head;
        int result = 0;
        while(currentNode.next != null){
            ++result;
            if(currentNode.next.value == value){
                return result;
            }
         
            currentNode = currentNode.next;
        }
        
        return -1;
         
    }
      
    public void extractValueFirst(){//извлечение значения из начала списка без его удаления из списка
        Node t = this.head;
       System.out.println("First element: " + t.value);
       
    }
    public void extractValueFirstFromDelete(){//извлечение значения из начала списка с удалением из списка
         Node t = this.head;
    System.out.println("First element and delete first: " + t.value);
    if(head == null)        
        return;
    head = head.next;       
                    
    }
    
    public void addLast(T value){ //добавление зхначения в  конец списка
        Node current = head;
        
        while(current.next != null){
            current = current.next;
       }
        Node newList = new Node();
        newList.value = value;
        current.next = newList;
    }
    
     public void extractValueTail(){//извлечение значения из конца списка без его удаления из списка
        Node t = head;
        
        if(head == null){
            return;
        }
        while(t.next != null){
            t = t.next;
            if(t.next == null){
                System.out.println("Last element: " + t.value );
                return;
            }
        }
       
    }
    public void extractValueTailFromDelete1(){//извлечение значения из конца списка с удалением из списка
        Node current = head; 
        Node temp = head;
        if(head == null){  
            return;
        }
        while (current.next != null) {
            current = current.next;
            if(current.next == null){ 
                System.out.println("Last element and delete last: " + current.value );
                current = temp;
                current.next = null;
                return;
                
            }
         temp = temp.next;
        }
    }
    
    public void printLinkedList(){ //печать всех значений списка
        if(head == null) return;
        Node current = head;
        System.out.println(current.value);
        
        while(current.next != null){
            current = current.next;
            System.out.println(current.value);
           
        }
      
    }
     
    private static class Node <T>{
        T value;
        Node next;
    }
     @Override
    public Iterator<T> iterator() {
        return new LinkedListIter<>(head);
    }
    
    private static class LinkedListIter <T> implements Iterator<T>{
        Node node;

        public LinkedListIter(Node head) {
            node = head;
        }

        @Override
        public boolean hasNext() {
            return node!=null;
        }

        @Override
        public T next() {
            Node temp = node;
            node = node.next;
            return (T)temp.value;
        }
    }
   
}
    

 
    

