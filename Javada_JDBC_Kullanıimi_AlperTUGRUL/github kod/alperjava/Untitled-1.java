import java.sql.*;  
import java.io.*;  
class TM{  
public static void main(String args[]){  
try{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
con.setAutoCommit(false);  
  
PreparedStatement ps=con.prepareStatement("insert into user420 values(?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
while(true){  
  
System.out.println("enter id");  
String s1=br.readLine();  
int id=Integer.parseInt(s1);  
  
System.out.println("enter name");  
String name=br.readLine();  
  
System.out.println("enter salary");  
String s3=br.readLine();  
int salary=Integer.parseInt(s3);  
  
ps.setInt(1,id);  
ps.setString(2,name);  
ps.setInt(3,salary);  
ps.executeUpdate();  
  
System.out.println("commit/rollback");  
String answer=br.readLine();  
if(answer.equals("commit")){  
con.commit();  
}  
if(answer.equals("rollback")){  
con.rollback();  
}  
  
  
System.out.println("Want to add more records y/n");  
String ans=br.readLine();  
if(ans.equals("n")){  
break;  
}  
  
}  
con.commit();  
System.out.println("record successfully saved");  
  
con.close();//before closing connection commit() is called  
}catch(Exception e){System.out.println(e);}  
  
}}  