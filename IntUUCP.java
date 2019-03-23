public class IntUUCP implements UUCP{
		 
	private calUUCP cal;
	
	public void setcalUUCP(calUUCP cal) {
		this.cal = cal;
	}
	
	@Override 
	public double calcuUUCP(double num1,double num2) {
		return this.cal.calcuUUCP(num1,num2);
	}
}
