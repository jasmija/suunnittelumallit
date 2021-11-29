package builder;

public class Hesburger {

	StringBuilder hesburger;
	private String täyte;
	private String majoneesi;
	private String pihvi;
	private String sämpylä;
	
	public Hesburger() {
		hesburger = new StringBuilder(); 
	}
	
	public void setTäyte(String täyte) {
		this.täyte = täyte;
		hesburger.append(täyte + ", ");
	}
	
	public void setMajoneesi(String majoneesi) {
		this.majoneesi = majoneesi;
		hesburger.append(majoneesi + ", ");
	}
	
	public void setPihvi(String pihvi) {
		this.pihvi = pihvi;
		hesburger.append(pihvi + ", ");
	}
	
	public void setSämpylä(String sämpylä) {
		this.sämpylä = sämpylä;
		hesburger.append(sämpylä + ", ");
	}
	
	public void getBurgeri(){
		System.out.println("Hesbergerin burgeri sisältää: " + hesburger);
	}
}
