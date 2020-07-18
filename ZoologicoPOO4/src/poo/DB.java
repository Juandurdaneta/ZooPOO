package poo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DB {
	private static DB DB = new DB();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName= "ZoologicoPOO";
	private String urlDB = "jdbc:postgresql://localhost:5432/"+this.dbName;
	private String userDB = "postgres";
	private String passDB = "masterkey";
	//Constructor de la Base de datos
	private DB() {
		try {
			Class.forName(driverDB);
			this.conn = DriverManager.getConnection(urlDB,userDB,passDB);
			System.out.println("Conexion establecida!");
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

public static DB getInstances() {
	return DB;
}
public ResultSet dbStatement(String query) {
	try {
		this.stmt=this.conn.createStatement();
		this.rs=this.stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("username"));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			this.pstmt.close();
			this.rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return rs;
}
public void dbPrepareStatement(Object [] objeto, String query) {
	try {
		this.pstmt = this.conn.prepareStatement(query);
		this.pstmt.setString(1,(String) objeto[0] );
		this.pstmt.setString(2,(String) objeto[1]);
		this.pstmt.setInt(3, (int) objeto[2]);
		this.pstmt.executeUpdate();
		
	}catch (SQLException e) {
		e.printStackTrace();
		
	}finally {
		try {
			this.pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	public void dbPrepareStatementMamifero(Object [] objeto, String query) {
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1,(String) objeto[0]);
			this.pstmt.setString(2, (String) objeto[1]);
			this.pstmt.setInt(3, (int) objeto[2]);
			this.pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.pstmt.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public ResultSet dbStatementImprimir(String query) {
		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
