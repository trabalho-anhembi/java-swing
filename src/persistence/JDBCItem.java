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
import java.util.List;
import model.Item;


/**
 *
 * @author Gabriel
 */
public class JDBCItem {
    Connection conn;

    public JDBCItem(Connection conn) {
        this.conn = conn;
    }
    
    public void inserirItem(Item i){
        String query = "insert into ITEM(nome, valor) values (?, ?)";
        PreparedStatement ps;
        
        Item test = new Item();
        
        test.setNome("Coxinha");
        test.setValor(4);
        
        try {
            ps = this.conn.prepareStatement(query);
            ps.setString(1, test.getNome());
            ps.setFloat(2, test.getValor());
            ps.execute();
        } catch(Exception ex) {
            
        }
        
    }
    
    public List<Item> listarItens() {
    
        return null;
    }
    
    public void apagarItem() {
        
    }
    
}
