package Feb24Q6;

import java.sql.*;
import java.util.Formatter;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Connection con=null;

        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost/testdb";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try", "root", "Pnc@23012000");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from colour ");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s\n", "id", "colour");
            while (rs.next()) {
                fmt.format("%14s %14s\n", rs.getString(1), rs.getString(2));
            }
            System.out.println(fmt);
            stmt.setFetchSize(1);
            System.out.println("::::::::::::::::::::::::::::::::::::After Update:::::::::::::::::::::::::::::::::::::::::::");
            con.setAutoCommit(false);
            stmt.executeUpdate("insert into colour values(8,'violet')");
            con.commit();

        }
        catch (Exception e){
            con.rollback();
            System.out.println("roll back excecute");
            e.printStackTrace();
        }
    }

}
/*
   id          colour
             1            Red
             2         Yellow
             3           Blue
             4          Green
             5          Black
             6          White
             7         orange
             8         violet

::::::::::::::::::::::::::::::::::::After Update:::::::::::::::::::::::::::::::::::::::::::
roll back excecute
java.sql.SQLIntegrityConstraintViolationException: Duplicate entry '8' for key 'colour.PRIMARY'
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:117)
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
	at com.mysql.cj.jdbc.StatementImpl.executeUpdateInternal(StatementImpl.java:1335)
	at com.mysql.cj.jdbc.StatementImpl.executeLargeUpdate(StatementImpl.java:2084)
	at com.mysql.cj.jdbc.StatementImpl.executeUpdate(StatementImpl.java:1246)
	at Feb24Q6.Q1.main(Q1.java:25)

Process finished with exit code 0

 */