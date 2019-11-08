package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaBanco {
    //Variaveis 
    public Statement stm;
    public ResultSet rs;
    private  final String driver = "org.postgresql.Driver";
    private  final String root = "jdbc:postgresql://127.0.0.1/SistemaSeguranca";
    private  final String user = "postgres";
    private  final String senha = "1234";
    
    //metodos
    public Connection conn;
    
    public void conecta(){
        try{
        System.setProperty("jdbc.Driver", driver);
        conn = DriverManager.getConnection(root, user, senha); 
        System.out.println("Conexão realizada com  sucesso! ");
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
    
    }
    public void desconecta(){
        try{
            conn.close();
        }catch(SQLException e){
            
        }
    }
    public void executaPostegres(String SQL){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    public static void main(String[] args) {
        ConectaBanco conecta = new ConectaBanco();
        conecta.conecta();
    }
}
