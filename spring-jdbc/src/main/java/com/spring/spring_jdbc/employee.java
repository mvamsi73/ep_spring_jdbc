package com.spring.spring_jdbc;

public class employee 
{
	@Override
	public String toString() {
		return "employee [empno=" + empno + ", empname=" + empname + "]";
	}
	private int empno;
	private String empname;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	

}
