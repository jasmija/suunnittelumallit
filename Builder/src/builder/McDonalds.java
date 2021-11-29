package builder;

import java.util.ArrayList;

public class McDonalds {

	ArrayList<Object> mcDonalds = new ArrayList();
	private Pihvi pihvi;
	private Majoneesi majoneesi;
	private Täyte täyte;
	private Sämpylä sämpylä;
	
	public void setTäyte(String täyte) {
		this.täyte = new Täyte();
		mcDonalds.add(täyte);
	}
	
	public void setMajoneesi(String majoneesi) {
		this.majoneesi = new Majoneesi();
		mcDonalds.add(majoneesi);
	}
	
	public void setPihvi(String pihvi) {
		this.pihvi = new Pihvi();
		mcDonalds.add(pihvi);
	}
	
	public void setSämpylä(String sämpylä) {
		this.sämpylä = new Sämpylä();
		mcDonalds.add(sämpylä);
	}
	
	public void getBurgeri(){
		System.out.println("McDonaldsin burgeri sisältää: " + mcDonalds);
	}
}
