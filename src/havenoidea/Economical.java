package havenoidea;


public class Economical extends TranspherService{
	private double Raiseadvantage ;
	
	public double getRaiseadvantage() {
		return Raiseadvantage;
	}
	public void setRaiseadvantage(double raiseadvantage) {
		Raiseadvantage = raiseadvantage;
	}
	public void setCostFirst() {
		this.cost = 5000;
	}
	
	
	@Override
	public double RainyOrMassy() {
		this.Raiseadvantage = 1.4;
		return this.cost*Raiseadvantage;
	}
	@Override
	public double JustMassy() {
		this.Raiseadvantage = 1.2;
		return  this.cost*Raiseadvantage;
	}
	@Override
	public double JustRainy() {
		this.Raiseadvantage = 1.2;
		return  this.cost*Raiseadvantage;
	}
	@Override
	public double Regular() {
		return  this.cost;
	}
}
