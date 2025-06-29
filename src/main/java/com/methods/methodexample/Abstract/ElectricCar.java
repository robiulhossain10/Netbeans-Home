/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Abstract;

/**
 *
 * @author ROBIUL
 */
public class ElectricCar extends Car{

    @Override
    void start() {
        System.out.println("Electric Car is Start");
    }

    @Override
    void drive() {
       System.out.println("Electric Car is Drive");
    }
    
}
