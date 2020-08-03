package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		final String URL = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String USUARIO = "developer";
		final String SENHA = "1234567";
		
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
		
	}

}
