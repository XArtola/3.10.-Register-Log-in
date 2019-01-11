package com.zubiri.User;

public class User {

	private String username = "UserName";
	private String password = "1234abcd=";

	public User() {
	}

	public void setUsername(String username) {

		if (!username.matches("[a-zA-Z+]")) {

		}

		else {
			this.username = username;

		}

	}

	public String getUsername() {

		return username;

	}

	public void setPassword(String password) {

		if (password.matches("[a-zA-Z+]") && password.matches("[0-9+]") && !password.matches("[a-zA-Z0-9+]")
				&& password.length() > 7) {

			this.password = password;

		}

		else {

		}

	}

	public String getPassword() {

		return password;

	}

	public int register(String username, String password) {

		int valid = 0;

		if (validUsername(username) && validPassword(password)) {

			this.username = username;
			this.password = password;

			valid = 0;

		} else if (!validUsername(username) && validPassword(password)) {

			valid = -2;

		}

		else if (validUsername(username) && !validPassword(password)) {

			valid = -1;

		}

		else {

			valid = 1;

		}

		return valid;

	}

	public boolean validUsername(String username) {

		boolean validUserneme = true;

		if (!username.matches("[a-zA-Z+]")) {

			validUserneme = false;

		}

		return validUserneme;

	}

	public boolean validPassword(String password) {

		boolean validPassword = false;

		if (password.matches("[a-zA-Z+]") && password.matches("[0-9+]") && !password.matches("[a-zA-Z0-9+]")
				&& password.length() > 7) {

			validPassword = true;

		}

		return validPassword;

	}
	
	public boolean logIn(String username, String password) {
		
		boolean logged = false;
		
		if(username.matches(this.username) && password.matches(this.password))
			
			logged = true;
		
		
		return logged;
		
	}

}
