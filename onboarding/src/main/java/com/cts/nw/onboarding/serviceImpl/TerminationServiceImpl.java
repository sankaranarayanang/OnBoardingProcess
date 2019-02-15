/**
 * 
 */
package com.cts.nw.onboarding.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.dao.ResourceDao;
import com.cts.nw.onboarding.service.TerminationService;

/**
 * @author 656579
 *
 */
public class TerminationServiceImpl implements TerminationService {
	
	@Autowired
    private ResourceDao resourceDao;
	
	@Override
	public void updateResource(ResourceDetail resourceOnboardDO) {
		resourceDao.update(resourceOnboardDO);
	}

}