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
public class Queue extends CBase {
    
    public Point get(){
        if (a.isEmpty())
            return null;
        return a.remove(0);
    }
    
    @Override
    public String toString(){
        return "Queue of " + a.size() + " Strings";
    }
}
