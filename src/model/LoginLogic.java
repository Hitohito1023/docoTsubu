package model;

public class LoginLogic {
	public boolean execute(User user) {
		if(user.getPass() == null && user.getPass().length() == 0) {
			return false;
		}
		return true;
	}

}
