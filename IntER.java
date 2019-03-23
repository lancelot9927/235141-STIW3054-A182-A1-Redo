public class IntER implements ER{
		 
	private calER calter;
	
	public void setcalER(calER calter) {
		this.calter = calter;
	}
	
	@Override 
	public double calcuER(int num1) {
		return this.calter.calcuER(num1);
	}
}
