package Feb24Q4Two;
import java.sql.*;
import java.util.Formatter;
public class SQLConnect {
    Connection c1;
    Statement state;
    ResultSet rs;
    public void setConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "Pnc@23012000");
            System.out.println("Connected to database\n");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void alterGender() {
        try {
            state = c1.createStatement();
            String query = "alter table student add column gender varchar(1)";
            state.executeUpdate(query);
            System.out.println("Gender Column added successfully!!!!!\n");
            System.out.println(":::::::::::::::::::::::::::::::::::::::after gender added:::::::::::::");
            displayFullTable();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void displayFullTable() {
        try {
            state = c1.createStatement();
            String sql = "select * from student";
            rs = state.executeQuery(sql);
            System.out.println("::::::::::::::::::Data is:::::::::::::::::::::::");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s\n", "id","name","year","percentage","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fetchDetails() {
        try {
            state = c1.createStatement();
            String fetch = "select * from student where percentage>70 and year='TY'";
            rs = state.executeQuery(fetch);
            System.out.println("::::::::::::::::::::::Data After Fetching percentage>70 and year='TY':::::::::::::::::::::::");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s\n", "id","name","year","percentage","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fetchDetails1() {
        try {
            state = c1.createStatement();
            String fetch = "select * from student where id between 1 and 10;";
            rs = state.executeQuery(fetch);
            System.out.println("::::::::::::::::::::::Data After id between 1 and 10:::::::::::::::::::::::");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s\n", "id","name","year","percentage","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertRecord() {
        try {
            state = c1.createStatement();
            System.out.println("::::::::::::::::::::::Data After insertion:::::::::::::::::::::::");
            String insert = "insert into student values (12,'pratham','SY',75,'Pune','M')";
            String insert1 = "insert into student values (13,'rucha','FY',86,'Mumbai','F')";
            String insert2 = "insert into student values (14,'gauri','TY',73,'Pune','F')";
            state.executeUpdate(insert);
            state.executeUpdate(insert1);
            state.executeUpdate(insert2);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateRecord() {
        try {
            state = c1.createStatement();
            System.out.println("::::::::::::::::::::::Data After changing Mr and Mrs:::::::::::::::::::::::");
            String gendermr = "update student set name=concat('Mr.',name)where gender='M'";
            String genderms = "update student set name=concat('Ms.',name)where gender='F'";
            state.executeUpdate(gendermr);
            state.executeUpdate(genderms);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeStudent() {
        try {
            state = c1.createStatement();
            System.out.println("::::::::::::::::::::::::::::Date after removel::::::::::::::::::::::::::::::::");
            String del = "delete from student where year = 'LY'";
            state.executeUpdate(del);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
