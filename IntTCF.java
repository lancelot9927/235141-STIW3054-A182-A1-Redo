public class IntTCF implements TCF{
		 
	private calTCF caltcf;
	
	public void setcalTCF(calTCF caltcf) {
		this.caltcf = caltcf;
	}
	
	@Override 
	public double calcuTCF(double num1) {
		return this.caltcf.calcuTCF(num1);
	}
}
