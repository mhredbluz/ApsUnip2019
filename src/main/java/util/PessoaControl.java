package util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaControl {
    
    ConectaBanco conecta = new ConectaBanco();
    
    public void inserir (PessoaModel mod){
        try{
            conecta.conecta();
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO pessoa (id, nome, sobrenome, email, telefone, imagem) values (?, ?, ?, ?, ?, ?)");
            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getSobrenome());
            pst.setString(4, mod.getEmail());
            pst.setInt(5, mod.getTelefone());
            pst.setBytes(6, mod.getImagem());
            pst.executeUpdate();
            System.out.println("Dados do(a)" + mod.getNome() + " cadastrados");
            conecta.desconecta();
        }catch(SQLException ex){
            System.out.println("Erro: " + ex);
        }
    }
}
