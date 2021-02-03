package com.octest.beans;

import java.io.Serializable;
import java.util.Date;

public  abstract class  Transaction implements Serializable {
	private Long numero ;
	private Date dateTransaction ;
	private double montant ;
	private Compte compte ;
	
	
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Transaction(Date dateTransaction, double montant, Compte compte) {
		super();
		this.dateTransaction = dateTransaction;
		this.montant = montant;
		this.compte = compte;
	}




	public Long getNumero() {
		return numero;
	}




	public void setNumero(Long numero) {
		this.numero = numero;
	}




	public Date getDateTransaction() {
		return dateTransaction;
	}




	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}




	public double getMontant() {
		return montant;
	}




	public void setMontant(double montant) {
		this.montant = montant;
	}




	public Compte getCompte() {
		return compte;
	}




	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	

}
