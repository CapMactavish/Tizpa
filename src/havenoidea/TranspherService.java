package havenoidea;

public abstract class TranspherService {
	protected long  cost ;
	protected double time = 0;
	
	public abstract void setCostFirst();
	public abstract double RainyOrMassy();
	public abstract double JustMassy();
	public abstract double JustRainy();
	public abstract double Regular();
	
	public void getöDecision(double time,boolean Rain) {
		if (time>=0) {
			if (time>6.5 && time<18.5 && Rain)
				RainyOrMassy();
			else if(time>6.5 && time<18.5 && !Rain) {
				JustMassy();
			}
			else if (Rain) {
				JustRainy();
			}
			else {
				Regular();
			}
		}
		else {
			System.out.println("take your pills!\nwedon't have negative time!");
		}
	}
}
