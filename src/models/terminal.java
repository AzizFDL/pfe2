package models;

public class terminal {
	

	String singlePart;
	 String refInterne;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 String useValue;
	 String family;
	 String section;
	 String type;
	 String material;
	 String ang;
	 String WP;
	
	public terminal(String Ri, String Sp, String Uv, String Rf, String F,
			String Rc, String C, String Fam, String Sec, String T, String Mat, String A,
			String WaterP) {
	
	   	   this.refInterne= Ri;
	   	   this.singlePart= Sp;
		   this.useValue= Uv;
		   this.refFour= Rf;
	       this.fournisseur= F;
	       this.refClient= Rc;
	       this.client= C;
		   this.family = Fam;
	       this.section = Sec;
		   this.type = T;
		   this.material = Mat;
		   this.ang = A;
		   this.WP = WaterP;
	}
	

	 public String getSinglePart() {
		return singlePart;
	}

	public void setSinglePart(String singlePart) {
		this.singlePart = singlePart;
	}

	public String getRefInterne() {
		return refInterne;
	}

	public void setRefInterne(String refInterne) {
		this.refInterne = refInterne;
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

	public String getUseValue() {
		return useValue;
	}

	public void setUseValue(String useValue) {
		this.useValue = useValue;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getAng() {
		return ang;
	}

	public void setAng(String ang) {
		this.ang = ang;
	}

	public String getWP() {
		return WP;
	}

	public void setWP(String wP) {
		WP = wP;
	}

	

	
}
