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
public class TestEncapsulation1 {
    public static void main(String[] args) {
        TestE1 te=new TestE1();
        te.setId(10);
        te.setName("Student");
        te.setEmail("upputuri357@gmail.com");
        System.out.println(te.getId());
        System.out.println(te.getName());
        System.out.println(te.getEmail());
        
    }
   
}
