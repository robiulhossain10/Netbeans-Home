/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.DependencyInversionPrinciple;

/**
 *
 * @author ROBIUL
 */
public interface UserRepository {
    void insert(String username);
    void read();
    void update(int id,String username);
    void delete(int id);
}

