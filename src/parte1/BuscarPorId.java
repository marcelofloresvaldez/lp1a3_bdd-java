package parte1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

public class BuscarPorId {
   public static void main(String[] args) throws SQLException {

    String url ="jdbc:sqlite:banco.sqlite";
    Connection connection = DriverManager.getConnection(url);


    int id = 1;
    String sql ="""   
    SELECT *FROM aluno WHERE id=?;
    """;
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setInt(1,id);

    ResultSet rs = statement.executeQuery();
    if(rs.next()){
        
        String nome = rs.getString("nome");
        String prontuario = rs.getString("prontuario");
        String  email = rs.getString("email");
        boolean ativo = rs.getBoolean("ativo");

        System.out.println("id..." + id );
        System.out.println("nome..." + nome );
        System.out.println("prontuario..." + prontuario );
        System.out.println("email..." + email );
        System.out.println("ativo..." + ativo );
        System.out.println("=================");

    }else {
        System.out.println("aluno nao encontrado");
    }

    rs.close();
    statement.close();
    connection.close();

   }
   
   


    
        
    
}
