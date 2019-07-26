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
class A{
float salary=20000;
}
class B extends A{
double bounces=1000;
}

public class Inheritance0 {
    public static void main(String[] args) {
        B b=new B();
        System.out.println("person A salary : "+b.salary);
        System.out.println("person A bounce: "+b.bounces);

    }
}
