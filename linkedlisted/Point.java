/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisted;

import java.util.Objects;

/**
 *
 * @author Юрий
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        //if(o==null) return false;
        //if(!this.getClass().equals(o.getClass())) return false;
        if(!(o instanceof Point)) return false;
        Point point = (Point)o;
        return x==point.x && y==point.y && hashCode()==point.hashCode();
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
    

