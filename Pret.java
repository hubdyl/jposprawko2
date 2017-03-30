

public class Pret extends Pkt{

private double momentBezwladnosci;	
	
	public Pret(double masa,double lng)
	{
			super(masa,lng);
			
	}
	
	
	
	public double getMasa()
	{
		return super.getMasa();
	}
	
	
	
	public double getLong()
	{
		return super.getR();
	}
	
	
	
	public void getInfo()
	{
		super.getInfo();
		
	}
	
	public void liczMoment()
	{
		momentBezwladnosci = (getMasa()*Math.pow(getLong(), 2))/12;
	}
	
	public double getMoment()
	{
		
	 return momentBezwladnosci;	
	}
	
	public void wypiszMoment()
	{
		getInfo();
		liczMoment();
		System.out.print("Moment bezwladnosci preta wynosi : " +getMoment()+"\n");
	}
	
}
		