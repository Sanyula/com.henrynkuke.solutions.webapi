package com.henrynkuke.solutions.webapi.processor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.camel.Exchange;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.iv.RandomIvGenerator;
import org.jasypt.properties.EncryptableProperties;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.henrynkuke.solutions.webapi.resources.EncryptionUtil;

public class CatalogProcessor {
	@Autowired
	static JSONObject testJaspt;
	
	public Object requestListener(Exchange exchange,String payLoad) {
		
		return payLoad;
	}

	
	final static String PASSWORD = "password";
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
	
		System.out.println(testJaspt);
		/*try {
		testJasp();
		 }catch(EncryptionOperationNotPossibleException ex) {
			 System.out.println(ex.getMessage());
			 ex.printStackTrace();
		 }*/
	}
	
	
	

	
}
