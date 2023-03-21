package day12;

public class PassWordException extends IllegalAccessException { //잘못된 값이 입력된 Exception

	public PassWordException(String message) {
		super(message);
	}
}
