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
class Animal{
void eat(){System.out.println("eating");}
}
class Dogs extends Animal{
void tog(){System.out.println("Bewwwww");}
}
class Tfox extends Dogs{
void fox(){System.out.println("fox containe");}
}
class Duck extends Tfox{
void uck(){System.out.println("Duck");}
}


public class TestInheritance2 {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.eat();
        d.fox();
        d.tog();
        d.uck();
    }
}
