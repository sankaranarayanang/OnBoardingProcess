/**
 * 
 */
package com.cts.nw.onboarding.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.dao.ResourceDao;
import com.cts.nw.onboarding.service.TerminateService;

/**
 * @author 656579
 *
 */
@Service
public class TerminateServiceImpl implements TerminateService {

	@Autowired
    private ResourceDao resourceDao;
	
	@Override
	public void updateResource(ResourceDetail resourceOnboardDO) {
		resourceDao.update(resourceOnboardDO);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ResourceDetail findResource(ResourceDetail resourceOnboardDO, int id) {
		return resourceDao.get((Class<ResourceDetail>) resourceOnboardDO.getClass(),id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ResourceDetail> findAllResources(ResourceDetail resourceOnboardDO) {
		return (List<ResourceDetail>) resourceDao.getAlltoTerminate((Class<ResourceDetail>) resourceOnboardDO.getClass());
	}

}
