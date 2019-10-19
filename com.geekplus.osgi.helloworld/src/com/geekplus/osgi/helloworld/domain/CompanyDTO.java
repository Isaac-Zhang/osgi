package com.geekplus.osgi.helloworld.domain;

import com.geekplus.osgi.common.domain.IUserDTO;

public class CompanyDTO {

	private String companyName;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public IUserDTO getUser() {
		return user;
	}
	public void setUser(IUserDTO user) {
		this.user = user;
	}
	private IUserDTO user;
	
	
	public CompanyDTO() {
		System.out.println("=========Company Loaded=========");
	}
}
