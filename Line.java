/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationinterface;

/**
 *
 * @author Ashad Nadeem
 */
public class Line implements RelationInterface{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    Line(int x1,int x2,int y1,int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getLenght(){
        return Math.sqrt(Math.pow(this.y2 - this.y1, 2) + Math.pow(this.x2 - this.x1, 2));
    }
    public boolean isGreater(Object a, Object b){
        Line A = (Line)a;
        Line B = (Line)b;
        if (A.getLenght()>B.getLenght()) return true;
        else return false;
    }
    public boolean isLess(Object a, Object b){
        Line A = (Line)a;
        Line B = (Line)b;
        if (A.getLenght()<B.getLenght()) return true;
        else return false;
    }
    public boolean isEqual(Object a, Object b){
        Line A = (Line)a;
        Line B = (Line)b;
        if (A.getLenght()==B.getLenght()) return true;
        else return false;
    }
    
    
}
