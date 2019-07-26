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
public class TestEncapsulation2 {
    public static void main(String[] args) {
        TestE2 te=new TestE2();
        te.setAcc_no(203700);
        te.setName("Lingaro");
        te.setEmail("upputuri357@gamil.com");
        te.setAmount(10000);
//        System.out.println("Acc-No: "+te.getAcc_no());
//        System.out.println("Name: "+te.getName());
//        System.out.println("Email: "+te.getEmail());
//        System.out.println("Amount: "+te.getAmount());
        System.out.println(te.getAcc_no()+" "+te.getName()+" "+te.getEmail()+" "+te.getAmount());
        
    }
}
