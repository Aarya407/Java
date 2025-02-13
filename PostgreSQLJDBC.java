import java.sql.*;
public class PostgreSQLJDBC
{
	public static void main(string args[])
	{
		try
		{
			Class forName("org.postgresql.Driver");
			Connection c=DriverManager.getConnection(")doc postgresql://localhost:5432/
			Statement stuc.createStatement();
			ResultSet rs-st.executeQuery(SELECT FROM student")
			while(rs.next())
			System.out.println("Roll no"+rs.getInt(1)+"Name"+rs.getString(2)+" Percentages"+ rs.getFloat(3));
		}
		catch(Exception e)
		{
			System.out.println("Error"+e):
		}
System.out.println("opened database successfully");
}
