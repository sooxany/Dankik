//회원 데이터 베이스를 대충 구축 (?)
// 하나의 회원 정보를 담을 수 있는 user 테이블을 구축하고 자바빈즈를 만들었다
// 이 소스코를 자바빈즈라 그런다

package user;

public class User {
	
	private String userID;
	private String userPassword;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	

}
