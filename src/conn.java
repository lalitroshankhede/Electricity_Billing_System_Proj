import java.sql.*;

public class conn
{
    Connection c;
    Statement s;
    public conn()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c=DriverManager.getConnection("jdbc:sqlserver://localhost/ebs","root","password");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
