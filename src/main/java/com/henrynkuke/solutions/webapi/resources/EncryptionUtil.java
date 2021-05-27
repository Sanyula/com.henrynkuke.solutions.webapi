package com.henrynkuke.solutions.webapi.resources;

import org.jasypt.util.text.BasicTextEncryptor;
import org.json.simple.JSONObject;

public class EncryptionUtil {
	
	private String password;
	BasicTextEncryptor textEncryptor;
	
	public EncryptionUtil(String pass){
		this.password = pass;
	}
	
	public  String encrypt(String data) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPasswordCharArray(this.password.toCharArray());
		String cryptic = textEncryptor.encrypt(data);
		return cryptic;
	}
	
	public  String decrypt(String encrypted) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPasswordCharArray(this.password.toCharArray());
		String plainText = textEncryptor.decrypt(encrypted);
		return plainText;
	}
	

	


}
