/**
 * 
 */
package com.jike.usermanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jike.usermanage.model.User;

/**
 * @author liukaibo
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}
