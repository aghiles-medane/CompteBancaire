package com.octest.beans;



class Compte {
	private static int compteur = 123268 ; 
	private final  int num_compt;
	private final Client prop;
	
	public Compte( Client c ) {
		prop = c ; 
   
        num_compt = compteur ; 
        compteur ++ ;
        
	}

	public int getNum_compt() {
		return num_compt;
	}

	


}
