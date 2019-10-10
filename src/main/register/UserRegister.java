package main.register;

import java.util.HashMap;
import java.util.Map;

public class UserRegister {
	private Map<String, String> register;
	
	public void savePassword(String userId, String password) {
		register = new HashMap<String, String>();
		register.put(userId, password);
		
	}

	public String getPassword(String userId) {
		return register.get(userId);
		
	}

}
