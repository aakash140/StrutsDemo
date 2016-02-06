package app;

import org.apache.struts.action.ActionForm;

public class RegisterForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String userName;
	String pass1;
	String pass2;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

}
