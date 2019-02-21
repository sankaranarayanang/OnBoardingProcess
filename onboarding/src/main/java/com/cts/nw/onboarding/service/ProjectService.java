/**
 * 
 */
package com.cts.nw.onboarding.service;

import java.util.List;

import com.cts.nw.onboarding.bo.ProjectDetail;

/**
 * @author 616550
 *
 */
public interface ProjectService {
	public List<ProjectDetail> findAllProjects(ProjectDetail projectDetailDO);
	public ProjectDetail findProject(ProjectDetail projectDetailDO, String projName);
	public void createProject(ProjectDetail project);
	public void deleteProject(ProjectDetail project, int id);
	public void updateProject(ProjectDetail project);
	public Object findProjectwithID(ProjectDetail project, int id);
}
