package com.techiekernel.ws.jaxws.rpc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class FooBarClient {
	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://localhost:8080/webservice-JAX-WS/foobar?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://rpc.jaxws.ws.techiekernel.com/",
				"FooBarImplService");

		Service service = Service.create(url, qname);

		FooBar foobar = service.getPort(FooBar.class);

		System.out.println(foobar.callFooBar("Techie Kernel"));
	}
}
