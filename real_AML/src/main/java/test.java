import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/table1?allowPublicKeyRetrieval=true&useSSL=false"
					+ "&serverTimezone=UTC&useUnicode=true&characterEncoding=euckr","root","0929");
			System.out.println("디비 접속 성공");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQLException : 디비 연동에 실패했습니다" );
		}catch(Exception e2) {
			System.out.println("Exception : "+e2);
		}

	}

}