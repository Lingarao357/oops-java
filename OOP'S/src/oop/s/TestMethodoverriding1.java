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
 class TestMethodoverriding1 {
    void msg(){
        System.out.println("this the parent class");
    }
    
}
class Ride extends TestMethodoverriding1{
void msg(){
    System.out.println("this is the chalid class");
}
    public static void main(String[] args) {
        TestMethodoverriding1 tml1=new Ride();
        tml1.msg();
    }
}

