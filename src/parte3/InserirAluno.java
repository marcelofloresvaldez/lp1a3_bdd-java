package parte3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InserirAluno {
   public static void main(String[] args) throws SQLException {

    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    
    Connection connection = DriverManager.getConnection(url);

    String nome = "marcelo flores";
    String prontuario = "111111";
    String email = "marcelo.gmail.com";
    boolean ativo = true;


    String sql ="""
        INSERT INTO Aluno (nome,prontuario,email,ativo)
        VALUES (?,? ,? ,?);

    
    
    """;
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, nome);
    statement.setString(2, prontuario);
    statement.setString(3, email);
    statement.setBoolean(4, ativo);

    int linhasAfetadas = statement.executeUpdate();
    if(linhasAfetadas >0){
        System.out.println("aluno inserido com sucesso");

    }else {
        System.out.println("falha ao inserir aluno");
    }

    statement.close();
    connection.close();


   }
   
   


    
        
    
}
