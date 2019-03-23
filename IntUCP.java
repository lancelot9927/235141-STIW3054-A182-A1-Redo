public class IntUCP implements UCP{
		 
	private calUCP cal;
	
	public void setcalUCP(calUCP cal) {
		this.cal = cal;
	}
	
	@Override 
	public double calcuUCP(double num1,double num2) {
		return this.cal.calcuUCP(num1,num2);
	}
}
