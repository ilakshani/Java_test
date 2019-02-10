/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Person {
    double budjet;
    int noOfItems;
    Dress[] drs;
    
    public Person (double budget, int maxItems){
        this.budjet = budget;
        drs = new Dress[maxItems];
        noOfItems= 0;
       
    }
    
    public void addItem(Dress d){
        drs[noOfItems]=d;
        noOfItems++;
    }
    
    public void showDetails (){
        double totalPrice = 0;
        String msg = "---------Details of the Person is as follows---------";
        msg = msg + "\n Budjet of this person is : " + this.budjet + "\nNo of Dresses : " + this.noOfItems+"\n";
        
        for (int i=0; i<noOfItems; i++){
            msg = msg + "Item no "+(i+1)+":\n";
            msg = msg + drs[i].getDetails();
            totalPrice = totalPrice+drs[i].getPrice();
        }
        
        if (totalPrice>this.budjet){
            msg = msg +"This is over budgeted person.";  
        }else if (totalPrice < this.budjet){
            msg = msg + "This is low budgeted";
        }else {
            msg = msg + "This is balanced baugeted person";
        }
        
         JOptionPane.showMessageDialog(null, msg);
    }
    
    
}
