
public class IntTable1 implements Table1{
		 
	private Table1 table1;
	
	public void setTable1(Table1 table1) {
		this.table1 = table1;
	}
	
	@Override 
	public double step1(int num1,int num2, int num3) {
		return this.table1.step1(num1,num2,num3);
	}
}
