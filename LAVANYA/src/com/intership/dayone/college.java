

package com.intership.dayone;

public class College extends student{

    private String CollegeName;
	private int CollegeCode;
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public int getCollegeCode() {
		return CollegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		CollegeCode = collegeCode;
	}
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + ", CollegeCode=" + CollegeCode + "]";
	}
}