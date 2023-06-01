package parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AtualizarAluno{
   public static void main(String[] args) throws SQLException {


    String url ="jdbc:sqlite:banco.sqlite";
    Connection connection = DriverManager.getConnection(url);

    Integer id = 1;
    String nome = "maria flores";
    String prontuario = "111111";
    String email = "marcelo.gmail.com";
    boolean ativo = false;


    String sql ="""
        UPDATE aluno 
        SET nome=?, prontuario=?, email=?, ativo=?
        WHERE  id = ?;

    """;
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, nome);
    statement.setString(2, prontuario);
    statement.setString(3, email);
    statement.setBoolean(4, ativo);
    statement.setInt(5, id);


    int linhasAfetadas = statement.executeUpdate();
    if(linhasAfetadas >0){
        System.out.println("aluno modificado com sucesso");

    }else {
        System.out.println("falha ao modificar aluno");
    }

    statement.close();
    connection.close();


   }
   
   


    
        
    
}
