public class IntManhours implements manhours{
		 
	private calManhours cal;
	
	public void setcalManhours(calManhours cal) {
		this.cal = cal;
	}
	
	@Override 
	public double calcumanhours(double num1,double num2) {
		return this.cal.calcumanhours(num1,num2);
	}
}
