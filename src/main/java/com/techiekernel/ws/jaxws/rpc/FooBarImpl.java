package com.techiekernel.ws.jaxws.rpc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.techiekernel.ws.jaxws.rpc.FooBar")
public class FooBarImpl implements FooBar {

	@WebMethod
	public String callFooBar(String name) {
		// TODO Auto-generated method stub
		return "FooBar called by " + name;
	}

}
