package config;

import java.sql.*;

public class dbconnector {
    
    private Connection connection;
    
    public dbconnector(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restrack", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
    }
    
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
    
    public int insertData(String sql){
        int result;
//    String sql = "INSERT INTO customers (name, email) VALUES ('John Smith', 'john@example.com')";
            try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Inserted Successfully!");
            ps.close();
            result = 1;
            }catch(SQLException e){
                System.out.println("Connection Error: "+e);
                 result = 0;
            }
            return result;
    }
    
    public void deleteData(int id, String table) {
    try {
       
        PreparedStatement ps = connection.prepareStatement("DELETE FROM tbl_customer WHERE cus_id = ?");
        ps.setInt(1, id);
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(rowsDeleted + " rows were deleted.");
        } else {
            System.out.println("No rows were deleted.");
        }
        ps.close();
        connection.close();
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e);
    }
}
    
    public void updateData(String sql){
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
            }else{
                System.out.println("Data update failed!");
            }
        } catch (SQLException e) {
            System.out.println("Connection error:"+e);
        }
    }
    
    public void deleteDataacc(int id, String table) {
    try {
       
        PreparedStatement ps = connection.prepareStatement("DELETE FROM tbl_account WHERE cus_id = ?");
        ps.setInt(1, id);
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(rowsDeleted + " rows were deleted.");
        } else {
            System.out.println("No rows were deleted.");
        }
        ps.close();
        connection.close();
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e);
    }
}
    
}


