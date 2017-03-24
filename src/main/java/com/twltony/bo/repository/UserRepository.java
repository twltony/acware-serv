/**
 * <p>Copyright (c) 2014 ZhaoQian.All Rights Reserved.</p>
 * @author <a href="zhaoqianjava@foxmail.com">ZhaoQian</a>
 */
package com.twltony.bo.repository;

import com.twltony.bo.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @param
 * @return 
 * @throw 
 * 
 * @author Tony
 * @date 2017/3/2
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>
{

}
