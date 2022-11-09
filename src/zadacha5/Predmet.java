package zadacha5;

public class Predmet {
	public String imeP;
	public String prof;
	public int krediti;
	public String semestar;
	public Predmet() {
		
	}
	public Predmet (String imeP) {
		this.imeP = imeP;
	}
	public Predmet (String imeP, String prof, int krediti) {
		this.imeP = imeP;
		this.prof = prof;
		this.krediti = krediti;
	}
}
