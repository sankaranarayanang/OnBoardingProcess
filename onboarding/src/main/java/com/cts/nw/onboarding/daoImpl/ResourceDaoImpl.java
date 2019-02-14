package com.cts.nw.onboarding.daoImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.nw.onboarding.bo.ResourceDetail;
import com.cts.nw.onboarding.dao.BaseJPA;
import com.cts.nw.onboarding.dao.ResourceDao;
import com.cts.nw.onboarding.exception.OnBoardingException;

/**
 * @author 656579
 *
 */
@Repository
public class ResourceDaoImpl extends BaseJPA<ResourceDetail> implements ResourceDao {

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
	public void save(ResourceDetail domainObject) {
		try {
			entityManager.persist(domainObject);
		} catch (Exception e) {
			throw new OnBoardingException(
					"Exception saving " + domainObject.getClass().getName() + " " + e.getMessage(), e);
		}
	}

	@Transactional
	public void update(ResourceDetail domainObject) {
		try {
			entityManager.merge(domainObject);

		} catch (Exception e) {
			throw new OnBoardingException(
					"Exception in updating " + domainObject.getClass().getName() + " " + e.getMessage(), e);
		}
	}

	@Override
	public void saveAll(Collection<ResourceDetail> domainObjects) {
		super.saveAll(domainObjects);
	}

	@Transactional
	public ResourceDetail get(Class<ResourceDetail> domainClass, int id) {
		try {
			return entityManager.find(domainClass, new Integer(id));
		} catch (Exception e) {
			throw new OnBoardingException("Exception getting " + domainClass.getName() + " with id = " + id, e);
		}
	}

	@Transactional
	public List<ResourceDetail> get(Class<ResourceDetail> domainClass, ResourceDetail domainObject) {
		List<ResourceDetail> results = new ArrayList<ResourceDetail>();

		@SuppressWarnings("rawtypes")
		Map props = null;

		try {
			props = BeanUtils.describe(domainObject);
		} catch (Exception e) {
			return null;
		}

		String queryStr = "select c from " + domainObject.getClass().getSimpleName() + " c where ";
		if (props != null) {
			for (Object key : props.keySet()) {
				if (!key.equals("class") && !(key.equals("updatedDate"))) {
					Object value = props.get(key);
					if (value != null && !(value.equals("0")) && !(value.equals("0.0"))) {
						try {
							ConvertUtils.convert(props.get(key),
									PropertyUtils.getPropertyType(domainObject, key.toString()));
							queryStr += "c." + key + " =:" + key + " and ";
						} catch (Exception e) {
						}
					}
				}
			}

			queryStr = queryStr.substring(0, queryStr.indexOf("and"));
			Query query = entityManager.createQuery(queryStr);
			for (Object key : props.keySet()) {
				if (!key.equals("class")) {
					if (props.get(key) != null) {
						try {
							Object obj = ConvertUtils.convert(props.get(key),
									PropertyUtils.getPropertyType(domainObject, key.toString()));
							query.setParameter(key.toString(), obj);
						} catch (Exception e) {
						}
					}
				}
			}

			@SuppressWarnings("unchecked")
			List<ResourceDetail> resultList = query.getResultList();
			if (resultList != null) {
				results.addAll(resultList);
			}
		}

		return results;
	}

	@Override
	public Collection<ResourceDetail> getAll(Class<ResourceDetail> domainClass) {
		TypedQuery<ResourceDetail> query = (TypedQuery<ResourceDetail>) entityManager
				.createNamedQuery("ResourceOnboard.findAll");

		try {
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Transactional
	public void delete(ResourceDetail domainObject, Integer id) {
		// TODO Auto-generated method stub
		try {
			domainObject = (ResourceDetail) entityManager.getReference(domainObject.getClass(), id);
			entityManager.remove(domainObject);
		} catch (Exception e) {
			throw new OnBoardingException("Exception deleting " + domainObject.getClass().getName(), e);
		}
	}

	@Override
	public void deleteAll(Collection<ResourceDetail> domainObjectList) {
		super.deleteAll(domainObjectList);
	}

	@Override
	public List executeStoredProc(String storedProcName, String[] fieldArray, ResourceDetail domainObject) {
		return super.executeStoredProc(storedProcName, fieldArray, domainObject);
	}

	@Override
	public List executeStoredProc(String storedProcName, String[] fieldArray, HashMap parameterMap) {
		return super.executeStoredProc(storedProcName, fieldArray, parameterMap);
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List executeQuery(String queryName, String[] fieldArray, HashMap parameterMap) {
		try {
			List results = new ArrayList();
			System.out.println("entityManager:" + queryName);
			Query query = entityManager.createNativeQuery(queryName);
			List<ResourceDetail> resultlist = new ArrayList<ResourceDetail>();

			int i = 1;
			for (Object key : parameterMap.keySet()) {
				System.out.println("key:" + key);
				Object value = parameterMap.get(key);
				if (value != null) {
					try {
						query.setParameter(i, value);
						i++;
					} catch (Exception e) {
					}
				}
			}
			if (fieldArray == null) {
				int result = query.executeUpdate();
			} else {
				resultlist = query.getResultList();
			}

			if ((resultlist.size() > 0) && (fieldArray != null)) {
				Object[][] requestobj = (Object[][]) resultlist.toArray(new Object[resultlist.size()][]);

				System.out.println("requestobj:" + requestobj);
				for (int k = 0; k < requestobj.length; k++) {
					HashMap resultmap = new HashMap();
					for (int j = 0; j < requestobj[k].length; j++) {
						resultmap.put(fieldArray[j], requestobj[k][j]);
					}
					results.add(resultmap);
				}
			}
			return results;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OnBoardingException("Exception executing procedure" + e);

		}
	}

	public ResourceDetail executeNativeQuery(Class<ResourceDetail> domainClass, String userName) {
		return null;
	}

}
