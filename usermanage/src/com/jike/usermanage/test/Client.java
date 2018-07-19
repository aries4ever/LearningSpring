/**
 * 
 */
package com.jike.usermanage.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jike.usermanage.model.User;

import com.jike.usermanage.service.UserService;


/**
 * @author liukaibo
 *
 */
public class Client {
	
	public static void printUser(User user) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("id=" + user.getId());
		stringBuilder.append("name=" + user.getName());
		stringBuilder.append("Phone=" + user.getPhone());
		stringBuilder.append("Address=" + user.getAddress());
		System.out.println(stringBuilder.toString());
	}
	
	public static void testList(UserService userService) {
		List<User> users = userService.getUsers();
		for	(int i = 0; i < users.size(); i++) {
			printUser(users.get(i));
		}
	}
	
	public static void testUpdate(UserService userService) {
		
	}
	
	public static void testAdd(UserService userService) {
		
	}
	
	public static void testDelete(UserService userService) {
		
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)ac.getBean("userService");
		testList(userService);
	}

}
