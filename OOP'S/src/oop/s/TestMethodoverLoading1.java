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
public class TestMethodoverLoading1 {
    
    private static void display(int a){
        System.out.println("Got integer Value");
    }
    private static void display(double b){
        System.out.println("Got the floating points");
    }
    public static void main(String[] args) {
        TestMethodoverLoading1 tml=new TestMethodoverLoading1();
        tml.display(100);
        tml.display( 202.00);
    }
}
