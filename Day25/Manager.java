package com.src;
public class Manager
{
private int id;
private String name;
private Department department;
public Manager(int id, String name, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
public int getId() {
	return id;
}
public void setId(int string) {
	this.id = string;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Manager [id=" + id + ", name=" + name + ", department=" + department + "]";
}
Manager(){}

}
