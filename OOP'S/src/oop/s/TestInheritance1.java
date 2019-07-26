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
 class Fox {
    void eat(){
        System.out.println("Eating");
    }}
   class Dog extends Fox{
   void tog(){
       System.out.println("Dog to tog and inheritance");
   }

   } 
    class TestInheritance1{
       public static void main(String[] args) {
           Dog e=new Dog();
           e.eat();
           e.tog();
       }
   
   }
