/**
 * <p>Copyright (c) 2014 ZhaoQian.All Rights Reserved.</p>
 * @author <a href="zhaoqianjava@foxmail.com">ZhaoQian</a>
 */
package com.twltony.bo.repository;

import com.twltony.bo.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * testCreate
 *
 * @param
 * @return 
 * @throw 
 * 
 * @author Tony
 * @date 2017/3/2
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{

}
