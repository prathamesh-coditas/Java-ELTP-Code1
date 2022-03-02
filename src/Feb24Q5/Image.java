package Feb24Q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Image{
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/image", "root", "Pnc@23012000");
        String q="insert into image(image) values(?)";
        PreparedStatement pstmt=con.prepareStatement(q);
        FileInputStream fis=new FileInputStream("src/Feb24Q5/flower.png");
        pstmt.setBinaryStream(1,fis,fis.available());
        pstmt.executeUpdate();
        System.out.println("Done");

    }
}
/*
output:
Done

Process finished with exit code 0
 */