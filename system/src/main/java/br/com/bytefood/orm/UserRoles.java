package br.com.bytefood.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String roles;
	
	public Integer getId() {
		return id;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	} 
	
	
	public static void gerarRoles() {
		UserRoles admin = new UserRoles(); 
		admin.setRoles("SYSADMIN");
		UserRoles cliente = new UserRoles(); 
		cliente.setRoles("CLIENTE");
		UserRoles funcionario = new UserRoles(); 
		funcionario.setRoles("FUNCIONARIO");
		
		System.out.println("Papel do Usuário: "+admin.getRoles() + " Criado!");
		System.out.println("Papel do Usuário: "+ cliente.getRoles() + " Criado!");
		System.out.println("Papel do Usuário: "+ funcionario.getRoles()+ " Criado!");
	}
	
}
