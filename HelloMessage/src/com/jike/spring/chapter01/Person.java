/**
 * 
 */
package com.jike.spring.chapter01;

/**
 * @author liukaibo
 *
 */
public class Person {
	private IHelloMessage iHelloMessage;

	/**
	 * @return the iHelloMessage
	 */
	public IHelloMessage getiHelloMessage() {
		return iHelloMessage;
	}

	/**
	 * @param iHelloMessage the iHelloMessage to set
	 */
	public void setiHelloMessage(IHelloMessage iHelloMessage) {
		this.iHelloMessage = iHelloMessage;
	}
	
	public String sayHello() {
		return this.iHelloMessage.sayHello();
	}
}