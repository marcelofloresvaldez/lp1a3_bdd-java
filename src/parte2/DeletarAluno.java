package parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeletarAluno{
   public static void main(String[] args) throws SQLException {


    String url ="jdbc:sqlite:banco.sqlite";
    Connection connection = DriverManager.getConnection(url);

    Integer id = 1;
    


    String sql ="""
        DELETE FROM aluno WHERE id = ?;
    """;
    PreparedStatement statement = connection.prepareStatement(sql);
    
    statement.setInt(1, id);


    int linhasAfetadas = statement.executeUpdate();
    if(linhasAfetadas >0){
        System.out.println("aluno deletado com sucesso");

    }else {
        System.out.println("falha ao deletar aluno");
    }

    statement.close();
    connection.close();


   }
   
   


    
        
    
}
