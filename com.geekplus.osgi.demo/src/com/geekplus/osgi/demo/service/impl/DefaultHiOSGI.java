package com.geekplus.osgi.demo.service.impl;

import java.util.Date;

import com.geekplus.osgi.demo.dto.UserDTO;
import com.geekplus.osgi.demo.service.IHiOSGI;

public class DefaultHiOSGI implements IHiOSGI {

	@Override
	public UserDTO HiOSGI() {
		UserDTO user = new UserDTO();
		user.setUser_id(1);
		user.setUser_name("isaac");
		user.setStatus(true);
		return user;
	}

}
