package com.cts.nw.onboarding.service;

import java.util.List;

import com.cts.nw.onboarding.bo.ResourceDetail;


/**
 * @author 656579
 *
 */
public interface ProcessService {
	public void updateResource(ResourceDetail resourceOnboardDO);
	public List<ResourceDetail> findAllResources(ResourceDetail resourceOnboardDO,String processor);
	ResourceDetail findResource(ResourceDetail resourceOnboardDO, int id);
	
}
