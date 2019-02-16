/**
 * 
 */
package com.cts.nw.onboarding.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.dao.ResourceDao;
import com.cts.nw.onboarding.service.RequesterService;

/**
 * @author 656579
 *
 */
@Service
public class RequesterServiceImpl implements RequesterService {

	@Autowired
    private ResourceDao resourceDao;
	
	@Override
	public void createResource(ResourceDetail resourceOnboardDO) {
		resourceDao.save(resourceOnboardDO);
	}

	@Override
	public void updateResource(ResourceDetail resourceOnboardDO) {
		resourceDao.update(resourceOnboardDO);
	}

	@Override
	public ResourceDetail editResource(ResourceDetail resourceOnboardDO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteResource(ResourceDetail resourceOnboardDO, int id) {
		resourceDao.delete(resourceOnboardDO, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResourceDetail findResource(ResourceDetail resourceOnboardDO, int id) {
		return resourceDao.get((Class<ResourceDetail>) resourceOnboardDO.getClass(),id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ResourceDetail> findAllResources(ResourceDetail resourceOnboardDO) {
		return (List<ResourceDetail>) resourceDao.getAll((Class<ResourceDetail>) resourceOnboardDO.getClass());
	}

}
