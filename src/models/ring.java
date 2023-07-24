package models;

public class ring {
	
	 String refInterne;
	 String singlePart;
	 String useValue;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 String family;
	 String ang;
	 int HD ;
	 String WP;
	 
	public ring(String refInterne, String singlePart, String useValue, String refFour, String fournisseur,
			String refClient, String client, String family, String ang, int hD, String wP) {
		
		this.refInterne = refInterne;
		this.singlePart = singlePart;
		this.useValue = useValue;
		this.refFour = refFour;
		this.fournisseur = fournisseur;
		this.refClient = refClient;
		this.client = client;
		this.family = family;
		this.ang = ang;
		HD = hD;
		WP = wP;
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

	public String getAng() {
		return ang;
	}

	public void setAng(String ang) {
		this.ang = ang;
	}

	public int getHD() {
		return HD;
	}

	public void setHD(int hD) {
		HD = hD;
	}

	public String getWP() {
		return WP;
	}

	public void setWP(String wP) {
		WP = wP;
	}

	
	 

}
