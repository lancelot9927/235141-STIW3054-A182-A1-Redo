public class IntSzUC implements SzUC{
		 
	private calSzUC cal;
	
	public void setcalSzUC(calSzUC cal) {
		this.cal = cal;
	}
	
	@Override 
	public double calcuSzUC(double num1,double num2) {
		return this.cal.calcuSzUC(num1,num2);
	}
}
