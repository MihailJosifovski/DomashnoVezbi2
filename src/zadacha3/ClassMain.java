package zadacha3;

public class ClassMain {
	public static void main(String[] args) {
		Covek covek = new Covek();
		covek.ime = "Aleksandar";
		covek.prezime = "Spirovski";
		covek.matichenbr = "666777666";
		System.out.println("Imeto na covekot e: " + covek.ime + ".");
		System.out.println("Prezimeto na covekot e: " + covek.prezime + ".");
		System.out.println("Matichen broj na covekot: " + covek.matichenbr);
	}
}
