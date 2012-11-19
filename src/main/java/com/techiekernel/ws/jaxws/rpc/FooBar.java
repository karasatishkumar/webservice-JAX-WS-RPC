package com.techiekernel.ws.jaxws.rpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Service end point interface
 * @author satish
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface FooBar {
	@WebMethod
	String callFooBar(String name);
}
