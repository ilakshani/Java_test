/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressapp;

/**
 *
 * @author Student
 */
public class Shirt extends Dress {
    String size;
    
    @Override
     public String getDetails(){
         return ("This is a shirt and size : " + this.size+ "\n" + super.getDetails()+"\n");
     }
}
