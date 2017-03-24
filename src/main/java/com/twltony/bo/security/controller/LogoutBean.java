package com.twltony.bo.security.controller;

import com.twltony.bo.security.model.User;
import com.twltony.bo.security.shiro.support.JpaRealmRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author ZhaoQian
 * @date: 2014年7月29日
 */
@Controller
public class LogoutBean
{
	private static final Logger log = LoggerFactory.getLogger(LogoutBean.class);
	
	@Autowired
    JpaRealmRepository jpaRealmRepository;

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout()
	{
		Subject subject=SecurityUtils.getSubject();
		subject.logout();
		return "/login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(Model model, HttpServletRequest request)
	{
		Subject subject=SecurityUtils.getSubject();

		try
		{
			subject.logout();

		} catch (Exception e)
		{
			model.addAttribute("message", "注销出错!");
			log.info("注销出错!"+e);
		}
		return "/login";
	}
}
