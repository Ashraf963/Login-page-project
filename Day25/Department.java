package com.src;
public class Department 
{
private int deptid;
private String deptname;
public Department(int deptid, String deptname) {
	super();
	this.deptid = deptid;
	this.deptname = deptname;
}
Department(){}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
@Override
public String toString() {
	return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
}

}
