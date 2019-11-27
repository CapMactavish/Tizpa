package havenoidea;

public class Bike extends TranspherService {
	protected static int iter = 1;
	private double Raiseadvantage;

	public double getRaiseadvantage() {
		return Raiseadvantage;
	}

	public void setRaiseadvantage(double raiseadvantage) {
		Raiseadvantage = raiseadvantage;
	}

	public void setCostFirst() {
		this.cost = 4000;
	}

	@Override
	public double RainyOrMassy() {
		this.Raiseadvantage = 1.5;
		return this.cost * Raiseadvantage;
	}

	@Override
	public double JustMassy() {
		this.Raiseadvantage = 2;
		return this.cost * Raiseadvantage;
	}

	@Override
	public double JustRainy() {
		this.Raiseadvantage = 0.8;
		return this.cost * Raiseadvantage;
	}

	@Override
	public double Regular() {
		return this.cost;
	}

	public Bike() {
		Bike.iter++;
	}
}
