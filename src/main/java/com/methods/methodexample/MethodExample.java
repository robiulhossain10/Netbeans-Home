/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.methods.methodexample;

/**
 *
 * @author ROBIUL
 */
public class MethodExample {

    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
        obj.printName();
        obj.printName("Ahmad");
        obj.printName();
    }
    
    String name;
    static int age;
    
    void printName(){
        
        System.out.println("Hello " + name + "!!");
    }
    
    void printName(String nameParam){
        name = nameParam;
        System.out.println("Hello " + name + "!!");
    }
    
    
    
    
    
    
    
}
