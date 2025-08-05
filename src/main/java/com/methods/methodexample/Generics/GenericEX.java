/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Generics;

/**
 *
 * @author ROBIUL
 */
public class GenericEX<T,K> {
    private T value;
    private K val;

    public GenericEX(T value, K val) {
        this.value = value;
        this.val = val;
    }
    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getVal() {
        return val;
    }

    public void setVal(K val) {
        this.val = val;
    }
    
    public static void main(String[] args) {
        GenericEX<String,Integer> genz = new GenericEX("Fahim", 26);
        
//        genz.setValue("Robiul");
//        genz.setVal(26);
        
    
       System.out.println("Name: " + genz.getValue() + " Age: " + genz.getVal());
    }
}
