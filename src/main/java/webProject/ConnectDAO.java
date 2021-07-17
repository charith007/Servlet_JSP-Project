package webProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectDAO {
	Connection conn;
	
	public ConnectDAO()throws Exception
	{
		conn=ConnectionDB.getMySqlConnection();
	}
	
	public void SignUpController(CredentialTO credential)throws Exception
	{
		PreparedStatement psmt=conn.prepareStatement("insert into webproject values(?,?,?,?,?)");
		psmt.setString(1, credential.getUsername());
		psmt.setString(2, credential.getName());
		psmt.setString(3, credential.getEmail());
		psmt.setString(4, credential.getPhnumber());
		psmt.setString(5, credential.getPassword());
		int row_eff=psmt.executeUpdate();
	}
	
	public ResultSet SignInController(CredentialTO credential)throws Exception
	{
		PreparedStatement psmt=conn.prepareStatement("select * from webproject where username=? AND password=?");
		psmt.setString(1, credential.getUsername());
		psmt.setString(2, credential.getPassword());
		ResultSet rs=psmt.executeQuery();
		return rs;
	}
}
