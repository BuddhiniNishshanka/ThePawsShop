/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author buddh
 */
public class Authentication {

     public User login(String username, String password) {
        User user = null;
        
        if (username.equals("Manager") && password.equals("1234")) {
            user = new Manager(username, password);
            logLogin("Manager has logged in.");
        } else if (username.equals("Cashier") && password.equals("0123")) {
            user = new Cashier_controller(username, password);
            logLogin("Cashier has logged in.");
        } else {
            JOptionPane.showMessageDialog(null, "Username or Password incorrect");
        }
        
        return user;
    }

//    file handling
    private void logLogin(String message) {
        try (FileWriter writer = new FileWriter("login.txt", false)) { 
            writer.write(message + "\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error logging in: " + e.getMessage());
        }
    }
}


