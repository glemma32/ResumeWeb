package ResumeBuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RDatabase {

	public RDatabase() {
		// TODO Auto-generated constructor stub
	}
	
	public void addPerson( String FirstName, String LastName,String EmailAddress )
	{
		Connection con=null;
		PreparedStatement stmt=null;
		
		String sql = "Insert into PersonalInfo( FirstName, LastName,EmailAddress) values(?,?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, FirstName);
			stmt.setString(2, LastName);
			stmt.setString(3, EmailAddress);
			
			stmt.execute();
				 
				
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void addEducation(String Degree, String Major, String Un_Graduated , String YearGraduated)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		
		String sql = "Insert into Education(Degree, Major, Un_Graduated , YearGraduated) values(?,?,?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?autoReconnect=true&useSSL=false&"
	                            + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, Degree);
			stmt.setString(2, Major);
			stmt.setString(3,Un_Graduated);
			stmt.setString(4, YearGraduated);
			
			stmt.execute();
				 
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try {
				
				stmt.close();
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void addExperience(String Title, String CompanyName, String StartDate, String EndDate, String Duty1, String Duty2)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		String choice_duty= "yes";
		
		String sql = "Insert into isEmployee(Title, CompanyName, StartDate, EndDate, Duty) values(?,?,?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, Title);
			stmt.setString(2, CompanyName);
			stmt.setString(3, StartDate);
			stmt.setString(4, EndDate);
			stmt.setString(5, Duty1);
			stmt.setString(6, Duty2);
			
			stmt.execute();
				 
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void addSkills(String SFieldsRatings)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		
		String sql = "Insert into Skills(SFields, Ratings) values(?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDB?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1,SFieldsRatings);
			
			
			
			stmt.execute();
				 
				
			
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	public String[] getRDatabase()
	{
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeDb?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement("Select Person.PersonID,FirstName,LastName,degree, Major,University,EmailAddress,"
					+ "Degree,Major,University,Grad_Year,Experience"+"Title,CompanyName,StartDate,EndDate,Duty1,Duty2"+"SFields,Ratings"
					+"from ((Person join Education using(Education.PersonID)) join Experience using(Experience.PersonID)) join Skills using(Skills.PersonID) "
					+"where PersonID=?");
			stmt.setInt(1, 1);
			 
			rs=stmt.executeQuery();	
			
					
			while(rs.next())
			{
				String[] per=new String[11];
				
				for(int i=0;i<per.length;i++)
				{
					per[i]=rs.getString(i+1);
					
				}
				return per;
			}
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
	}
		
}