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
  abstract class TestA2 {
  void draw(){
      System.out.println("This is TestShape");
  }    
}
 class Rectangle extends TestA2{
void draw(){
    System.out.println("This is Rectangle");
}
}
class Cricle extends Rectangle{
void draw(){
    System.out.println("This is the cricle");
}
}
