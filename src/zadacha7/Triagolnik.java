package zadacha7;

public class Triagolnik {
	public int a;
	public int b;
	public int c;
	public double s;
	public double plostina;
	public int perimetar;
	public double Plos(int a, int b, int c) {
		s = (a + b + c)/2;
		plostina = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return plostina;
	}
	public int Per(int a, int b, int c) {
		perimetar = a + b + c;
		return perimetar;
	}
}
