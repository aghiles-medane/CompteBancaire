package com.octest.beans;



class CompteCourant extends Compte {
	private Double solde;
	public CompteCourant(Client c) {
		 super(c) ;
	     solde=0.0 ;
	}
	public Double getSolde() {
		return solde;
	}

}
