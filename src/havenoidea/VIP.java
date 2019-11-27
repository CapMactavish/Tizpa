package havenoidea;

public class VIP extends TranspherService{
private double Raiseadvantage ;
	
	public double getRaiseadvantage() {
		return Raiseadvantage;
	}
	public void setRaiseadvantage(double raiseadvantage) {
		Raiseadvantage = raiseadvantage;
	}
	public void setCostFirst() {
		this.cost = 10_000;
	}
	
	
	@Override
	public double RainyOrMassy() {
		this.Raiseadvantage = 3;
		return this.cost*Raiseadvantage;
	}
	@Override
	public double JustMassy() {
		this.Raiseadvantage = 2;
		return  this.cost*Raiseadvantage;
	}
	@Override
	public double JustRainy() {
		this.Raiseadvantage = 2;
		return  this.cost*Raiseadvantage;
	}
	@Override
	public double Regular() {
		return  this.cost;
	}
}
