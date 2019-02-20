/**
 * 
 */
package com.cts.nw.onboarding.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.nw.onboarding.bo.ProjectDetail;
import com.cts.nw.onboarding.dao.ProjectDetailDAO;
import com.cts.nw.onboarding.service.ProjectService;

/**
 * @author 616550
 *
 */
@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
    private ProjectDetailDAO projectDAO;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProjectDetail> findAllProjects(ProjectDetail projectDetail) {
		return (List<ProjectDetail>) projectDAO.getAll((Class<ProjectDetail>) projectDetail.getClass());
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProjectDetail findProject(ProjectDetail projectDetailDO, String projName) {
		return (ProjectDetail) projectDAO.findProject((Class<ProjectDetail>) projectDetailDO.getClass(), projName);
	}

}
