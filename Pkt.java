public class Pkt {
/*
Zalozenia:
-W konstruktorze ustawiamy mase,promien
-Metody pozwalajace wylizcyc moment bezwladnosci, przed i po tw steinera
- Metody zwracajace mase promien oraz takie ktore ustawiaja te wartosci
*/
private double masa;
private double r;
private double mBez = 0;
private double twSteiner;
	public Pkt()
	{
		this.r = 10;
		this.masa = 10;
	}
	public Pkt(double masa, double r)
	{
		this.masa = masa;
		this.r = r;
	}
	public void setMasa(double masa)
	{
		this.masa = masa;
	}
	public void setR(double r)
	{
		this.r = r;
	}
	public double getMasa()
	{
		return this.masa;
	}
	public double getR()
	{
		return this.r;
	}
	public void liczMoment()
	{
		this.mBez = masa*Math.pow(r, 2);
	}
	public double getMoment()
	{
		return this.mBez;
	}
	public void getInfo()
	{
		System.out.println("Bryła geometryczna o masie : " + getMasa() + " O promieniu : " + getR());
	}
	public void wypiszMoment()
	{
		System.out.println(" Ma moment bezwladnosci " + getMoment() + "\n");
	}
	public void twSteinera(double odlegosc)
	{
		this.twSteiner = getMoment()+ (this.masa * Math.pow(odlegosc, 2));
	}
	public void getTwSteinera()
	{
		System.out.println("Po zastosowaniu tw steinera ma moment bezwladnosci rowny : " +this.twSteiner);
	}
}