/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import interfaces.Manager_Cashier;

/**
 *
 * @author buddh
 */
public class Manager extends User {

    public Manager(String username, String password) {
        super(username, password);
    }

    @Override
    public void openDashboard() {
        // Open Manager dashboard
        Manager_Cashier managerDashboard = new Manager_Cashier();
        managerDashboard.setVisible(true);
    }
}

