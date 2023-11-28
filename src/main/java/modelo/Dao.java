package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.conexion;

public class Dao {

	public static int validarDatos(String user, String pass) {
		Connection con;
		conexion cn = new conexion();
		
		PreparedStatement ps;
		ResultSet re;
		String userr ="";
		int valido = 0;
		String sql = "Select * from bd_ejempl where user = ? and pass = ?";
		try {
			con = cn.getConnection();
			ps =con.prepareStatement(sql);
			ps.setString(1,user);
			ps.setString(2,pass);
			re = ps.executeQuery();
			while(re.next()) {
				userr = re.getString("user");
			}
			if(userr.equals("admin")) {
				valido = 1;
			}
			else {valido = 0;}
		}
		catch (Exception ex){
			return valido;
		}
		return valido;
	}
}
