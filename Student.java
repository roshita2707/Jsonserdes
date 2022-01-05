package jsonserdes;

public class Student {
	
	String sId,sName,dept;
	double agg;
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getAgg() {
		return agg;
	}
	public void setAgg(double agg) {
		this.agg = agg;
	}

}
