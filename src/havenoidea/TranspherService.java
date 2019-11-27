package havenoidea;

import direction.MakePrice;

public abstract class TranspherService {
	protected int ID = 13989000;
	protected long  cost ;
	protected double time = 0;
	public MakePrice area = new MakePrice();
			
	public abstract void setCostFirst();
	public abstract double RainyOrMassy();
	public abstract double JustMassy();
	public abstract double JustRainy();
	public abstract double Regular();
	
	{
		setCostFirst();
	}
	public double getöDecision(double time,boolean Rain) {
		double o = 0;
		if (time>=0) {
			if (time>6.5 && time<18.5 && Rain)
			{ o =RainyOrMassy();
				return o;
			}
			else if(time>6.5 && time<18.5 && !Rain) {
				o = JustMassy();
				return o;
			}
			else if (Rain) {
				 o =JustRainy();
				 return o;
			}
			else {
				o = Regular();
				return o;
			}
		}
		else {
			System.out.println("take your pills!\nwedon't have negative time!");
			return o;
		}
		}
}

