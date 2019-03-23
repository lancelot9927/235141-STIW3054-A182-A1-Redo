
public class IntTable2 implements Table2{
		 
	private Table2 table2;
	
	public void setTable2(Table2 table2) {
		this.table2 = table2;
	}
	
	@Override 
	public double step2(int num1,int num2, int num3) {
		return this.table2.step2(num1,num2,num3);
	}
}
