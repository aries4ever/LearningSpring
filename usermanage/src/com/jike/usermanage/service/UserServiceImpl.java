/**
 * 
 */
package com.jike.usermanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.UserRepository;

/**
 * @author liukaibo
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	/* (non-Javadoc)
	 * @see com.jike.usermanage.service.UserService#addUser(com.jike.usermanage.model.User)
	 */
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	/* (non-Javadoc)
	 * @see com.jike.usermanage.service.UserService#updateUser(com.jike.usermanage.model.User)
	 */
	@Override
	public User updateUser(User user) throws UserNotFound {
		User userUpdate = userRepository.findOne(user.getId());
		if (userUpdate == null) {
			throw new UserNotFound();
		} 
		
		if (user.getName() != null) {
			userUpdate.setName(user.getName());
		}
		
		if (user.getPhone() != null) {
			userUpdate.setPhone(user.getPhone());
		}
		
		if (user.getAddress() != null) {
			userUpdate.setAddress(user.getAddress());
		}
		
		userRepository.save(userUpdate);
		
		return userUpdate;
	}

	/* (non-Javadoc)
	 * @see com.jike.usermanage.service.UserService#deleteUser(int)
	 */
	@Override
	public User deleteUser(int id) throws UserNotFound {
		User userDelete = userRepository.findOne(id);
		if (userDelete == null) {
			throw new UserNotFound();
		} else {
			userRepository.delete(id);
		}
		return userDelete;
	}

	/* (non-Javadoc)
	 * @see com.jike.usermanage.service.UserService#getUser(int)
	 */
	@Override
	public User getUser(int id) {
		return userRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.jike.usermanage.service.UserService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}