/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;


import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class Conexao {
    private Connection conn;
    
    public Connection openConn(){
        String url = "jdbc:mysql://database.czdmtrv4lioq.sa-east-1.rds.amazonaws.com:3306/db";
        String user = "root";
        String password = "rootroot";
    
        try {
            conn = DriverManager.getConnection(url, user, password);
        
        } catch (Exception ex) {
            //Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
    
    public void closeConn(){
        try {
            conn.close();
        } catch(Exception ex){
        
        };
    }
    
}
