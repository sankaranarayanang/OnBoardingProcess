/**
 * 
 */
package com.cts.nw.onboarding.dao;

import java.util.Collection;

import com.cts.nw.onboarding.bo.ProjectDetail;

/**
 * @author 616550
 *
 */
public interface ProjectDetailDAO extends AbstractDAO<ProjectDetail> {
	public Collection<ProjectDetail> getProjectDetails(Class<ProjectDetail> projectDetail);
	public ProjectDetail findProject(Class<ProjectDetail> projectDetail, String projName);
	
}
