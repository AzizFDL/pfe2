package models;

public class label {
	


	 String refInterne;
	 String singlePart;
	 String useValue;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 int length;
	 int width;
	 String color;
	 
	 
	public label(String refInterne, String singlePart, String useValue, String refFour, String fournisseur,
			String refClient, String client, int length, int width, String color) {
		
		this.refInterne = refInterne;
		this.singlePart = singlePart;
		this.useValue = useValue;
		this.refFour = refFour;
		this.fournisseur = fournisseur;
		this.refClient = refClient;
		this.client = client;
		this.length = length;
		this.width = width;
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


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	 
	
	 
}
