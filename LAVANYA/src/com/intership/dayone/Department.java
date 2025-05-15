package com.intership.dayone;

public class Department extends College{
       private String DepartmentName;
	   private String DepartmentHod;
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getDepartmentHod() {
		return DepartmentHod;
	}
	public void setDepartmentHod(String departmentHod) {
		DepartmentHod = departmentHod;
	}
	@Override
	public String toString() {
		return "Department [DepartmentName=" + DepartmentName + ", DepartmentHod=" + DepartmentHod + "]";
	}
	   
	   
}
