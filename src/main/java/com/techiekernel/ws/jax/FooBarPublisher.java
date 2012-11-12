package com.techiekernel.ws.jax;

import javax.xml.ws.Endpoint;

/**
 * End point publisher
 * @author satish
 *
 */
public class FooBarPublisher {
	public static void main(String[] args) {
		System.out.println("main called");
		Endpoint.publish("http://localhost:8080/webservice-JAX-WS/foobar", new FooBarImpl());
	}
}
