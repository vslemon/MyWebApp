import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {

	private String dburl = "jdbc:mysql://localhost:3306/productdb";
	private String dbuname = "lemon";
	private String dbpassword = "lemon";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String register(Product product) {

		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "ok";

		String sql = "insert into productdb.product values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product.getBarcode());
			ps.setString(2, product.getName());
			ps.setString(3, product.getColor());
			ps.setString(4, product.getDesc());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			result = "fail";
		}

		return result;

	}

}
