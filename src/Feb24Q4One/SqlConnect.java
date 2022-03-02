package Feb24Q4One;
import java.sql.*;
import java.util.Formatter;
public class SqlConnect {
    Connection c1;
    Statement state;
    ResultSet rs;
    public void setConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Pnc@23012000");
            System.out.println("Connected to database\n");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void alterTable() {
        try {
            state = c1.createStatement();
            String query = "alter table employee add column city varchar(225)";
            state.executeUpdate(query);
            System.out.println("City Column added successfully!!!!!\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void displayFullTable() {
        try {
            state = c1.createStatement();
            String sql = "select * from employee";
            rs = state.executeQuery(sql);
            System.out.println("::::::::::::::::::Data is:::::::::::::::::::::::");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s %15s %15s %15s\n", "id","name","designation","doj","exp","salary","status","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s %14s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fetchDetails() {
        try {
            state = c1.createStatement();
            String fetch = "select * from employee where salary > 20000 and city = 'Pune' ";
            rs = state.executeQuery(fetch);
            System.out.println("::::::::::::::::::::::Data After Fetching 20000:::::::::::::::::::::::");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s %15s %15s %15s\n", "id","name","designation","doj","exp","salary","status","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s %14s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateSalary() {
        try {
            state = c1.createStatement();
            String salaryQuery = "update employee set salary=salary+1000 where exp>3";
            state.executeUpdate(salaryQuery);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteEmployee() {
        try {
            state = c1.createStatement();
            String del = "delete from employee where status = 'resigned'";
            state.executeUpdate(del);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
