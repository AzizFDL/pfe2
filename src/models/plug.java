package models;

public class plug {



	 String refInterne;
	 String singlePart;
	 String useValue;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 String family;
	 String color;
	 
	 
	public plug(String refInterne, String singlePart, String useValue, String refFour, String fournisseur,
			String refClient, String client, String family, String color) {
		
		this.refInterne = refInterne;
		this.singlePart = singlePart;
		this.useValue = useValue;
		this.refFour = refFour;
		this.fournisseur = fournisseur;
		this.refClient = refClient;
		this.client = client;
		this.family = family;
		this.color = color;
	}


	public String getRefInterne() {
		return refInterne;
	}


	public void setRefInterne(String refInterne) {
		this.refInterne = refInterne;
	}


	public String getSinglePart() {
		return singlePart;
	}


	public void setSinglePart(String singlePart) {
		this.singlePart = singlePart;
	}


	public String getUseValue() {
		return useValue;
	}


	public void setUseValue(String useValue) {
		this.useValue = useValue;
	}


	public String getRefFour() {
		return refFour;
	}


	public void setRefFour(String refFour) {
		this.refFour = refFour;
	}


	public String getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}


	public String getRefClient() {
		return refClient;
	}


	public void setRefClient(String refClient) {
		this.refClient = refClient;
	}


	public String getClient() {
		return client;
	}


	public void setClient(String client) {
		this.client = client;
	}


	public String getFamily() {
		return family;
	}


	public void setFamily(String family) {
		this.family = family;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	 
}
