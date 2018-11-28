package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Credentials;
import com.example.demo.model.RegistrationDetails;
import com.example.demo.util.CredentialGenerator;

@RestController
@RequestMapping("/demoapp")
public class UserRegistrationProvider {

	@PostMapping("/registerUser")
	@ResponseBody
	public Credentials showUserRegistrationDetails(@RequestBody RegistrationDetails registrationDetails) {
		CredentialGenerator credentialGenerator = new CredentialGenerator();
		return credentialGenerator.credentialGenerate(registrationDetails.getFirstName(),
				registrationDetails.getLastName());
	}
}
