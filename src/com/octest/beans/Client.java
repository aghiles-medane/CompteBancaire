package com.octest.beans;



import java.util.*;
public class Client {
    private final int numCompt;
	private String name;
	private String surname;
	private String adress;
	

	public Client(int numCompt, String name, String surname, char sexe, Date dateOfBirth, String adress, String login,
			String passWord){
		super();
		this.numCompt = numCompt;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.login = login;
		this.passWord = passWord;
	}
	
	
	private String login;
	private String passWord;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getNumCompt() {
		return numCompt;
	}
    

	

}
