/**
 * <p>Copyright (c) 2014 ZhaoQian.All Rights Reserved.</p>
 * @author <a href="zhaoqianjava@foxmail.com">ZhaoQian</a>
 */
package com.twltony.bo.security.shiro.support;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.twltony.bo.security.model.User;
import com.twltony.bo.security.model.Role;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ZhaoQian
 * @date: 2014年7月30日
 */
@Repository
public class JpaRealmRepository
{
	
	@PersistenceContext
	EntityManager em;
	
	public User findUserByName(String username) {

		String jpql="select u from User u where u.name=:name";
		List<User> results = this.em.createQuery(jpql, User.class).setParameter("name", username).setMaxResults(1)
						.getResultList();
		if ( !results.isEmpty() )
		{
			return results.get(0);
		}
		return null;
	}

	public void mergeRole(Role role) {

		this.em.merge(role);
	}

	public User loadUser(Object id) {

		return this.em.find(User.class, id);
	}

	public User mergeUser(User user) {

		return this.em.merge(user);
	}
}
