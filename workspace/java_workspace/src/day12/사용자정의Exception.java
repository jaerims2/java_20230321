package day12;

public class 사용자정의Exception {

	public static void main(String[] args) {

		/* PasswordException
		 * 부모클래스 : Exception (String message)
		 * PasswordException (String password)
		 * 
		 * -예외처리- 
		 * -비밀번호는 null일수 없다.
		 * -비밀번호의  길이는 5자 이상
		 * -문자로만 이루어지면 안된다(숫자 or 특수문자 포함.)
		 * 
		 * 
		 */
		PasswordTest pt = new PasswordTest();
		String password = "abcddfdff4";
//		String password = null; // null 값 error
//		String password = "123" // 5자리 이하
//		String password = "rrrrrr" // 숫자 특수문자포함 x
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PassWordException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
class PasswordTest {
	private String password;
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException {

		if(password ==null) {
		throw new PassWordException("비밀번호는 null일수 없습니다");
		}else if(password.length()<5) {
			throw new PassWordException("비밀번호는 5자 이상");	
		}else if(password.matches("[a-zA-Z]+")) { 
			throw new PassWordException("숫자나 특수문자를 포함해주쇼");
		}
		this.password = password;
	}
	
}