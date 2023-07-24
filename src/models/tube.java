package models;

public class tube {
	
	 String refInterne;
	 String singlePart;
	 String useValue;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 String tube;
	 int diameter;
	 int length;
	 String temperatureClass;
	public tube(String refInterne, String singlePart, String useValue, String refFour, String fournisseur,
			String refClient, String client, String tube, int diameter, int length, String temperatureClass) {

		this.refInterne = refInterne;
		this.singlePart = singlePart;
		this.useValue = useValue;
		this.refFour = refFour;
		this.fournisseur = fournisseur;
		this.refClient = refClient;
		this.client = client;
		this.tube = tube;
		this.diameter = diameter;
		this.length = length;
		this.temperatureClass = temperatureClass;
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
	public String getTube() {
		return tube;
	}
	public void setTube(String tube) {
		this.tube = tube;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTemperatureClass() {
		return temperatureClass;
	}
	public void setTemperatureClass(String temperatureClass) {
		this.temperatureClass = temperatureClass;
	}

	
	
	 
	 
}
