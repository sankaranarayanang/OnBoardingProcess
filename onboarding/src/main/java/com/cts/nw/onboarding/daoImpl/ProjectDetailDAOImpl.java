/**
 * 
 */
package com.cts.nw.onboarding.daoImpl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.nw.onboarding.bo.ProjectDetail;
import com.cts.nw.onboarding.dao.BaseJPA;
import com.cts.nw.onboarding.dao.ProjectDetailDAO;
import com.cts.nw.onboarding.exception.OnBoardingException;

/**
 * @author 616550
 *
 */
@Repository
public class ProjectDetailDAOImpl extends BaseJPA<ProjectDetail> implements ProjectDetailDAO {

	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Transactional
	public ProjectDetail get(Class<ProjectDetail> domainClass, int id) {
		try {
			return entityManager.find(domainClass, new Integer(id));
		} catch (Exception e) {
			throw new OnBoardingException("Exception getting " + domainClass.getName() + " with id = " + id, e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<ProjectDetail> getAll(Class<ProjectDetail> domainClass) {
		TypedQuery<ProjectDetail> query = (TypedQuery<ProjectDetail>) entityManager
				.createNamedQuery("ProjectDetail.findAllProject");
		try {
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ProjectDetail findProject(Class<ProjectDetail> projectDetail, String projectName) {
		TypedQuery<ProjectDetail> query = (TypedQuery<ProjectDetail>) entityManager
				.createNamedQuery("ProjectDetail.findProject");
		query.setParameter("projectName", projectName);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	@Override
	public ProjectDetail executeNativeQuery(Class<ProjectDetail> domainClass, String userName) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<ProjectDetail> getProjectDetails(Class<ProjectDetail> projectDetail) {
		TypedQuery<ProjectDetail> query = (TypedQuery<ProjectDetail>) entityManager
				.createNamedQuery("ProjectDetail.findProject");
		try {
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	
}
