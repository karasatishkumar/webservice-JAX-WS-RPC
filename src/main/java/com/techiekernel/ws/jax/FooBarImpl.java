package com.techiekernel.ws.jax;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.techiekernel.ws.jax.FooBar")
public class FooBarImpl implements FooBar {

	@Override
	@WebMethod
	public String callFooBar(String name) {
		// TODO Auto-generated method stub
		return "FooBar called by " + name;
	}

}
