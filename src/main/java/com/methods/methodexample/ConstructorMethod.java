/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

/**
 *
 * @author ROBIUL
 */   
public class ConstructorMethod {
    public static void main(String[] args) {
        ConstructorMethod std1 = new ConstructorMethod(" Robiul" ,26);
        ConstructorMethod std2 = new ConstructorMethod(" Jibon",26);
    }
    
    
    
    public ConstructorMethod(String name, int age){
        System.out.println("This is Constructor Method" + name+"");
    }
    
    
}
