package net.javaguides.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="users")
public class User {
   
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "first_name" )
	private String firstname;
	
	@Column(name = "last_name" )
	private String lastname;
	
	@Column(name = "employment_id" )
	private String employmentid;
	
	@Column(name = "start_date" )
	private String startdate;
	
	@Column(name = "end_date" )
	private String enddate;
	
	@Column(name = "designation" )
	private String designation;
	
	@Column(name = "department" )
	private String department;
	
	@Column(name = "status" )
	private String status;
	
	@Column(name = "DOB" )
	private String DOB;
	
	@Column(name = "Reporting_manager" )
	private String reportingmanager;
	
	@Column(name = "Gender" )
	private String gender;
	
	@Column(name = "Blood_group" )
	private String bloodgroup;
	
	@Column(name = "Address" )
	private String address;
	
	public User(String firstname, String lastname, String employmentid, String startdate, String enddate, String designation, String department, String status, String dob, String reportingmanager, String gender, String bloodgroup, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.employmentid = employmentid;
		this.startdate=startdate;
		this.enddate=enddate;
		this.designation=designation;
		this.DOB=DOB;
		this.department=department;
		this.status=status;
		this.reportingmanager=reportingmanager;
		this.gender=gender;
		this.bloodgroup=bloodgroup;
		this.address=address;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getReportingmanager() {
		return reportingmanager;
	}
	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmploymentid(String employmentid) {
		this.employmentid = employmentid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmploymentid() {
		return employmentid;
	}
	
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getEnddate() {
		// TODO Auto-generated method stub
		return enddate;
	}
	



}
