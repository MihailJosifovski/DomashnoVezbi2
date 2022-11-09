package zadacha4;

public class ClassMain {
	public static void main(String[] args) {
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "Ford";
		avtomobil1.model = "Focus";
		avtomobil1.km = 4000;
		Avtomobil avtomobil2 = new Avtomobil("Ford", "Focus", 4000);
		System.out.println(avtomobil1.marka +" "+ avtomobil1.model +" "+ avtomobil1.km);
		System.out.println(avtomobil2.marka +" "+ avtomobil2.model +" "+ avtomobil2.km);
	}
}
