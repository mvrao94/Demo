package com.example.demo.util;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import com.example.demo.model.Credentials;

public class CredentialGenerator {

	public Credentials credentialGenerate(String firstName, String lastName) {

		String userName = CredentialGenerator.concatStrGen(firstName, 0, 2)
				+ CredentialGenerator.concatStrGen(lastName, 0, 2) + (int) (Math.random() * 10000);

		String password = UUID.randomUUID().toString().replaceAll("-", "").substring(1, 8);

		Credentials credentials = new Credentials();
		credentials.setUserName(userName);
		credentials.setPassword(password);

		return credentials;
	}

	public static String concatStrGen(String str, int startIndex, int endIndex) {

		return StringUtils.substring(str, startIndex, endIndex).toLowerCase();
	}

}
