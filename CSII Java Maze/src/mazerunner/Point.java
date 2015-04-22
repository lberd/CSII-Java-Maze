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
public class Point {
    public int x;
    public int y;
    public Point previousPoint;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        this.previousPoint = null;
    }
    public Point(int x, int y, Point previousPoint){
        this.x = x;
        this.y = y;
        this.previousPoint = previousPoint;
    }
    
    @Override
    public String toString(){
        return "string";
    }
    
    
}
