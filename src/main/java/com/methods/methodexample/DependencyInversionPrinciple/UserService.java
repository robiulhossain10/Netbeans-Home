/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.DependencyInversionPrinciple;

/**
 *
 * @author ROBIUL
 */
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username) {
        userRepository.insert(username);
    }
    
    public void userDataRead(){
        userRepository.read();
    }
    
    public void updateUser(int id,String username){
        userRepository.update(id, username);
        
    }
    
    
    public void deleteUser(int id){
        userRepository.delete(id);
    }
    
    
}

