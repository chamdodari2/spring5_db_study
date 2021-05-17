package spring5_db_study.spring;

public class RegisterRequest {
	private String email;
	private String password;
	private String conformPassword;
	private String name;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getpassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformpassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public boolean isPasswordEqualToConformPassword() {
		return password.contentEquals(conformPassword);
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
