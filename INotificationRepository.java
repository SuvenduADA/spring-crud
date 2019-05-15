package com.ada.ecs.underwriting.repo;

import com.ada.ecs.underwriting.data.UserNotification;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Suvendu Pramanick on 20-04-2019.
 */

@Repository
public interface INotificationRepository extends CrudRepository<UserNotification, Long> {
	@Query(nativeQuery = true,value ="select * from USER_NOTIFICATION u where u.USER_ID=:USER_ID")
	public List<UserNotification> getNotificationByUserID(@Param(value = "USER_ID")String USER_ID);

  }
