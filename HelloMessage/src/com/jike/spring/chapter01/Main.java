/**
 * 
 */
package com.jike.spring.chapter01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * @author liukaibo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("helloMessage.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Person person = (Person)beanFactory.getBean("person");
		String string = person.sayHello();
		System.out.println("The person is currently saying " + string);
	}

}
