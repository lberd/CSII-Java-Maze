/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazerunner;

import java.util.ArrayList;

/**
 *
 * @author stu872539
 */
public abstract class CBase implements Collection {
    public ArrayList<Point> a = new ArrayList<Point>();
    
    public boolean isEmpty(){
        return a.isEmpty();
    }
    
    public int size(){
        return a.size();
    }
    
    public void add(Point s){
        a.add(s);
    }
}
