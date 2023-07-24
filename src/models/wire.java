package models;

public class wire {
	

	 String refInterne;
	 String singlePart;
	 String useValue;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 String section;
	 String type;
	 String temperatureClass;
	 
	 
	public wire(String refInterne, String singlePart, String useValue, String refFour, String fournisseur,
			String refClient, String client, String section, String type, String temperatureClass) {

		this.refInterne = refInterne;
		this.singlePart = singlePart;
		this.useValue = useValue;
		this.refFour = refFour;
		this.fournisseur = fournisseur;
		this.refClient = refClient;
		this.client = client;
		this.section = section;
		this.type = type;
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


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTemperatureClass() {
		return temperatureClass;
	}


	public void setTemperatureClass(String temperatureClass) {
		this.temperatureClass = temperatureClass;
	}
	
	
	 
	 

}
