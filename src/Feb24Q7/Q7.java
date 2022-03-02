package Feb24Q7;

import java.sql.*;
import java.io.*;

public class Q7 {
    public static void main(String args[]) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "Pnc@23012000");
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into manage values(?,?,?)");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                System.out.println("enter id");
                String s1 = br.readLine();
                int id = Integer.parseInt(s1);

                System.out.println("enter name");
                String name = br.readLine();

                System.out.println("enter salary");
                String s3 = br.readLine();
                int salary = Integer.parseInt(s3);

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, salary);
                ps.executeUpdate();

                System.out.println("commit/rollback");
                String answer = br.readLine();
                if (answer.equals("commit")) {
                    con.commit();
                }
                if (answer.equals("rollback")) {
                    con.rollback();
                }


                System.out.println("Want to add more records y/n");
                String ans = br.readLine();
                if (ans.equals("n")) {
                    break;
                }
            }
            con.commit();
            System.out.println("record successfully saved");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
/*
enter id
1003
enter name
Ramesh
enter salary
11000
commit/rollback
commit
Want to add more records y/n
y
enter id
1004
enter name
Aaksh
enter salary
12000
commit/rollback
rollback
Want to add more records y/n
n
record successfully saved

Process finished with exit code 0

 */