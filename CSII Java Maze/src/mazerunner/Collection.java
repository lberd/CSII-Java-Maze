/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazerunner;

/**
 *
 * @author stu872539
 */
public interface Collection {
    
    public abstract boolean isEmpty();
    
    public abstract int size();
    
    public abstract void add(Point s);
    
    public abstract Point get();
}
