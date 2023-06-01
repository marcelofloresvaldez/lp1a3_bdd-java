package parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
   public static void main(String[] args) throws SQLException {

    String url ="jdbc:sqlite:banco.sqlite";
    String sql ="""

    create table Aluno(
        id INTEGER primary key,
        nome TEXT,
        prontuario TEXT,
        email TEXT,
        ativo INTEGER

    );
    
    """;
    try (
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        ) 
        {
        
            statement.execute(sql);

        } catch (Exception e) {
        
        }

   }
   
}
