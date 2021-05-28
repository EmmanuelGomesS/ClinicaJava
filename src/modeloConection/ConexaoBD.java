/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

//import java.beans.Statement;
//import java.sql.Statement;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author emmanuelgomes
 */
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/projetoclinica";
    private String usuario = "postgres";
    private String senha = "1234";
    public Connection con;
    
    public void conexao (){
        
        try{
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de conexão com banco de dados:\n"+ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try{
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n"+ex.getMessage());
        }
        
    }
    
    public void desconecta(){
        try {
            con.close();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o BD:\n"+ex.getMessage());
        }
    }    
    
}
