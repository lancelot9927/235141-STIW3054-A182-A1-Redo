public class IntTable4 implements Table4{
		 
	private Table4 table4;
	
	public void setTable4(Table4 table4) {
		this.table4 = table4;
	}
	
	@Override 
	public double step4(int num1,int num2, int num3, int num4, int num5, int num6, int num7, int num8) {
		return this.table4.step4(num1,num2,num3,  num4,  num5,  num6,  num7,  num8);
	}
}
