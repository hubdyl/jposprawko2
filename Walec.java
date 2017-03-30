
public class Walec extends Pkt{
private double height;
private double momentBezwladnosci;
	public Walec (double masa,double r,double height)
	{
		super(masa,r);
		this.height = height;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getMasa()
	{
		return super.getMasa();
	}
	public double getR()
	{
		return super.getR();
	}
	public void getInfo()
	{
	super.getInfo();
		System.out.println("Ma wysokosc " + getHeight());
	}
	public void liczMoment()
	{
		
		momentBezwladnosci = (getMasa()*Math.pow(getR(), 2))/2;
	}
	public double getMoment()
	{
		return this.momentBezwladnosci;
	}
	public void wypiszMoment()
	{
		getInfo();
		liczMoment();
		System.out.print("Moment bewladnosci walca wynosi : " +getMoment()+ "\n");
	}
}