package br.com.projeto.caridade.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.caridade.services.UserServices;

@RestController
public class LoginController {
	@Autowired UserServices userServices;

    @PostMapping("/login")
    
	public String login(@RequestBody UserRequestModel usermodel) {
		return userServices.ExecuteLogin(usermodel);
	}
}
