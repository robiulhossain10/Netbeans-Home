/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Abstract;

/**
 *
 * @author ROBIUL
 */
public class CarTest {
    public static void main(String[] args) {
        Car myCar;
        
        myCar = new SportsCar();
        myCar.start();
        myCar.drive();
        
        System.out.println("");
        myCar = new ElectricCar();
        myCar.start();
        myCar.drive();
    }
}
