package org.comp;

public class CompanyInfo {
public void comName( String compName) {
	System.out.println(" Company Name:" + compName);
	}
public void comName( int compDept) {
System.out.println(" Company Department:" + compDept);
}
public void comName( int compStaff , String compMail) {
	System.out.println(" Company Staff:" + compStaff);
System.out.println(" Company Mail:" + compMail);
}
public void comName(String compHead, int compDesk) {
	System.out.println(" Company Head:" + compHead);
	System.out.println(" Company Desk:" + compDesk);
}

public static void main(String[] args) {
	CompanyInfo emp = new CompanyInfo();
	emp.comName("ABC");
	emp.comName(35);
emp.comName(78, " arolin@gmail.com");
emp.comName(" Elen", 25);;
}}