package FEB24Q8;
import java.sql.*;
public class Q8 {
    Connection connection;
    Statement statement;
    ResultSet rs;
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onetomany", "root", "Pnc@23012000");
            System.out.println("Connected to database\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printTeacherData() {
        try {
            System.out.println();
            statement = connection.createStatement();
            String sql = "select * from teacher";
            rs = statement.executeQuery(sql);
            System.out.println(":::::The Data of Teachers is:::::");
            while (rs.next()) {
                System.out.println("Teacher ID::  " + rs.getInt(1) + ", Teacher Name::  " + rs.getString(2) + ", Course:: " + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void printStudentData() {
        try {
            System.out.println();
            statement = connection.createStatement();
            String sql = "select * from student";
            rs = statement.executeQuery(sql);
            System.out.println(":::::The Data of Students is:::::");
            while (rs.next()) {
                System.out.println("Student RollNo::  " + rs.getInt(1) + ", Name::  " + rs.getString(2) + ", Trainer ID:: " + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void teacherWise() {
        try{            System.out.println("\nTeacherWise Printing:: ");
            statement = connection.createStatement();
            String sql = "select teacher.name, student.name from teacher , student  where teacher.id = student.Tid and teacher.name = 'Lata'";
            rs = statement.executeQuery(sql);
            while (rs.next())
                System.out.println("Teacher Name: " + rs.getString(1) + " , Student Name: " + rs.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
Connected to database


:::::The Data of Teachers is:::::
Teacher ID::  1, Teacher Name::  Lata, Course:: Maths
Teacher ID::  2, Teacher Name::  Latika, Course:: English

:::::The Data of Students is:::::
Student RollNo::  1001, Name::  Aarti, Trainer ID:: 1
Student RollNo::  1002, Name::  Kirti, Trainer ID:: 1
Student RollNo::  1003, Name::  Preeti, Trainer ID:: 1
Student RollNo::  1004, Name::  Dhruti, Trainer ID:: 1
Student RollNo::  1005, Name::  Smriti, Trainer ID:: 1
Student RollNo::  1006, Name::  Soumya, Trainer ID:: 2
Student RollNo::  1007, Name::  Gaurang, Trainer ID:: 2
Student RollNo::  1008, Name::  Unmesh, Trainer ID:: 2

TeacherWise Printing::
Teacher Name: Lata , Student Name: Aarti
Teacher Name: Lata , Student Name: Kirti
Teacher Name: Lata , Student Name: Preeti
Teacher Name: Lata , Student Name: Dhruti
Teacher Name: Lata , Student Name: Smriti

Process finished with exit code 0

 */