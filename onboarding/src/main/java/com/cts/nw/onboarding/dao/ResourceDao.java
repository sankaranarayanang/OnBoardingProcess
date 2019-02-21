package com.cts.nw.onboarding.dao;

import java.util.Collection;

import com.cts.nw.onboarding.bo.ResourceDetail;

/**
 * @author 656579
 *
 */
public interface ResourceDao extends AbstractDAO<ResourceDetail>{
	public Collection<ResourceDetail> getAlltoProcess(Class<ResourceDetail> domainClass,String processorName);
	public Collection<ResourceDetail> getAlltoTerminate(Class<ResourceDetail> domainClass);
}
