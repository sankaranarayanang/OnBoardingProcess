package com.cts.nw.onboarding.service;

import java.util.List;

import com.cts.nw.onboarding.bo.ResourceDetail;


/**
 * @author 656579
 *
 */
public interface RequesterService {
	public void createResource(ResourceDetail resourceOnboardDO);
	public void updateResource(ResourceDetail resourceOnboardDO);
	public ResourceDetail editResource(ResourceDetail resourceOnboardDO);
	//public void deleteResource(ResourceDetail resourceOnboardDO);
	//public ResourceDetail findResource(ResourceDetail resourceOnboardDO);
	public List<ResourceDetail> findAllResources(ResourceDetail resourceOnboardDO);
	ResourceDetail findResource(ResourceDetail resourceOnboardDO, int id);
	void deleteResource(ResourceDetail resourceOnboardDO, int id);
}
