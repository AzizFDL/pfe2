package models;


public class connector {

	 String WaterProofness;
	 String family;
	 String coding;
	 String color;
	 String type;
	 String singlePart;
	 String refInterne;
	 String refFour;
	 String fournisseur;
	 String refClient;
	 String client;
	 String useValue;
	 
	 public connector (	String Ri, String Sp , String Uv , String Rf ,  String F, String Rc , String C ,  String Fam ,String Cod , String Col , String T , String Wp ) {
       this.refInterne= Ri;
       this.singlePart= Sp;
       this.useValue= Uv;
       this.refFour= Rf;
       this.fournisseur= F;
       this.refClient= Rc;
       this.client= C;
       this.family = Fam;
       this.coding = Cod;
       this.color = Col;
       this.type = T;
       this.WaterProofness = Wp;
	 
	 }

	public String getWaterProofness() {
		return WaterProofness;
	}

	public void setWaterProofness(String waterProofness) {
		WaterProofness = waterProofness;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getCoding() {
		return coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	 
	
}
