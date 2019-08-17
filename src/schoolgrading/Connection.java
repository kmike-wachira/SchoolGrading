/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolgrading;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kmike
 */
public class Connection {

    void connection() {
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolgrading", "root", "");
            JOptionPane.showMessageDialog(null, "connection successfull");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

}
