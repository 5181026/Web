package data;

public class Emp {
	String empName ,empPas,empSex;

	public Emp() {

	}

	public Emp(String empName,String empPas,String empSex) {
		this.empName = empName;
		this.empPas = empPas;
		this.empSex = empSex;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpPas(String empPas) {
		this.empPas = empPas;
	}

	public String getEmpPas() {
		return empPas;

	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getEmpSex () {
		return empSex;
	}


}
