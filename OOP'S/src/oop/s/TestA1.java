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
interface TestA1 {
   void A();
   void B();
   void C();
   void D();
}
 abstract  class Test implements TestA1{
  public void C(){System.out.println("This is the C");}
 }
   class M extends Test{
public void A(){System.out.println("This is the A");}
public void B(){System.out.println("This is the B");}
public void D(){System.out.println("This is the D");}
    
 }
    

