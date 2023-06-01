package parte3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
   public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    
    String sql ="""

    create table travbalho_LP1A3(
        id INTEGER primary key AUTO_INCREMENT,
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
