/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement; 
import java.awt.EventQueue; 
import java.awt.*;

/**
 *
 * @author adrie
 */
public class Conexion {
    public static Connection getConexion(){
        String conexionUrl ="jdbc:sqlserver://localhost:1433;"
        +"database=Biblioteca;"
                +"user=sa;"
                +"password=1234;"
                +"LoginTimeout=20;";
        try{
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
            
        }
    }
    
    
    public int login(String User, String Pass){
        Integer resultado=0; 
        try{
            Conexion con = new Conexion();
            Connection cnx = con.getConexion();
            Statement ejecutor= cnx.createStatement();
                      
            ResultSet rs = ejecutor.executeQuery("Select * from Usuario Where nombre= '"+User+"' and contrasena= '"+Pass+"'");
            
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                resultado=1;
            }else{
                JOptionPane.showMessageDialog(null,"Problemas con el usuario y/o contraseña");
                resultado=0;
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error al conectar" + e.getMessage(), e.getMessage(),JOptionPane.ERROR_MESSAGE); 
        }
        return resultado;
        
    }
}
