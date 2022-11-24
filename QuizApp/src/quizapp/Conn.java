/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;
import java.sql.*;

/**
 *
 * @author sathe
 */
public class Conn {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quemansys","root","Omkar@143");
            return con;
        } catch (Exception e) {
            System.out.println(e);
                return null; 
        }
    }
    
}
