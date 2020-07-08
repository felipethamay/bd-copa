package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private Connection con = null;
	private String hostName = null;
	private String userName = null;
	private String password = null;
	private String url = null;
	private String jdbcDriver = null;
	private String dataBaseName = null;
	private String dataBasePrefix = null;
	private String dabaBasePort = null;

	/**
	 * Construtor
	 */
	public JdbcConnection() {
		super();
		hostName = "localhost";
		userName = "root";
		password = "thamay";
		jdbcDriver = "org.gjt.mm.mysql.Driver";
		dataBaseName = "copa";
		dataBasePrefix = "jdbc:mysql://";
		dabaBasePort = "3306";

		url = dataBasePrefix + hostName + ":" + dabaBasePort + "/" + dataBaseName;// + "/";
		System.out.println(url);

	}

	/**
	 * Retorna uma java.sql.Connection.
	 * 
	 * @return con
	 */
	public Connection getConnection() {
		try {
			if (con == null) {
				Class.forName(jdbcDriver);
				con = DriverManager.getConnection(url, userName, password);
			} else if (con.isClosed()) {
				con = null;
				return getConnection();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * Fecha a conexão com BD.
	 *
	 */
	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
