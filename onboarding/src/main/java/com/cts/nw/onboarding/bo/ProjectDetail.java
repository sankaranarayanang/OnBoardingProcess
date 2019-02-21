/**
 * 
 */
package com.cts.nw.onboarding.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 656579
 *
 */
@Entity
@Table(name = "ProjectDetails")
@NamedQueries({
    @NamedQuery(name = "ProjectDetail.findAllProject", query = "SELECT r FROM ProjectDetail r"),
    @NamedQuery(name = "ProjectDetail.findProject", query = "SELECT r FROM ProjectDetail r where r.projectName = :projectName ")
})
public class ProjectDetail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Column(name="ProjectName")
	@NotNull @NotBlank @NotEmpty
	private String projectName;
	
	@Id
	@Column(name="ProjectId")
	private Integer projectId;
	
	@Column(name="RequestorId")
	private Integer requesterID;
	
	@Column(name="RequestorName")
	@NotNull @NotBlank @NotEmpty
	private String requesterName;
	
	@Column(name="ProcessorId")
	private Integer approverID;
	
	@Column(name="ProcessorName")
	@NotNull @NotBlank @NotEmpty
	private String approverName;
	
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the requesterID
	 */
	public Integer getRequesterID() {
		return requesterID;
	}
	/**
	 * @param requesterID the requesterID to set
	 */
	public void setRequesterID(Integer requesterID) {
		this.requesterID = requesterID;
	}
	/**
	 * @return the requesterName
	 */
	public String getRequesterName() {
		return requesterName;
	}
	/**
	 * @param requesterName the requesterName to set
	 */
	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}
	/**
	 * @return the approverID
	 */
	public Integer getApproverID() {
		return approverID;
	}
	/**
	 * @param approverID the approverID to set
	 */
	public void setApproverID(Integer approverID) {
		this.approverID = approverID;
	}
	/**
	 * @return the approverName
	 */
	public String getApproverName() {
		return approverName;
	}
	/**
	 * @param approverName the approverName to set
	 */
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
	

}
