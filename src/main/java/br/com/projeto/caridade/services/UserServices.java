package br.com.projeto.caridade.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import br.com.projeto.caridade.controlers.UserRequestModel;
import br.com.projeto.caridade.entities.User;

@Service
public class UserServices {
	private ArrayList <User> users;

	public UserServices() {
		this.users = new ArrayList();
		this.users.add(new User("João", "123"));
		this.users.add(new User("Manuel", "1234"));
		this.users.add(new User("Maria", "12345"));
		this.users.add(new User("Neves", "123456"));
		this.users.add(new User("Maycon", "1234567"));
	}
	
	public String ExecuteLogin(UserRequestModel userModel) {
		
		var user = this.users.stream().filter(usr-> usr.getUser().equals(userModel.getUser())
			&& usr.getPassword().equals(userModel.getPassword())).findFirst().orElse(null);
		if (user == null) {
			return "Usuario não encontrado"; 
		}
		return "Usuario logado com sucesso";
	}
}

