/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import interfaces.Cashier;

/**
 *
 * @author buddh
 */

public class Cashier_controller extends User {

    public Cashier_controller(String username, String password) {
        super(username, password);
    }

    @Override
    public void openDashboard() {
        // Open Cashier_controller dashboard
        Cashier cashierDashboard = new Cashier();
        cashierDashboard.setVisible(true);
    }
}
