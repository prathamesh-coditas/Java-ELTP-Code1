package Feb24Q6;

import java.sql.*;

public class Q2 {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try","root","Pnc@23012000");
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from teacher");
            rs.absolute(1);
            String s = rs.getString(2);
            rs.updateString(3,"prof");
            rs.updateRow();
            System.out.println("Done");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
Output:
Done

Process finished with exit code 0
 */