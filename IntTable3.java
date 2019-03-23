public class IntTable3 implements Table3{
		 
	private Table3 table3;
	
	public void setTable3(Table3 table3) {
		this.table3 = table3;
	}
	
	@Override 
	public double step3(int num1,int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10, int num11, int num12, int num13) {
		return this.table3.step3(num1,num2,num3,  num4,  num5,  num6,  num7,  num8,  num9,  num10,  num11,  num12,  num13);
	}
}
