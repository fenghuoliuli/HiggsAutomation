package com.inmind.utils;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.inmind.general.APITest;

public class DBCtrl {
	public static final Logger LOGGER = LogManager.getLogger(DBCtrl.class.getName());

	public Connection set_connection() throws SQLException{
    try{
		String url=APITest.getValue("db.url");
        Class.forName("com.mysql.jdbc.Driver");
        LOGGER.info("Load mysql driver successfully");
			Connection connection = DriverManager.getConnection(url,  APITest.getValue("db.user"),APITest.getValue("db.pass"));
			return connection;
    }catch(ClassNotFoundException e1){
        LOGGER.error("Cannot load mysql driver");
        e1.printStackTrace();
    	return null;
    }
}
	
	
	
	public void Close_DB_Connection(Connection conn)
	{
        try {
        	Statement statement=conn.createStatement();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * Get the result of sql query
	 * @param sql query statement
	 * @return result
	 * @author Jiang Zhaoting
	*/
    public ResultSet query(Connection conn,String sql) {
        ResultSet result = null;

        try
        {	Statement statement=conn.createStatement();
            result = statement.executeQuery(sql);
        } catch (SQLException e)
        {
            LOGGER.error(e);
            e.printStackTrace();
        }
        
        return result;
    }
    /**
     * Execute the sql statement
     * @param the sql statement
     * @return  null
     * @author Jiang Zhaoting
     */
    public void executeSql(Connection conn,String sql) {
        try
        {
        	LOGGER.info("Executing the sql statement:"+sql);
        	Statement statement=conn.createStatement();
            boolean result=statement.execute(sql);
            if (result)
            {
            	LOGGER.info("Executing sql successfully");
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
            LOGGER.info(e.toString());
        }
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        DBCtrl db = new DBCtrl();
        Connection conn;
		try {
			conn = db.set_connection();
			db.executeSql(conn,"INSERT INTO automind_test.question(id, title, refer_type, `type`, required, `options`, description, deleted, created_by, updated_by, created_at, updated_at)VALUES(123, 'zhao's test', 0, 0, 0, '', '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP");   //插入一条数据
	        ResultSet result = db.query(conn,"SELECT id FROM automind_test.question WHERE title=\"zhao test\";");
	        System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }



}
