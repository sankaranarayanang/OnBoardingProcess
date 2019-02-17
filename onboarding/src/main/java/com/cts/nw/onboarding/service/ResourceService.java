package com.cts.nw.onboarding.service;

import java.util.List;

import com.cts.nw.onboarding.bo.ResourceDetail;


/**
 * @author 656579
 *
 */
public interface ResourceService {
	public void createResource(ResourceDetail resourceOnboardDO);
	public void updateResource(ResourceDetail resourceOnboardDO);
	void deleteResource(ResourceDetail resourceOnboardDO, int id);
	public List<ResourceDetail> findAllResources(ResourceDetail resourceOnboardDO);
	ResourceDetail findResource(ResourceDetail resourceOnboardDO, int id);
	
}
