package reflection;

/**
 * Created by TalekO01 on 7/16/2018
 */

public class Child extends Parent{
	
	private String firstString;
	
	protected String anotherString;
	
	public String getFirstString() {
		return firstString;
	}
	
	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	
	public String getAnotherString() {
		return anotherString;
	}
	
	public void setAnotherString(String anotherString) {
		this.anotherString = anotherString;
	}
}
