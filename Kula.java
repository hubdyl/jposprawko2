
public class Kula extends Pkt{
private double momentBezwladnosci;	
	
	public Kula(double masa,double lng)
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
		momentBezwladnosci = (getMasa()*Math.pow(getLong(), 2))*0.4;
	}
	
	public double getMoment()
	{
		
	 return momentBezwladnosci;	
	}
	
	public void wypiszMoment()
	{
		getInfo();
		liczMoment();
		System.out.print("Moment bezwladnosci dla kuli wynosi : " +getMoment()+"\n");
	}
	
}

