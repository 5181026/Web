package Lesson;

import java.util.ArrayList;

import data.Emp;

public class AddBean {

	String name;
	String pas;
	String sex;
	ArrayList<Emp> emps;
	public AddBean() {
		emps = new ArrayList<>();
		Emp aEmp = new Emp("aaa","aaa","1");
		emps.add(aEmp);
		aEmp = new Emp("bbb","bbb","0");
		emps.add(aEmp);

	}
	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getPas() {
		return pas;
	}

	public void setPas(String pas) {
		this.pas = pas;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void empAdd() {
		Emp aEmp = new Emp(name,pas,sex);
		emps.add(aEmp);
	}
	public ArrayList<Emp> getEmps(){
		return emps;
	}
}

