package com.cts.nw.onboarding.bo;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author 656579
 *
 */
@Entity
@Table(name = "RESOURCESMASTER")
@NamedQueries({
    @NamedQuery(name = "ResourceDetail.findAll", query = "SELECT r FROM ResourceDetail r")
})
public class ResourceDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EmployeeId")
	private Integer empId;
	
	@Column(name="EmployeeName")
	private String empFullName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="PassportNumber")
	private String passportNo;
	
	@Column(name="TeamName")
	private String teamName;
	
	@Column(name="ProjectName")
	private String projName;
	
	@Column(name="ProjectId")
	private Integer projId;
	
	@Column(name="Requester")
	private String requester;
	
	@Column(name="Processor")
	private String processor;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="StartDate")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="EndDate")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name="NationwideId")
	private String nationWideId;
	
	@Column(name="NationwideIdCreatedDate")
	@Temporal(TemporalType.DATE)
	private Date nationWideIdDate;
	
	@Column(name="Comments")
	private String comments;
	
	@Column(name="ApprovalStatus")
	private String status;
	
	@Column(name="TerminatedStatus")
	private String terminated;

	@Column(name="TerminatedDate")
	private Date terminatedDate;

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * @return the empFullName
	 */
	public String getEmpFullName() {
		return empFullName;
	}

	/**
	 * @param empFullName the empFullName to set
	 */
	public void setEmpFullName(String empFullName) {
		this.empFullName = empFullName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the passportNo
	 */
	public String getPassportNo() {
		return passportNo;
	}

	/**
	 * @param passportNo the passportNo to set
	 */
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the projName
	 */
	public String getProjName() {
		return projName;
	}

	/**
	 * @param projName the projName to set
	 */
	public void setProjName(String projName) {
		this.projName = projName;
	}

	/**
	 * @return the projId
	 */
	public Integer getProjId() {
		return projId;
	}

	/**
	 * @param projId the projId to set
	 */
	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	/**
	 * @return the requester
	 */
	public String getRequester() {
		return requester;
	}

	/**
	 * @param requester the requester to set
	 */
	public void setRequester(String requester) {
		this.requester = requester;
	}

	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the nationWideId
	 */
	public String getNationWideId() {
		return nationWideId;
	}

	/**
	 * @param nationWideId the nationWideId to set
	 */
	public void setNationWideId(String nationWideId) {
		this.nationWideId = nationWideId;
	}

	/**
	 * @return the nationWideIdDate
	 */
	public Date getNationWideIdDate() {
		return nationWideIdDate;
	}

	/**
	 * @param nationWideIdDate the nationWideIdDate to set
	 */
	public void setNationWideIdDate(Date nationWideIdDate) {
		this.nationWideIdDate = nationWideIdDate;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the terminated
	 */
	public String getTerminated() {
		return terminated;
	}

	/**
	 * @param terminated the terminated to set
	 */
	public void setTerminated(String terminated) {
		this.terminated = terminated;
	}

	/**
	 * @return the terminatedDate
	 */
	public Date getTerminatedDate() {
		return terminatedDate;
	}

	/**
	 * @param terminatedDate the terminatedDate to set
	 */
	public void setTerminatedDate(Date terminatedDate) {
		this.terminatedDate = terminatedDate;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
