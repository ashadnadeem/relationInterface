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

public class Test {
    public static void main(String[]args){
        Line L1 = new Line(1,2,3,4);
        Line L2 = new Line(2,3,4,5);
        
        System.out.println("Line 1 isEqual to Line 2: " + L1.isEqual(L1, L2));
        System.out.println("Line 1 isGreaterThan to Line 2: " + L1.isGreater(L1, L2));
        System.out.println("Line 1 isLesserThan to Line 2: " + L1.isLess(L1, L2));
        
        RelationInterface L3 = new Line(3,4,5,6);
        
        System.out.println("Line 3 isEqual to Line 1: " + L3.isEqual(L3,L1));
        
        //Error  
        //System.out.println("Length of line3 is " + L3.getLenght());
       
    }
}
