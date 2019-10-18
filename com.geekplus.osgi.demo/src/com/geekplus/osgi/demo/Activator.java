package com.geekplus.osgi.demo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.geekplus.osgi.demo.service.IHiOSGI;
import com.geekplus.osgi.demo.service.impl.DefaultHiOSGI;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World entering1...");
		context.registerService(IHiOSGI.class.getName(), new DefaultHiOSGI(), null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
