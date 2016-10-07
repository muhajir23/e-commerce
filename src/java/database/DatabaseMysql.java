/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cyber23
 */
public class DatabaseMysql {
    private static PreparedStatement ps = null;
    private static final String className = "com.mysql.jdbc.Driver";
    private static final String uri = "jdbc:mysql://localhost:3306/banggai1";
    private static final String username = "root";
    private static final String password = "";
    
    public static PreparedStatement getPreparedStatement(String sql){
        try {
            Class.forName(className);
            Connection conn = DriverManager.getConnection(uri,username,password);
            ps = conn.prepareStatement(sql);
        } catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
            return null;
        }
        return ps;
    }
    
    
    public static boolean isConnect(){
        if (getPreparedStatement("select * from kategori") != null){
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args){
        if (isConnect() == true){
            System.out.println("connect");
        }else System.out.println("false");
    }
}
