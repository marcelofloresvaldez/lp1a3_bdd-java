package parte1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
   public static void main(String[] args) throws SQLException {


    String url ="jdbc:sqlite:banco.sqlite";
    Connection connection = DriverManager.getConnection(url);




    String sql ="""

    create table Aluno(
        id INTEGER primary key,
        nome TEXT,
        prontuario TEXT,
        email TEXT,
        ativo INTEGER




    );
    
    """;
    Statement statement = connection.createStatement();
    statement.execute(sql);


    statement.close();
    connection.close();


   }
   
   


    
        
    
}
