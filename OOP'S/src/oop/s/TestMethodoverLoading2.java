/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.s;

/**
 *
 * @author Linga357
 */
public class TestMethodoverLoading2 {
    private String  formatnumber(int value){
        return String.format("%d", value);
    }
    private String formatnumber(double value){
      return String.format("%2f", value);
      
    }
    private String formatnumber(float value){
     return String.format("%3f", value);
    }
    public static void main(String[] args) {
        TestMethodoverLoading2 tml=new TestMethodoverLoading2();
        System.out.println(tml.formatnumber(300));
        System.out.println(tml.formatnumber(89.56));
        System.out.println(tml.formatnumber(1987.00));
    }
    
}
