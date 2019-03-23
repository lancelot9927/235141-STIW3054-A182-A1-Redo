public class IntEF implements EF{
		 
	private calEF caltef;
	
	public void setcalEF(calEF caltef) {
		this.caltef = caltef;
	}
	
	@Override 
	public double calcuEF(double num1) {
		return this.caltef.calcuEF(num1);
	}
}
